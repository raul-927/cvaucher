package uy.com.cvaucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.Tratamiento;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.interfaces.TratamientoPacienteInt;


//@Controller
//@RequestMapping("/detallep")
public class PruebaController 
{
	private final PacientesInt pacientesServices;
	private final TratamientoInt tratamientoServices;
	private final TratamientoPacienteInt tratamientoPacienteServices;
	
	//@Autowired
	public PruebaController(PacientesInt pacientesServices, TratamientoInt tratamientoServices
							,TratamientoPacienteInt tratamientoPacienteServices){
		this.pacientesServices = pacientesServices;
		this.tratamientoServices = tratamientoServices;
		this.tratamientoPacienteServices = tratamientoPacienteServices;
	}
	//@RequestMapping(value ="/detPac/{pacCedula}", params ="actualizar", method = RequestMethod.GET)
	public String showPrueba(Model model, @PathVariable("pacCedula") int pacCedula)
	{
		Pacientes pacientes = new Pacientes();
		pacientes = pacientesServices.findPacientesByCedula(pacCedula);
		
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setPacientes(pacientes);
		model.addAttribute(tratamientoPaciente);
		model.addAttribute("tratP", tratamientoServices.findAllTratamientos());
		
		return "nada/prueba";
	}
	
	//@RequestMapping(value ="/detPac/{pacCedula}", params ="actualizar", method = RequestMethod.POST)
	public String showPrueba1(Model model, @PathVariable("pacCedula") int pacCedula)
	{
		Pacientes pacientes = new Pacientes();
		pacientes = pacientesServices.findPacientesByCedula(pacCedula);
		
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setPacientes(pacientes);
		model.addAttribute(tratamientoPaciente);
		model.addAttribute("tratP", tratamientoServices.findAllTratamientos());
		
		return "nada/prueba";
	}
	
	//@RequestMapping(value ="/detPac/{pacCedula}", params ="insertTratamiento", method = RequestMethod.POST)
	public String cantSesionesTratamiento(Model model, @PathVariable("pacCedula") int pacCedula, @PathVariable("tratamId") int tratamId)
	{
		Pacientes pacientes = new Pacientes();
		pacientes = pacientesServices.findPacientesByCedula(pacCedula);
		
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setPacientes(pacientes);
		model.addAttribute(tratamientoPaciente);
		model.addAttribute("tratP", tratamientoServices.findAllTratamientos());
		model.addAttribute("tratPacById", tratamientoServices.findTratamientoById(tratamId));
		//tratPacById
		
		return "nada/prueba";
	}

}
