package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.interfaces.TipoAgendaInt;
import uy.com.cvaucher.services.domain.Direccion;
import uy.com.cvaucher.services.domain.TipoAgenda;



//@Controller
//@RequestMapping("/tipo_agenda")
public class TipoAgendaController 
{
	
	private final TipoAgendaInt tipoAgendaService;
	

	
	//@Autowired
	public TipoAgendaController(TipoAgendaInt tipoAgendaService)
	{
		this.tipoAgendaService = tipoAgendaService;
		
	}
	
	//@RequestMapping(method = RequestMethod.GET, params = "insert")
	public String showInsertTipoAgenda(Model model)
	{
		model.addAttribute(new TipoAgenda());
		model.addAttribute("tipoAg", this.tipoAgendaService.findAllTipoAgenda());
		
		
		return "tipoAgenda/insertTipoAgenda";
	}
	
	//@RequestMapping(method = RequestMethod.POST, params = "insert")
	public String insertTipoAgenda(Model model, @Valid TipoAgenda tipoAgenda, BindingResult bindingResult)
	{
		tipoAgendaService.insertTipoAgenda(tipoAgenda);
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertTipoAgenda "+tipoAgenda);
			model.addAttribute(new Direccion());
			model.addAttribute("direcc", tipoAgendaService.findAllTipoAgenda());
			return "tipoAgenda/insertTipoAgenda";
		}
		
		model.addAttribute(new Direccion());
		model.addAttribute("direcc", tipoAgendaService.findAllTipoAgenda());
		return "tipoAgenda/insertTipoAgenda";
	
	}
	

}
