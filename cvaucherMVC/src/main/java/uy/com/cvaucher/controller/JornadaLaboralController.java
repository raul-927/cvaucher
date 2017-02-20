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

import uy.com.cvaucher.services.domain.JornadaLaboral;
import uy.com.cvaucher.services.interfaces.JornadaLaboralInt;

@Controller
@RequestMapping("/jornadaLaboral")
public class JornadaLaboralController {
	private final JornadaLaboralInt jornadaLaboralService;
	
	@Autowired
	public JornadaLaboralController(JornadaLaboralInt jornadaLaboralService){
		this.jornadaLaboralService = jornadaLaboralService;
	}
	
	@RequestMapping(value ="/jornadaLaboral",params ="insert", method = RequestMethod.GET)
	public String showInsertJornadaLaboral(Model model, JornadaLaboral jornadaLaboral){
		
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		
		model.addAttribute(new JornadaLaboral());
		model.addAttribute("user",user);
		model.addAttribute("muestroJornadaLaboral",jornadaLaboralService.showJornadaLaboral(jornadaLaboral));
		return "jornadaLaboral/jornadaLaboral";
	}
	
	@RequestMapping(value ="/jornadaLaboral",params ="insert", method = RequestMethod.POST)
	public String insertJornadaLaboral(Model model, @Valid JornadaLaboral jornadaLaboral,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
					getPrincipal();
			
			model.addAttribute(new JornadaLaboral());
			model.addAttribute("user",user);
			model.addAttribute("muestroJornadaLaboral",jornadaLaboralService.showJornadaLaboral(jornadaLaboral));
			return "jornadaLaboral/jornadaLaboral";
		}
		
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		model.addAttribute(new JornadaLaboral());
		model.addAttribute("user",user);
		model.addAttribute("muestroJornadaLaboral",jornadaLaboralService.showJornadaLaboral(jornadaLaboral));
		jornadaLaboralService.insertarJornadaLaboral(jornadaLaboral);
		return "jornadaLaboral/jornadaLaboral";
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
