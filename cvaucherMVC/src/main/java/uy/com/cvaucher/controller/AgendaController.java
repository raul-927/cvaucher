package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.domain.Agenda;

import uy.com.cvaucher.services.enumerador.TipoAgenda;



//@Controller
//@RequestMapping("/agenda")
public class AgendaController 
{
	private final AgendaInt agendaService;
	private TipoAgenda tipoAgenda;
	
	//@Autowired
	public AgendaController(AgendaInt agendaService)
	{
		this.agendaService = agendaService;
	}
	
	
	
	//@RequestMapping(method = RequestMethod.GET, params = "insert")
	public String showInsertAgenda(Model model, TipoAgenda tipoAgenda)
	{
		model.addAttribute(new Agenda());
		model.addAttribute("age", agendaService.findAllAgenda());
		model.addAttribute("tipage", tipoAgenda.values());
		
		return "agenda/insertAgenda";
	}
	
	//@RequestMapping(method = RequestMethod.POST, params = "insert")
	public String insertAgenda(Model model, @Valid Agenda agenda, BindingResult bindingResult)
	{
		
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertAgenda "+bindingResult.getAllErrors());
			model.addAttribute("age", agendaService.findAllAgenda());
			model.addAttribute("tipage", tipoAgenda.values());
			
			return "agenda/insertAgenda";
		}
		agendaService.insertAgenda(agenda);
		model.addAttribute("age", agendaService.findAllAgenda());
		model.addAttribute("tipage", tipoAgenda.values());
		
		return "agenda/insertAgenda";
	
	}
	
	
	
	//@RequestMapping(method = RequestMethod.GET, params = "update")
	public String showUpdateAgenda(Model model, TipoAgenda tipoAgenda)
	{
		model.addAttribute(new Agenda());
		model.addAttribute("age", agendaService.findAllAgenda());
		model.addAttribute("tipage", tipoAgenda.values());
		
		return "agenda/insertAgenda";
	}
	
	//@RequestMapping(method = RequestMethod.POST, params = "update")
	public String updateAgenda(Model model, @Valid Agenda agenda, BindingResult bindingResult)
	{
		
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en updateAgenda "+bindingResult.getAllErrors());
			model.addAttribute("age", agendaService.findAllAgenda());
			model.addAttribute("tipage", tipoAgenda.values());
			
			return "agenda/insertAgenda";
		}
		agendaService.updateAgenda(agenda);
		model.addAttribute("age", agendaService.findAllAgenda());
		model.addAttribute("tipage", tipoAgenda.values());
		
		return "agenda/insertAgenda";
	
	}
	
	

}
