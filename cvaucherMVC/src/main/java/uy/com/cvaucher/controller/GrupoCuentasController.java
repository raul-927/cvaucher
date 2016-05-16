package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.GrupoCuentas;
import uy.com.cvaucher.services.enumerador.TipoCuenta;
import uy.com.cvaucher.services.interfaces.GrupoCuentasInt;

@Controller
@RequestMapping("/grupo_cuentas")
public class GrupoCuentasController {
	
	
	private final GrupoCuentasInt grupoCuentasService;
	
	@Autowired
	public GrupoCuentasController(GrupoCuentasInt grupoCuentasService){
		this.grupoCuentasService = grupoCuentasService;
	}
	
	@RequestMapping(params ="insert", method = RequestMethod.GET)
	public String showInsertGrupoCuentasController(Model model, GrupoCuentas grupoCuentas){
		model.addAttribute(new GrupoCuentas());
		model.addAttribute("tpoCuenta",TipoCuenta.values());
		model.addAttribute("grpoCuenta",this.grupoCuentasService.showAllGrupoCuentas());
		return "grupoCuentas/grupoCuentas";
	}
	
	@RequestMapping(params ="insert", method = RequestMethod.POST)
	public String insertGrupoCuentasController(Model model, @Valid GrupoCuentas grupoCuentas, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			model.addAttribute(new GrupoCuentas());
			model.addAttribute("tpoCuenta",TipoCuenta.values());
			model.addAttribute("grpoCuenta",this.grupoCuentasService.showAllGrupoCuentas());
			return "grupoCuentas/grupoCuentas";
		}
		this.grupoCuentasService.insertGrupoCuentas(grupoCuentas);
		model.addAttribute(new GrupoCuentas());
		model.addAttribute("tpoCuenta",TipoCuenta.values());
		model.addAttribute("grpoCuenta",this.grupoCuentasService.showAllGrupoCuentas());
		return "grupoCuentas/grupoCuentas";
	}

}
