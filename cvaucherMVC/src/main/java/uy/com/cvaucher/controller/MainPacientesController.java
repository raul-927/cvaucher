package uy.com.cvaucher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping("/menup")
public class MainPacientesController 
{

	public MainPacientesController () 
	{
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showMenuPrincipal(Model model)
	{
		 return "/principalPacientes";
	}
	
	
}
