package uy.com.cvaucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uy.com.cvaucher.services.interfaces.DireccionInt;
import uy.com.cvaucher.services.interfaces.HistoriaClinicaInt;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.SeguimientoPacientesInt;
import uy.com.cvaucher.services.interfaces.SesionesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.interfaces.TratamientoPacienteInt;
import uy.com.cvaucher.services.domain.Pacientes;




@Controller
@RequestMapping("/detallep")
public class DetallePacientesController 
{
	
	private final PacientesInt 				pacientesServices;
	private final DireccionInt 				direccionServices;
	private final HistoriaClinicaInt 		historiaClinicaServices;
	private final AgendaInt					agendaServices;
	private final TratamientoPacienteInt	tratamientoPacienteServices;
	
	@Autowired
	public DetallePacientesController(PacientesInt pacientesServices, 
									  DireccionInt direccionServices, 
									  SesionesInt sesionesServices,
									  HistoriaClinicaInt historiaClinicaServices, 
									  SeguimientoPacientesInt seguimientoPacientesServices,
									  TratamientoInt tratamientoServices,
									  AgendaInt agendaServices,
									  TratamientoPacienteInt	tratamientoPacienteServices){
		
		this.pacientesServices 				= pacientesServices;
		this.direccionServices 				= direccionServices;
		this.historiaClinicaServices 		= historiaClinicaServices;
		this.agendaServices					= agendaServices;
		this.tratamientoPacienteServices	= tratamientoPacienteServices;
		
	}
	
	@RequestMapping(value ="/detPac/{pacCedula}", method = RequestMethod.GET)
	public String showDetallePacientes(Model model,  @PathVariable("pacCedula") int pacCedula)
	{
	
		Pacientes pacientes = 			this.pacientesServices.findPacientesByCedula(pacCedula);
		
		model.addAttribute("pacien",	this.pacientesServices.findPacientesByCedula(pacientes.getCedula()));
		model.addAttribute("direc", 	this.direccionServices.findDireccionByCedula(pacientes.getCedula()));
		model.addAttribute("ag", 		this.agendaServices.findAgendaById(pacientes.getCedula()));
		model.addAttribute("historiaC", this.historiaClinicaServices.findHistoriaClinicaByCedula(pacientes.getCedula()));
		model.addAttribute("tratPac", 	this.tratamientoPacienteServices.findTratamientoPacienteByCedula(pacientes.getCedula()));
		
		return "pacientes/detallePacientes";
	}
	
	@RequestMapping(value ="/detPac/{pacCedula}/{fecha}", method = RequestMethod.GET)
	public String showPacienteTratamientoDetalle(Model model,  @PathVariable("pacCedula") int pacCedula, @PathVariable("fecha") String fecha)
	{
		/*
		Pacientes pacientes = 			this.pacientesServices.findPacientesByCedula(pacCedula);
		
		model.addAttribute("pacien",	this.pacientesServices.findPacientesByCedula(pacientes.getCedula()));
		model.addAttribute("direc", 	this.direccionServices.findDireccionByCedula(pacientes.getCedula()));
		model.addAttribute("ag", 		this.agendaServices.findAgendaById(pacientes.getCedula()));
		model.addAttribute("historiaC", this.historiaClinicaServices.findHistoriaClinicaByCedula(pacientes.getCedula()));
		model.addAttribute("tratPac", 	this.tratamientoPacienteServices.findTratamientoPacienteByCedula(pacientes.getCedula()));
		
		return "pacientes/detallePacientes";
		*/
		return "tratamientoPaciente/tratamientoPacienteDetalle";
	}
	
}
