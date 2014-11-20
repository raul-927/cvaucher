package uy.com.cvaucher.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
import uy.com.cvaucher.services.interfaces.HistorialPagosInt;
import uy.com.cvaucher.services.domain.HistorialPagos;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.TratamientoPaciente;




@Controller
@RequestMapping("/detallep")
public class DetallePacientesController 
{
	
	private final PacientesInt 				pacientesServices;
	private final DireccionInt 				direccionServices;
	private final HistoriaClinicaInt 		historiaClinicaServices;
	private final AgendaInt					agendaServices;
	private final TratamientoPacienteInt	tratamientoPacienteServices;
	private final HistorialPagosInt			historialPagosServices;
	
	@Autowired
	public DetallePacientesController(PacientesInt pacientesServices, 
									  DireccionInt direccionServices, 
									  SesionesInt sesionesServices,
									  HistoriaClinicaInt historiaClinicaServices, 
									  SeguimientoPacientesInt seguimientoPacientesServices,
									  TratamientoInt tratamientoServices,
									  AgendaInt agendaServices,
									  TratamientoPacienteInt	tratamientoPacienteServices,
									  HistorialPagosInt	historialPagosServices){
		
		this.pacientesServices 				= pacientesServices;
		this.direccionServices 				= direccionServices;
		this.historiaClinicaServices 		= historiaClinicaServices;
		this.agendaServices					= agendaServices;
		this.tratamientoPacienteServices	= tratamientoPacienteServices;
		this.historialPagosServices			= historialPagosServices;
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
	
	@RequestMapping(value ="/detPac/{pacCedula}/{histTratPacId}", method = RequestMethod.GET)
	public String showPacienteTratamientoPago(Model model, @PathVariable("pacCedula")	int pacCedula, 
															  @PathVariable("histTratPacId")int histTratPacId)
	{
		Date hoy = new Date();
		String patron = "YYYY-MM-dd";
		SimpleDateFormat formato = new SimpleDateFormat(patron);
		String salida = formato.format(hoy);
		model.addAttribute(new HistorialPagos());
		model.addAttribute("histPagosByTratPacId", this.historialPagosServices.findHistorialPagoByHistTratPacId(histTratPacId));
		model.addAttribute("salida", salida);
		return "tratamientoPaciente/tratamientoPacienteDetalle";
	}
	
	@RequestMapping(value ="/detPac/{pacCedula}/{histTratPacId}", method = RequestMethod.POST)
	public String insertPacienteTratamientoPago(Model model, @PathVariable("pacCedula")	int pacCedula, 
			  @PathVariable("histTratPacId")int histTratPacId, @Valid HistorialPagos historialPagos, BindingResult bindingResult)
	{
		Date hoy = new Date();
		String patron = "YYYY-MM-dd";
		SimpleDateFormat formato = new SimpleDateFormat(patron);
		String salida = formato.format(hoy);
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertPacienteTratamientoPago");
			model.addAttribute(new HistorialPagos());
			model.addAttribute("histPagosByTratPacId", this.historialPagosServices.findHistorialPagoByHistTratPacId(histTratPacId));
			model.addAttribute("salida", salida);
			return "tratamientoPaciente/tratamientoPacienteDetalle";
		}
		
		historialPagos.setHistTratPacId(histTratPacId);
		this.historialPagosServices.insertHistorialPago(historialPagos);
		int tratPacId = histTratPacId;
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setTratPacId(tratPacId);
		tratamientoPaciente.setImportePagado(historialPagos.getHistPagosMonto());
		this.tratamientoPacienteServices.updateTratamientoPacienteImporte(tratamientoPaciente);
		model.addAttribute(new HistorialPagos());
		model.addAttribute("histPagosByTratPacId", this.historialPagosServices.findHistorialPagoByHistTratPacId(histTratPacId));
		model.addAttribute("salida", salida);
		return "tratamientoPaciente/tratamientoPacienteDetalle";
	}
	
}
