package uy.com.cvaucher.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.interfaces.DireccionInt;
import uy.com.cvaucher.services.domain.Direccion;
import uy.com.cvaucher.services.enumerador.TipoVivienda;


//@Controller
//@RequestMapping("/direccion")
public class DireccionController 
{
	
	private final DireccionInt direccionService;
	
	private  TipoVivienda tipoVivienda;
	
	
	//@Autowired
	public DireccionController(DireccionInt direccionService)
	{
		this.direccionService = direccionService;
		
	}
	
	
	//@RequestMapping(method = RequestMethod.GET, params = "insert")
	public String showInsertDireccion(Model model, TipoVivienda tipoVivienda)
	{
		model.addAttribute(new Direccion());
		model.addAttribute("direcc", direccionService.findAllDireccion());
		model.addAttribute("tipviv", tipoVivienda.values());
		
		return "direccion/insertDireccion";
	}
	
	//@RequestMapping(method = RequestMethod.POST, params = "insert")
	public String insertDireccion(Model model, @Valid Direccion direccion, BindingResult bindingResult)
	{
		direccionService.insertDireccion(direccion);
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertDireccion "+direccion);
			model.addAttribute(new Direccion());
			model.addAttribute("direcc", direccionService.findAllDireccion());
			return "direccion/insertDireccion";
		}
		
		model.addAttribute(new Direccion());
		model.addAttribute("direcc", direccionService.findAllDireccion());
		return "direccion/insertDireccion";
	
	}
	
	//@RequestMapping(method = RequestMethod.GET, params = "update")
	public String showUpdateDireccion(Model model, TipoVivienda tipoVivienda)
	{
		model.addAttribute(new Direccion());
		model.addAttribute("direcc", direccionService.findAllDireccion());
		model.addAttribute("tipviv", tipoVivienda.values());
		
		return "direccion/updateDireccion";
	}
	
	//@RequestMapping(method = RequestMethod.POST, params = "update")
	public String updateDireccion(Model model, @Valid Direccion direccion, BindingResult bindingResult)
	{
		direccionService.updateDireccion(direccion);
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en updateDireccion "+direccion);
			model.addAttribute(new Direccion());
			model.addAttribute("direcc", direccionService.findAllDireccion());
			model.addAttribute("tipviv", tipoVivienda.values());
			return "direccion/updateDireccion";
		}
		
		model.addAttribute(new Direccion());
		model.addAttribute("direcc", direccionService.findAllDireccion());
		model.addAttribute("tipviv", tipoVivienda.values());
		return "direccion/updateDireccion";
	
	}
	
	
	//@RequestMapping(method = RequestMethod.GET, params = "delete")
	public String showDeleteDireccion(Model model, TipoVivienda tipoVivienda)
	{
		model.addAttribute(new Direccion());
		model.addAttribute("direcc", direccionService.findAllDireccion());
		model.addAttribute("tipviv", tipoVivienda.values());
		
		return "direccion/deleteDireccion";
	}
	
	//@RequestMapping(method = RequestMethod.POST, params = "delete")
	public String deleteDireccion(Model model, @Valid Direccion direccion, BindingResult bindingResult)
	{
		direccionService.deleteDireccion(direccion.getDirId());
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en deleteDireccion "+direccion);
			model.addAttribute(new Direccion());
			model.addAttribute("direcc", direccionService.findAllDireccion());
			return "direccion/deleteDireccion";
		}
		
		model.addAttribute(new Direccion());
		model.addAttribute("direcc", direccionService.findAllDireccion());
		return "direccion/deleteDireccion";
	
	}
	
}
