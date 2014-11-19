package uy.com.cvaucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.Tratamiento;


//@Controller
//@RequestMapping("/detallep/detPac/#{")
public class PruebaController 
{
	
	//@RequestMapping(method = RequestMethod.GET)
	public String showPrueba(Model model)
	{
		
		return "tratamientoPaciente/tratamientoPacienteDetalle";
	}

}
