package uy.com.cvaucher.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.HorarioLaboral;
import uy.com.cvaucher.services.interfaces.HorarioLaboralInt;

@Controller
@RequestMapping("/horarioLaboral")
public class HorarioLaboralController {
	private final HorarioLaboralInt horarioLaboralService;
	
	@Autowired
	public HorarioLaboralController(HorarioLaboralInt horarioLaboralService){
		this.horarioLaboralService = horarioLaboralService;
	}
	
	@RequestMapping(value ="/horarioLaboral",params ="insert", method = RequestMethod.GET)
	public String showInsertHorarioLaboral(Model model, HorarioLaboral horarioLaboral){
		
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		
		model.addAttribute(new HorarioLaboral());
		model.addAttribute("user",user);
		model.addAttribute(this.showDate());
		model.addAttribute(this.showHora());
		model.addAttribute("muestroHorarioLaboral",horarioLaboralService.showHorarioLaboral(horarioLaboral));
		return "horarioLaboral/horarioLaboral";
	}
	
	@RequestMapping(value ="/horarioLaboral",params ="insert", method = RequestMethod.POST)
	public String insertHorarioLaboral(Model model, @Valid HorarioLaboral horarioLaboral,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
					getPrincipal();
			
			model.addAttribute(new HorarioLaboral());
			model.addAttribute("user",user);
			model.addAttribute("muestroHorarioLaboral",horarioLaboralService.showHorarioLaboral(horarioLaboral));
			return "horarioLaboral/horarioLaboral";
		}
		
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		model.addAttribute(new HorarioLaboral());
		model.addAttribute("user",user);
		model.addAttribute("muestroHorarioLaboral",horarioLaboralService.showHorarioLaboral(horarioLaboral));
		horarioLaboralService.insertarHorarioLaboral(horarioLaboral);
		return "horarioLaboral/horarioLaboral";
	}
	
	private String showDate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date hoy = new Date();
		String fecha = dateFormat.format(hoy);
		return fecha;
	}
	
	private String showHora(){
		SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm.ss");
		Date hoy = new Date();
		String hora = horaFormat.format(hoy);
		return hora;
	}
}
