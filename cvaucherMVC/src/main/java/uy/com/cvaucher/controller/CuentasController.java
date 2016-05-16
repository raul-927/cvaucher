package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.interfaces.CuentasInt;
import uy.com.cvaucher.services.domain.Cuentas;
import uy.com.cvaucher.services.enumerador.TiposMovimientos;

@Controller
@RequestMapping("/cuentas")
public class CuentasController 
{
	@Autowired 
	private final CuentasInt cuentasService;
	
	@Autowired
	public CuentasController(CuentasInt cuentasService){
		this.cuentasService = cuentasService;
	}
	
	@RequestMapping(value ="/cuenta",params ="insert", method = RequestMethod.GET)
	public String showInsertCuenta(Model model, Cuentas cuentas){
		
		model.addAttribute(new Cuentas());
		model.addAttribute("muestroCuentas", this.cuentasService.selectAllCuentas());
		
		return "cuentas/cuentas";
	}
	
	@RequestMapping(value ="/cuenta",params ="insert", method = RequestMethod.POST)
	public String insertCuenta(Model model, @Valid Cuentas cuentas, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			
			model.addAttribute(new Cuentas());
			model.addAttribute("muestroCuentas", this.cuentasService.selectAllCuentas());
			
			return "cuentas/cuentas";
		}
		model.addAttribute(new Cuentas());
		this.cuentasService.insertCuenta(cuentas);
		
		return "cuentas/cuentas";
	}
	
}
