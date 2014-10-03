package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.clases.SearchPacientes;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.interfaces.DireccionInt;
import uy.com.cvaucher.services.interfaces.HistoriaClinicaInt;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.SeguimientoPacientesInt;
import uy.com.cvaucher.services.interfaces.SesionesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;


@Controller
@RequestMapping("/pacsearch")
public class SearchPacientesController 
{
	
	private final PacientesInt 				pacientesServices;
	@Autowired
	public SearchPacientesController(PacientesInt pacientesServices, 
			  DireccionInt direccionServices, 
			  SesionesInt sesionesServices,
			  HistoriaClinicaInt historiaClinicaServices, 
			  SeguimientoPacientesInt seguimientoPacientesServices,
			  TratamientoInt tratamientoServices,
			  AgendaInt agendaServices){

		this.pacientesServices 				= pacientesServices;

}
	@RequestMapping(method = RequestMethod.GET)
	public String ShowSearchPacientes(Model model)
	{
		model.addAttribute(new Pacientes());
		model.addAttribute(new SearchPacientes());
		model.addAttribute("pac", this.pacientesServices.findAllPacientes());
		//model.addAttribute("pacientesS",this.pacientesSearch.values());
		
		return "pacientes/searchPacientes";
	}
	
	@RequestMapping(value ="/search",method = RequestMethod.POST)
	public String searchPacientes(Model model,@Valid SearchPacientes searchPacientes, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			
			return "pacientes/searchPacientes";
		}
		//model.addAttribute(new Pacientes());
		model.addAttribute(new SearchPacientes());
		model.addAttribute("pac", this.pacientesServices.findPacientes(searchPacientes));
		return "pacientes/searchPacientes";
	}

}
