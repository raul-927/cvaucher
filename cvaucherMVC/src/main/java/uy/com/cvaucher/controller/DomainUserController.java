package uy.com.cvaucher.controller;


import uy.com.cvaucher.services.domain.DomainUser;
import uy.com.cvaucher.services.interfaces.DomainUserInterface;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.interfaces.DomainUserInterface;


//@SuppressWarnings("unused")
//@Controller
//@RequestMapping("/domain_user")
public class DomainUserController 
{
	
	//@Autowired
	private final DomainUserInterface domainUserService;
	
	public DomainUserController( DomainUserInterface domainUserService)
	{
		this.domainUserService = domainUserService;
	}
	
	//-------------------------insert---------------------------------------------
	   //@RequestMapping(method = RequestMethod.GET, params ="insert")
	    public String showInsertDomainUser(Model model)
	    {
		   model.addAttribute(new DomainUser());
		   
		   model.addAttribute("allDomainUser",domainUserService.findAllDomainUsers());
		   
		
		   return "calles/formCalles";
	    }
	   
	  //@RequestMapping(method = RequestMethod.POST, params ="insert")
	   public String insertDomainUser(Model model, @Valid DomainUser domainUser, BindingResult bindingResult)
	   {
	      if(bindingResult.hasErrors())
	      {
	    	  System.out.println("Error en addDomainUserFromForm");
	    	  model.addAttribute("domain_user_s",domainUserService.findAllDomainUsers());
	    	  
	    	  return "domain_usr/formDomainUsr";
	    	  
	      }
	      domainUserService.insertDomainUser(domainUser);
	      
	      model.addAttribute("domain_user_s",domainUserService.findAllDomainUsers());
	      
	      return "domain_usr/formDomainUsr";
	   }
	  
	  
	  
	//-------------------------update---------------------------------------------
	  // @RequestMapping(method = RequestMethod.GET, params ="update")
	    public String showUpdateDomainUser(Model model)
	    {
		   model.addAttribute(new DomainUser());
		   
		   model.addAttribute("allDomainUser",domainUserService.findAllDomainUsers());
		   
		
		   return "calles/formCalles";
	    }
	   
	 // @RequestMapping(method = RequestMethod.POST, params ="update")
	   public String updateDomainUser(Model model, @Valid DomainUser domainUser, BindingResult bindingResult)
	   {
	      if(bindingResult.hasErrors())
	      {
	    	  System.out.println("Error en addDomainUserFromForm");
	    	  model.addAttribute("domain_user_s",domainUserService.findAllDomainUsers());
	    	  
	    	  return "domain_usr/formDomainUsr";
	    	  
	      }
	      domainUserService.updateDomainUser(domainUser);
	      
	      model.addAttribute("domain_user_s",domainUserService.findAllDomainUsers());
	      
	      return "domain_usr/formDomainUsr";
	   }
	  
	  

}
