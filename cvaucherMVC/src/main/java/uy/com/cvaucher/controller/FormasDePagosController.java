package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;


@Controller
@RequestMapping("/formasDePagos")
public class FormasDePagosController 
{
	private final FormasDePagosInt formasDePagosServices;

	@Autowired
	public FormasDePagosController(FormasDePagosInt formasDePagosServices)
	{
		this.formasDePagosServices = formasDePagosServices;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "insert")
	public String showFormasDePagos(Model model, FormasDePagos formasDePagos)
	{
		
		model.addAttribute(new FormasDePagos());
		model.addAttribute("forPag", this.formasDePagosServices.findAllFormasDePagos());
		return "formasDePagos/insertFormasDePagos";
	}
	
	@RequestMapping(method = RequestMethod.POST, params = "insert")
	public String insertFormasDePagos(Model model, @Valid FormasDePagos formasDePagos, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertar Tipos de Pagos"+bindingResult.getAllErrors());
			model.addAttribute(new FormasDePagos());
			model.addAttribute("forPag", this.formasDePagosServices.findAllFormasDePagos());
		}
		this.formasDePagosServices.insertFormasDePagos(formasDePagos);
		model.addAttribute(new FormasDePagos());
		model.addAttribute("forPag", this.formasDePagosServices.findAllFormasDePagos());
		
		return "formasDePagos/insertFormasDePagos";
	}
}
