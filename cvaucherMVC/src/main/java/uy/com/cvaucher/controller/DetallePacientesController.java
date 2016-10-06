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
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;
import uy.com.cvaucher.services.interfaces.HistoriaClinicaInt;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.PagoEfectivoInt;
import uy.com.cvaucher.services.interfaces.SeguimientoPacientesInt;
import uy.com.cvaucher.services.interfaces.SesionesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.interfaces.CajaInt;
import uy.com.cvaucher.services.interfaces.TratamientoPacienteInt;
import uy.com.cvaucher.services.interfaces.HistorialPagosInt;
import uy.com.cvaucher.services.interfaces.AsientoContableInt;
import uy.com.cvaucher.services.clases.FormasDePagosDesc;
import uy.com.cvaucher.services.domain.Caja;
import uy.com.cvaucher.services.domain.HistorialPagos;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.PagoEfectivo;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.domain.SeguimientoPacientes;



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
	private final SeguimientoPacientesInt	seguimientoPacientesServices;
	private final PagoEfectivoInt			pagoEfectivoServices;
	private final CajaInt					cajaServices;
	private final AsientoContableInt		asientoContableServices;
	private final FormasDePagosInt			formasDePagosServices;
	@Autowired
	public DetallePacientesController(PacientesInt				pacientesServices, 
									  DireccionInt 				direccionServices, 
									  SesionesInt 				sesionesServices,
									  HistoriaClinicaInt 		historiaClinicaServices, 
									  TratamientoInt 			tratamientoServices,
									  AgendaInt 				agendaServices,
									  TratamientoPacienteInt	tratamientoPacienteServices,
									  HistorialPagosInt			historialPagosServices,
									  SeguimientoPacientesInt	seguimientoPacientesServices,
									  PagoEfectivoInt			pagoEfectivoServices,
									  CajaInt					cajaServices,
									  AsientoContableInt		asientoContableServices,
									  FormasDePagosInt			formasDePagosServices){
		
		this.pacientesServices 				= pacientesServices;
		this.direccionServices 				= direccionServices;
		this.historiaClinicaServices 		= historiaClinicaServices;
		this.agendaServices					= agendaServices;
		this.tratamientoPacienteServices	= tratamientoPacienteServices;
		this.historialPagosServices			= historialPagosServices;
		this.seguimientoPacientesServices	= seguimientoPacientesServices;
		this.pagoEfectivoServices			= pagoEfectivoServices;
		this.cajaServices					= cajaServices;
		this.asientoContableServices		= asientoContableServices;
		this.formasDePagosServices			= formasDePagosServices;
		
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
		model.addAttribute(new SeguimientoPacientes());
		model.addAttribute("histPagosByTratPacId", this.historialPagosServices.findHistorialPagoByHistTratPacId(histTratPacId));
		model.addAttribute("segP", this.seguimientoPacientesServices.findSeguimientoPacientesByTratPacId(histTratPacId));
		model.addAttribute("salida", salida);
		return "tratamientoPaciente/tratamientoPacienteDetalle";
	}
	
	@RequestMapping(value ="/detPac/{pacCedula}/{histTratPacId}",params = "pagos", method = RequestMethod.POST)
	public String insertPacienteTratamientoPago(Model model, @PathVariable("pacCedula")	int pacCedula, 
			  @PathVariable("histTratPacId")int histTratPacId,@PathVariable("formasDePagoDesc")FormasDePagosDesc formasDePagoDesc, @Valid HistorialPagos historialPagos, BindingResult bindingResult)
	{
		Date hoy = new Date();
		String patron = "YYYY-MM-dd";
		SimpleDateFormat formato = new SimpleDateFormat(patron);
		String salida = formato.format(hoy);
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertPacienteTratamientoPago");
			model.addAttribute(new HistorialPagos());
			model.addAttribute(new SeguimientoPacientes());
			model.addAttribute("histPagosByTratPacId", this.historialPagosServices.findHistorialPagoByHistTratPacId(histTratPacId));
			model.addAttribute("segP", this.seguimientoPacientesServices.findSeguimientoPacientesByTratPacId(histTratPacId));
			model.addAttribute("salida", salida);
			return "tratamientoPaciente/tratamientoPacienteDetalle";
		}
		
		Caja caja = this.cajaServices.cargoCajaActual();
		historialPagos.setHistPagosCajaId(caja.getCajaId());
		historialPagos.setHistTratPacId(histTratPacId);
		PagoEfectivo pagoEfectivo = new PagoEfectivo();
		if(historialPagos.getHistPagosMonto()!= 0)
		{
			String tipoPago = "CRED";
			historialPagos.setHistPagosTipo(tipoPago);
			
			pagoEfectivo.setPagoEfCedula(pacCedula);
			pagoEfectivo.setPagoEfDesc(tipoPago);
			pagoEfectivo.setPagoEfId(histTratPacId);
			pagoEfectivo.setPagoEfImporte(historialPagos.getHistPagosMonto());
			this.historialPagosServices.insertHistorialPago(historialPagos);
			
			this.pagoEfectivoServices.insertPagoEfectivo(pagoEfectivo);
			
		}
		
		int tratPacId = histTratPacId;
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		SeguimientoPacientes seguimientoPacientes = new SeguimientoPacientes();
		seguimientoPacientes.setTratPacId(tratPacId);
		tratamientoPaciente.setTratPacId(tratPacId);
		tratamientoPaciente.setImportePagado(historialPagos.getHistPagosMonto());
		this.tratamientoPacienteServices.updateTratamientoPacienteImporte(tratamientoPaciente);
		String formPagAbreviacion = "";
		formasDePagoDesc = this.formasDePagosServices.findFormPagoTipoByDesc(formPagAbreviacion);
		this.asientoContableServices.ingresarAsientoContable(pagoEfectivo, tratamientoPaciente, formasDePagoDesc);
		model.addAttribute(new HistorialPagos());
		model.addAttribute(new SeguimientoPacientes());
		model.addAttribute("histPagosByTratPacId", this.historialPagosServices.findHistorialPagoByHistTratPacId(histTratPacId));
		model.addAttribute("segP", this.seguimientoPacientesServices.findSeguimientoPacientesByTratPacId(histTratPacId));
		model.addAttribute("salida", salida);
		return "tratamientoPaciente/tratamientoPacienteDetalle";
	}
	
	@RequestMapping(value ="/detPac/{pacCedula}/{histTratPacId}",params = "seg", method = RequestMethod.POST)
	public String insertPacienteTratamientoSeguimiento(Model model, @PathVariable("pacCedula")	int pacCedula, 
			  @PathVariable("histTratPacId")int histTratPacId, @Valid SeguimientoPacientes seguimientoPacientes, BindingResult bindingResult)
	{
		Date hoy = new Date();
		String patron = "YYYY-MM-dd";
		SimpleDateFormat formato = new SimpleDateFormat(patron);
		String salida = formato.format(hoy);
		seguimientoPacientes.setTratPacId(histTratPacId);
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertPacienteTratamientoSeguimientoPaciente");
			model.addAttribute(new HistorialPagos());
			model.addAttribute(new SeguimientoPacientes());
			model.addAttribute("histPagosByTratPacId", this.historialPagosServices.findHistorialPagoByHistTratPacId(histTratPacId));
			model.addAttribute("segP", this.seguimientoPacientesServices.findSeguimientoPacientesByTratPacId(histTratPacId));
			model.addAttribute("salida", salida);
			return "tratamientoPaciente/tratamientoPacienteDetalle";
		}
		int tratPacId = histTratPacId;
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		
		tratamientoPaciente.setTratPacId(tratPacId);

		this.seguimientoPacientesServices.insertSeguimientoPacientes(seguimientoPacientes);
		model.addAttribute(new HistorialPagos());
		model.addAttribute(new SeguimientoPacientes());
		model.addAttribute("histPagosByTratPacId", this.historialPagosServices.findHistorialPagoByHistTratPacId(histTratPacId));
		model.addAttribute("segP", this.seguimientoPacientesServices.findSeguimientoPacientesByTratPacId(histTratPacId));
		model.addAttribute("salida", salida);
		return "tratamientoPaciente/tratamientoPacienteDetalle";
	}
	
	
}
