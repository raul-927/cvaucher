package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.interfaces.PacientesInt;

//@Component
//@RequestMapping("/pacientes")
public class PacientesController 
{
	private final PacientesInt pacientesServices;
	
	
	@Autowired
	public PacientesController(PacientesInt pacientesServices)
	{
		this.pacientesServices = pacientesServices;
	}

	
	//@RequestMapping(method = RequestMethod.GET, params ="insert")
	public String showInsertPacientes(Model model)
	{
		
		model.addAttribute(new Pacientes());
		//model.addAttribute("pac", pacientesServices.findAllPacientes());
		
		return "pacientes/insertPacientes";
	}
	
	
	//@RequestMapping(method = RequestMethod.POST, params ="insert")
	/*public String insertPacientes(Model model, @Valid Pacientes pacientes, BindingResult bindingResult)
	{
		
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertPacientes "+bindingResult.getAllErrors());
			model.addAttribute("pac", pacientesServices.findAllPacientes());
			return "pacientes/insertPacientes";
		}
		pacientesServices.insertPacientes(pacientes);
		model.addAttribute("pac", pacientesServices.findAllPacientes());
		
		return "pacientes/insertPacientes";
	}*/
	
	public String insertPacientes(@Valid Pacientes pacientes, BindingResult bindingResult)
	{
		
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertPacientes "+bindingResult.getAllErrors());
			//model.addAttribute("pac", pacientesServices.findAllPacientes());
			return "pacientes/insertPacientes";
		}
		pacientesServices.insertPacientes(pacientes);
		//model.addAttribute("pac", pacientesServices.findAllPacientes());
		
		return "pacientes/insertPacientes";
	}
	
	//@RequestMapping(method = RequestMethod.GET, params ="update")
	public String showUpdatePacientes(Model model)
	{
		model.addAttribute(new Pacientes());
		model.addAttribute("pac", pacientesServices.findAllPacientes());
		
		return "pacientes/updatePacientes";
	}
	
	//@RequestMapping(method = RequestMethod.POST, params ="update")
	public String updatePacientes(Model model, @Valid Pacientes pacientes, BindingResult bindingResult)
	{
		
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en updatePacientes");
			model.addAttribute("pac", pacientesServices.findAllPacientes());
			return "pacientes/updatePacientes";
		}
		pacientesServices.updatePacientes(pacientes);
		model.addAttribute("pac", pacientesServices.findAllPacientes());
		return "pacientes/updatePacientes";
	}
	
	
	//@RequestMapping(method = RequestMethod.GET, params ="delete")
	public String showDeletePacientes(Model model)
	{
		model.addAttribute(new Pacientes());
		model.addAttribute("pac", pacientesServices.findAllPacientes());
		
		return "pacientes/deletePacientes";
	}
	
	
	//@RequestMapping(method = RequestMethod.POST, params ="delete")
	public String deletePacientes(Model model, @Valid Pacientes pacientes, BindingResult bindingResult)
	{
		if(bindingResult.hasFieldErrors("pacId"))
		{
			System.out.println("Error en deletePacientes");
			model.addAttribute("pac", pacientesServices.findAllPacientes());
			return "pacientes/deletePacientes";
		}
		pacientesServices.deletePacientes(pacientes.getPacId());
		model.addAttribute("pac", pacientesServices.findAllPacientes());
		
		return "pacientes/deletePacientes";
	}
	
}
