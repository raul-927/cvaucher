package uy.com.cvaucher.controller;

import uy.com.cvaucher.services.clases.SearchPacientes;
import uy.com.cvaucher.services.domain.DomainUser;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.enumerador.PacientesSearch;
import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.interfaces.DireccionInt;
import uy.com.cvaucher.services.interfaces.DomainUserInt;
import uy.com.cvaucher.services.interfaces.HistoriaClinicaInt;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.SeguimientoPacientesInt;
import uy.com.cvaucher.services.interfaces.SesionesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@Controller()
//@RequestMapping("/main")
public class MainController
{
	/*
	private final PacientesInt 				pacientesServices;
	private final DireccionInt 				direccionServices;
	private final SesionesInt 				sesionesServices;
	private final HistoriaClinicaInt 		historiaClinicaServices;
	private final SeguimientoPacientesInt	seguimientoPacientesServices;
	private final TratamientoInt			tratamientoServices;
	private final AgendaInt					agendaServices;
	
	private PacientesSearch pacientesSearch;
*/
	//@Autowired
	public MainController(){

		
}
	
	
	
	
	//@RequestMapping(method = RequestMethod.GET)
	public String mainMenu()
	{
		return "login";
	}
	
	
	
	
	
	//@RequestMapping(method = RequestMethod.GET)
	public String ShowSearchPacientes(Model model)
	{
		
		
		return "/login";
	}
	
	
	
}
