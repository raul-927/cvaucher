package uy.com.cvaucher.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.Login;
import uy.com.cvaucher.services.interfaces.LoginInt;


@Controller
@RequestMapping("/login")
public class LoginController 
{
	private final LoginInt loginService;
	
	@Autowired
	public LoginController(LoginInt loginService)
	{
		this.loginService = loginService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	  public String login(Locale locale, Model model, Login login, String domUserNic) 
	{
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		model.addAttribute("usuario",user);
		model.addAttribute(new Login());
		model.addAttribute("login",loginService.showLoginUser(domUserNic));
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAuthorities());
		return "login";
	}
}
