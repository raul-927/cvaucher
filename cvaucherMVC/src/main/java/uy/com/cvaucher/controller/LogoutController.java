package uy.com.cvaucher.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/logout")
public class LogoutController 
{
	
	@RequestMapping(method=RequestMethod.GET)
	  public String logout(Locale locale, Model model) 
	{
		return "logout/gslogout";
	}
}
