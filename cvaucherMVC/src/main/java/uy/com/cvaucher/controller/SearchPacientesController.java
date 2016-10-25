package uy.com.cvaucher.controller;

import java.util.Calendar;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uy.com.cvaucher.interfaces.SearchPacientesControllerInt;
import uy.com.cvaucher.services.clases.SearchPacientes;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.Calendario;
import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.interfaces.DireccionInt;
import uy.com.cvaucher.services.interfaces.HistoriaClinicaInt;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.SeguimientoPacientesInt;
import uy.com.cvaucher.services.interfaces.SesionesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;


@Controller
@Secured({"ROLE_USER", "ROLE_ADMIN"})
@RequestMapping("/pacsearch")
public class SearchPacientesController implements SearchPacientesControllerInt
{
	
	private final PacientesInt 	pacientesServices;
	
	@Autowired
	public SearchPacientesController(PacientesInt pacientesServices, 
			  DireccionInt direccionServices, 
			  SesionesInt sesionesServices,
			  HistoriaClinicaInt historiaClinicaServices, 
			  SeguimientoPacientesInt seguimientoPacientesServices,
			  TratamientoInt tratamientoServices,
			  AgendaInt agendaServices){

		this.pacientesServices 	= pacientesServices;

}
	
	@RequestMapping(method = RequestMethod.GET)
	public String ShowSearchPacientes(Model model)
	{
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
		getPrincipal();
		System.out.println("Bien venido "+user.getUsername()+ ", usted tiene el rol "+user.getAuthorities() +", Su Password es = "+user.getPassword());
		model.addAttribute("userName",user.getUsername());
		model.addAttribute("userRole",user.getAuthorities());
		model.addAttribute(new Pacientes());
		model.addAttribute(new SearchPacientes());
		model.addAttribute("pac", this.pacientesServices.findAllPacientes());
		model.addAttribute(new Calendario());
		//model.addAttribute("pacientesS",this.pacientesSearch.values());
		
		return "pacientes/searchPacientes";
	}
	
	@RequestMapping(value ="/prueba", method = RequestMethod.POST)
	public void ShowSearchPacientes2(Model model){
		System.out.println("Esto es una prueba");
	}
	
	@RequestMapping(value ="/search",method = RequestMethod.POST)
	public String searchPacientes(Model model,@Valid SearchPacientes searchPacientes, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			
			return "pacientes/searchPacientes";
		}
		
		//model.addAttribute(new Pacientes());
		model.addAttribute(new Calendario());
		model.addAttribute(new SearchPacientes());
		model.addAttribute("pac", this.pacientesServices.findPacientes(searchPacientes));
		return "pacientes/searchPacientes";
	}
	@RequestMapping(value ="/calendario",params ="semana", method = RequestMethod.GET)
	public String showCalendario(Model model){
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().
				getAuthentication().
				getPrincipal();
		model.addAttribute(new Calendario());
		model.addAttribute("userName",user.getUsername());
		model.addAttribute("userRole",user.getAuthorities());
		model.addAttribute(new Pacientes());
		model.addAttribute(new SearchPacientes());
		model.addAttribute("pac", this.pacientesServices.findAllPacientes());
		Calendar calendario = Calendar.getInstance();
		int enero = calendario.MONTH;
		return "calendario/Semana";
	}

}
