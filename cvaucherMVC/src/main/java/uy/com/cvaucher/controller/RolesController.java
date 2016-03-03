package uy.com.cvaucher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import uy.com.cvaucher.services.domain.Roles;
import uy.com.cvaucher.services.interfaces.RolesInt;

@Controller
@RequestMapping("/roles")
public class RolesController {
	
	private final RolesInt rolesService;
	
	@Autowired
	public RolesController(RolesInt rolesService){
		this.rolesService = rolesService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params ="insert")
	public String showRolesInsert(Model model){
		model.addAttribute(new Roles());
		model.addAttribute("allroles", rolesService.showAllRoles());
		
		return "rolesUsers/insertRolesUsers";	
	}
	
	@RequestMapping(method = RequestMethod.POST, params ="insert")
	public String insertRoles(Model model, @Valid Roles roles, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			 System.out.println("Error en insertRoles");
			model.addAttribute(new Roles());
			model.addAttribute("allroles", rolesService.showAllRoles());
				
			return "rolesUsers/insertRolesUsers";
		}
		this.rolesService.insertRole(roles);
		model.addAttribute(new Roles());
		model.addAttribute("allroles", rolesService.showAllRoles());
		
		return "rolesUsers/insertRolesUsers";	
	}

}
