package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.Impuesto;
import uy.com.cvaucher.services.interfaces.ImpuestoInt;
@Controller
@RequestMapping("/impuesto")
public class ImpuestoController {
	
	@Autowired
	private final ImpuestoInt impuestoService;
	
	public ImpuestoController(ImpuestoInt impuestoService){
			this.impuestoService = impuestoService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "insert")
	public String showImpuestoInsert(Model model, Impuesto impuesto){
		
		model.addAttribute(new Impuesto());
		model.addAttribute("impuesto",impuestoService.findAllImpuestos());
		return "impuesto/formImpuesto";
	}
	
	@RequestMapping(method = RequestMethod.POST, params = "insert")
	public String impuestoInsert(Model model, @Valid Impuesto impuesto, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			model.addAttribute(new Impuesto());
			model.addAttribute("impuesto",impuestoService.findAllImpuestos());
			return "impuesto/formImpuesto";
		}
		model.addAttribute(new Impuesto());
		model.addAttribute("impuesto",impuestoService.findAllImpuestos());
		impuestoService.insertImpuesto(impuesto);
		return "impuesto/formImpuesto";
	}
}
