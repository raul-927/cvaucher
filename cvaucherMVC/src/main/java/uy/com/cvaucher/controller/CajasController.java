package uy.com.cvaucher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.clases.AuxCajas;

@Controller
@RequestMapping("/cuentas")
public class CajasController {
	
	public CajasController(){
		
	}
	@RequestMapping(method = RequestMethod.GET, params = "insert")
	public String showCajas(Model model,AuxCajas auxCajas){
		model.addAttribute(new AuxCajas());
		return "caja/cajaPrincipal";
	}
}

