package uy.com.cvaucher.controller;


import uy.com.cvaucher.services.domain.DomainUser;
import uy.com.cvaucher.services.interfaces.DomainUserInt;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@SuppressWarnings("unused")
@Controller
@RequestMapping("/domain_user")
public class DomainUserController 
{
	
	
	private final DomainUserInt domainUserService;
	
	@Autowired
	public DomainUserController( DomainUserInt domainUserService)
	{
		this.domainUserService = domainUserService;
	}
	
	//-------------------------insert---------------------------------------------
	   @RequestMapping(method = RequestMethod.GET, params ="insert")
	    public String showInsertDomainUser(Model model)
	    {
		   model.addAttribute(new DomainUser());
		   
		   model.addAttribute("allDomainUser",domainUserService.findAllDomainUsers());
		   
		
		   return "domainUsers/insertDomainUsers";
	    }
	   
	  @RequestMapping(method = RequestMethod.POST, params ="insert")
	   public String insertDomainUser(Model model, @Valid DomainUser domainUser, BindingResult bindingResult)
	   {
	      if(bindingResult.hasErrors())
	      {
	    	  System.out.println("Error en addDomainUserFromForm");
	    	  model.addAttribute("allDomainUser",domainUserService.findAllDomainUsers());
	    	  
	    	  return "domainUsers/insertDomainUsers";
	    	  
	      }
	      domainUserService.insertDomainUser(domainUser);
	      
	      model.addAttribute("allDomainUser",domainUserService.findAllDomainUsers());
	      
	      return "domainUsers/insertDomainUsers";
	   }
	  
	  
	  
	//-------------------------update---------------------------------------------
	  //@RequestMapping(method = RequestMethod.GET, params ="update")
	    public String showUpdateDomainUser(Model model)
	    {
		   model.addAttribute(new DomainUser());
		   
		   model.addAttribute("allDomainUser",domainUserService.findAllDomainUsers());
		   
		
		   return "domainUsers/insertDomainUsers";
	    }
	   
	  //@RequestMapping(method = RequestMethod.POST, params ="update")
	   public String updateDomainUser(Model model, @Valid DomainUser domainUser, BindingResult bindingResult)
	   {
	      if(bindingResult.hasErrors())
	      {
	    	  System.out.println("Error en addDomainUserFromForm");
	    	  model.addAttribute("allDomainUser",domainUserService.findAllDomainUsers());
	    	  
	    	  return "domainUsers/insertDomainUsers";
	    	  
	      }
	      domainUserService.updateDomainUser(domainUser);
	      
	      model.addAttribute("allDomainUser",domainUserService.findAllDomainUsers());
	      
	      return "domainUsers/insertDomainUsers";
	   }
	  
	  

}
