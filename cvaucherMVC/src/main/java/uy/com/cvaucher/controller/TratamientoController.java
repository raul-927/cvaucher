package uy.com.cvaucher.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.domain.Tratamiento;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.interfaces.ImpuestoInt;
import uy.com.cvaucher.services.interfaces.TipoTratamientoInt;

@Controller
@RequestMapping("/tratamientos")
public class TratamientoController 
{
	private ImpuestoInt		   impuestoService;
	private final TratamientoInt tratamientoService;
	private final TipoTratamientoInt tipoTratamientoService;
	
	@Autowired
	public TratamientoController(TratamientoInt tratamientoService, TipoTratamientoInt tipoTratamientoService,ImpuestoInt impuestoService)
	{
		this.tratamientoService = tratamientoService;
		this.tipoTratamientoService = tipoTratamientoService;
		this.impuestoService = impuestoService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params ="insert")
	public String showInsertTratamiento(Model model)
	{
		model.addAttribute(new Tratamiento());
		model.addAttribute("trat", tratamientoService.findAllTratamientos());
		model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
		model.addAttribute("impuestos", impuestoService.findAllImpuestos());
		
		return "tratamiento/insertTratamiento";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, params ="insert")
	public String insertTratamiento(Model model, @Valid Tratamiento tratamiento, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			model.addAttribute(new Tratamiento());
			System.out.println("Error en insertTratamiento");
			model.addAttribute("trat", tratamientoService.findAllTratamientos());
			model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
			model.addAttribute("impuestos", impuestoService.findAllImpuestos());
			
			return "tratamiento/insertTratamiento";
		}
		tratamientoService.insertTratamiento(tratamiento);
		model.addAttribute(new Tratamiento());
		model.addAttribute("trat", tratamientoService.findAllTratamientos());
		model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
		model.addAttribute("impuestos", impuestoService.findAllImpuestos());
		
		return "tratamiento/insertTratamiento";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, params ="update")
	public String showUpdateTratamiento(Model model)
	{
		model.addAttribute(new Tratamiento());
		model.addAttribute("trat", tratamientoService.findAllTratamientos());
		model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
		model.addAttribute("impuestos", impuestoService.findAllImpuestos());
		
		return "tratamiento/updateTratamiento";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, params ="update")
	public String updateTratamiento(Model model, @Valid Tratamiento tratamiento, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en updateTratamiento");
			model.addAttribute(new Tratamiento());
			model.addAttribute("trat", tratamientoService.findAllTratamientos());
			model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
			model.addAttribute("impuestos", impuestoService.findAllImpuestos());
			
			return "tratamiento/updateTratamiento";
		}
		tratamientoService.updateTratamiento(tratamiento);
		model.addAttribute(new Tratamiento());
		model.addAttribute("trat", tratamientoService.findAllTratamientos());
		model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
		model.addAttribute("impuestos", impuestoService.findAllImpuestos());
		
		return "tratamiento/updateTratamiento";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, params ="delete")
	public String showDeleteTratamiento(Model model)
	{
		model.addAttribute(new Tratamiento());
		model.addAttribute("trat", tratamientoService.findAllTratamientos());
		model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
		model.addAttribute("impuestos", impuestoService.findAllImpuestos());
		
		return "tratamiento/deleteTratamiento";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, params ="delete")
	public String deleteTratamiento(Model model, @Valid Tratamiento tratamiento, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en deleteTratamiento");
			model.addAttribute(new Tratamiento());
			model.addAttribute("trat", tratamientoService.findAllTratamientos());
			model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
			model.addAttribute("impuestos", impuestoService.findAllImpuestos());
			
			return "tratamiento/deleteTratamiento";
		}
		tratamientoService.deleteTratamiento(tratamiento.getTratId());
		model.addAttribute(new Tratamiento());
		model.addAttribute("trat", tratamientoService.findAllTratamientos());
		model.addAttribute("tipoTrat", tipoTratamientoService.findAllTipoTratamiento());
		model.addAttribute("impuestos", impuestoService.findAllImpuestos());
		
		return "tratamiento/deleteTratamiento";
	}
	
	
}
