package uy.com.cvaucher.interfaces;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import uy.com.cvaucher.services.clases.SearchPacientes;

@RequestMapping("/pacsearch")
public interface SearchPacientesControllerInt {
	
	@RequestMapping(method = RequestMethod.GET)
	//@ResponseBody
	String ShowSearchPacientes(Model model);
	
	@RequestMapping(value ="/search",method = RequestMethod.POST)
	//@ResponseBody
	String searchPacientes(Model model,@Valid 
			SearchPacientes searchPacientes, BindingResult bindingResult);
	
}
