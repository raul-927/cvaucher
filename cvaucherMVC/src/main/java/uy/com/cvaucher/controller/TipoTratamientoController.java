package uy.com.cvaucher.controller;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.TipoTratamiento;
import uy.com.cvaucher.services.interfaces.TipoTratamientoInt;

@SuppressWarnings("unused")
@Controller
@RequestMapping("/tipo_tratamiento")
public class TipoTratamientoController 
{
	
	private final TipoTratamientoInt tipoTratamientoService;
	
	
	@Autowired
	public TipoTratamientoController(TipoTratamientoInt tipoTratamientoService)
	{
		this.tipoTratamientoService = tipoTratamientoService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params ="insert")
	public String showInsertTipoTratamiento(Model model)
	{
		model.addAttribute("tpoTrat",tipoTratamientoService.findAllTipoTratamiento());
  	  	model.addAttribute(new TipoTratamiento());
		return "tipo_tratamiento/formTipoTratamiento";
	}

	 @RequestMapping(method = RequestMethod.POST, params ="insert")
	 public String insertTipoTratamiento(Model model, @Valid TipoTratamiento tipoTratamiento, BindingResult bindingResult)
	 {
		 if(bindingResult.hasErrors())
	     {
	    	  System.out.println("Error en insertTipoTratamiento");
	    	  model.addAttribute("tpoTrat",tipoTratamientoService.findAllTipoTratamiento());
	    	  model.addAttribute(new TipoTratamiento());
	    	  
	    	  return "tipo_tratamiento/formTipoTratamiento"; 
	     }
		 tipoTratamientoService.createTipoTratamiento(tipoTratamiento);
	      
	      model.addAttribute("tpoTrat",tipoTratamientoService.findAllTipoTratamiento());
	      
	      return "tipo_tratamiento/formTipoTratamiento";
		 
	 }
	 
	 @RequestMapping(method = RequestMethod.GET, params = "update")
	 public String showUpdateTipoTratamiento(Model model)
	 {
		
			 model.addAttribute("tpoTrat", tipoTratamientoService.findAllTipoTratamiento());
			 model.addAttribute(new TipoTratamiento());
			 return "tipo_tratamiento/updateTipoTratamiento";
		
	 }
	 
	 @RequestMapping(method = RequestMethod.POST, params = "update")
	 public String updateTipoTratamiento(Model model, @Valid TipoTratamiento tipoTratamiento, BindingResult bindingResult)
	 {
		 if(bindingResult.hasErrors())
		 {
			 System.out.println("Error en showUpdateTipoTratamiento");
			 model.addAttribute("tpoTrat", tipoTratamientoService.findAllTipoTratamiento());
			 model.addAttribute(new TipoTratamiento());
			 return "tipo_tratamiento/updateTipoTratamiento";
		 }
		 tipoTratamientoService.updateTipoTratamiento(tipoTratamiento);
		 model.addAttribute("tpoTrat", tipoTratamientoService.findAllTipoTratamiento());
		 model.addAttribute(new TipoTratamiento());
		 return "tipo_tratamiento/updateTipoTratamiento";
	 }
	 
	 
	@RequestMapping(method = RequestMethod.GET, params ="delete")
	public String showDeleteTipoTratamiento(Model model)
	{
		model.addAttribute("tpoTrat",tipoTratamientoService.findAllTipoTratamiento());
	  	model.addAttribute(new TipoTratamiento());
		return "tipo_tratamiento/deleteTipoTratamiento";
	}
	 
	 
	@RequestMapping(method = RequestMethod.POST, params = "delete")
	 public String deleteTipoTratamiento(Model model, @Valid TipoTratamiento tipoTratamiento, BindingResult bindingResult)
	 {
		 if(bindingResult.hasErrors())
		 {
			 System.out.println("Error en showDeleteTipoTratamiento");
			 model.addAttribute("tpoTrat", tipoTratamientoService.findAllTipoTratamiento());
			 model.addAttribute(new TipoTratamiento());
			 return "tipo_tratamiento/deleteTipoTratamiento";
		 }
		 tipoTratamientoService.deleteTipoTratamiento(tipoTratamiento.getTipTratId());
		 model.addAttribute("tpoTrat", tipoTratamientoService.findAllTipoTratamiento());
		 model.addAttribute(new TipoTratamiento());
		 return "tipo_tratamiento/deleteTipoTratamiento";
	 }
	 
}

