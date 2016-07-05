package uy.com.cvaucher.controller.flow;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.clases.FormasDePagosDesc;
import uy.com.cvaucher.services.clases.MaxNumAsientoContable;
import uy.com.cvaucher.services.clases.SearchMaxTratPacId;
import uy.com.cvaucher.services.domain.Agenda;
import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.AsientoContableArray;
import uy.com.cvaucher.services.domain.Caja;
import uy.com.cvaucher.services.domain.Cuentas;
import uy.com.cvaucher.services.domain.Direccion;
import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.domain.HistoriaClinica;
import uy.com.cvaucher.services.domain.Impuesto;
import uy.com.cvaucher.services.domain.MaxTratPacId;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.PagoEfectivo;
import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.domain.TratByList;
import uy.com.cvaucher.services.domain.TratPacByCedula;
import uy.com.cvaucher.services.domain.Tratamiento;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.interfaces.AsientoContableInt;
import uy.com.cvaucher.services.interfaces.CajaInt;
import uy.com.cvaucher.services.interfaces.CuentasInt;
import uy.com.cvaucher.services.interfaces.DireccionInt;
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;
import uy.com.cvaucher.services.interfaces.HistoriaClinicaInt;
import uy.com.cvaucher.services.interfaces.ImpuestoInt;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.interfaces.TratamientoPacienteInt;

@Controller
public class FlowPacientesController 
{
	private final PacientesInt 				pacientesServices;
	private final TratamientoInt			tratamientoServices;
	private final DireccionInt 				direccionServices;
	private final AgendaInt 				agendaServices;
	private final HistoriaClinicaInt		historiaClinicaServices;
	private final TratamientoPacienteInt	tratamientoPacienteServices;
	private final FormasDePagosInt			formasDePagosServices;
	private final AsientoContableInt		asientoContableServices;
	private final CajaInt					cajaServices;
	private final CuentasInt				cuentasServices;
	private final ImpuestoInt				impuestoServices;
	
	private  static Pacientes 				pacientes ;
	private String 							fechaAux;
	private BigDecimal 						total = new BigDecimal("00");
	private TratamientoPaciente				tratamientoPaciente;
	private FormasDePagosDesc				formasDePagosDesc;
	
	
	@Autowired
	public FlowPacientesController(PacientesInt 			pacientesServices, 
									DireccionInt 			direccionServices,
									AgendaInt 				agendaServices,
									TratamientoInt			tratamientoServices,
									HistoriaClinicaInt		historiaClinicaServices,
									TratamientoPacienteInt 	tratamientoPacienteServices,
									FormasDePagosInt		formasDePagosServices,
									AsientoContableInt 		asientoContableServices,
									CajaInt					cajaServices,
									CuentasInt				cuentasServices,
									ImpuestoInt				impuestoServices)
	{
		this.pacientesServices			 = pacientesServices;
		this.tratamientoServices		 = tratamientoServices;
		this.direccionServices 			 = direccionServices;
		this.agendaServices 			 = agendaServices;
		this.historiaClinicaServices 	 = historiaClinicaServices;
		this.tratamientoPacienteServices = tratamientoPacienteServices;
		this.formasDePagosServices 		 = formasDePagosServices;
		this.asientoContableServices	 = asientoContableServices;
		this.cajaServices 				 = cajaServices;
		this.cuentasServices			 = cuentasServices;
		this.impuestoServices			 = impuestoServices;
	}
	
	public void insertPacientes(Pacientes pacientes)
	{
		this.pacientesServices.insertPacientes(pacientes);
	}
	
	public void insertDireccion(Direccion direccion)
	{
		this.direccionServices.insertDireccion(direccion);
	}
	
	public void insertAgenda(Agenda agenda)
	{
		this.agendaServices.insertAgenda(agenda);
	}
	
	public void insertHistoriaClinica(HistoriaClinica historiaClinica)
	{
		this.historiaClinicaServices.insertHistoriaClinica(historiaClinica);
	}
	
	public void insertTratamientoPaciente(TratamientoPaciente tratamientoPaciente)
	{
		this.tratamientoPaciente = tratamientoPaciente;
		this.tratamientoPacienteServices.insertTratamientoPaciente(this.tratamientoPaciente);
	}
	
	public void setTratamientoPaciente(TratamientoPaciente tratamientoPaciente)
	{
		this.tratamientoPaciente = tratamientoPaciente;
		
	}
	public TratamientoPaciente getTratamientoPaciente()
	{
		return this.tratamientoPaciente;
	}
	
	public List<Direccion>findDireccionByCedula(int pacCedula)
	{
		List<Direccion> direc = this.direccionServices.findDireccionByCedula(pacCedula);
		return direc;
	}
	
	public List<Agenda> findAgendaByCedula(int cedula)
	{
		List<Agenda>age = this.agendaServices.findAgendaByCedula(cedula);
		return age;
	}
	
	public List<TratPacByCedula> findTratamientoPacienteByCedula(int cedula)
	{
		List<TratPacByCedula> tratPac = this.tratamientoPacienteServices.findTratamientoPacienteByCedula(cedula);
		return tratPac;
	}
	
	public List<Tratamiento> findNewTratamientos()
	{
		return this.tratamientoServices.findNewTratamiento();
	}
	
	public Tratamiento findTratamientoById(int tratId)
	{
		return this.tratamientoServices.findTratamientoById(tratId);
	}
	
	public int findSesionesByTratamiento(int tratId)
	{
		return this.tratamientoServices.findSesionesByTratamientoId(tratId);
	}
	
	public List<Tratamiento> findAllTratamientos()
	{
		List<Tratamiento> tratamiento =  this.tratamientoServices.findAllTratamientos();
		return tratamiento;
	}

	public Pacientes findPacientesByCedula(int cedula)
	{
		return this.pacientesServices.findPacientesByCedula(cedula);
	}
	
	@RequestMapping(value ="/detallep/detPac/{pacCedula}", params ="actualizar", method = RequestMethod.GET)
	public String showIngresarTratamientoMain(Model model, @PathVariable("pacCedula") int pacCedula)
	{
		pacientes = pacientesServices.findPacientesByCedula(pacCedula);
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setPacientes(pacientes);
		model.addAttribute(tratamientoPaciente);
		//model.addAttribute("tratP", tratamientoServices.findAllTratamientos());
		
		return "redirect:/tratamientos";
	}
	
	@RequestMapping(value ="/detallep/detPac/{pacCedula}/{histTratPacId}", params ="actualizar", method = RequestMethod.GET)
	public String showIngresarTratamientoEnTratamiento(Model model, @PathVariable("pacCedula") int pacCedula)
	{
		
		pacientes = pacientesServices.findPacientesByCedula(pacCedula);
		
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setPacientes(pacientes);
		model.addAttribute(tratamientoPaciente);
		//model.addAttribute("tratP", tratamientoServices.findAllTratamientoByActualList());
		
		return "redirect:/tratamientos";
	}
	
	public List<TratByList>findAllTratamientoByActualList()
	{
		return this.tratamientoServices.findAllTratamientoByActualList();
	}
	
	public static void setPacientes(Pacientes pacientes)
	{
		FlowPacientesController.pacientes = pacientes;
	}
	
	public  static Pacientes returnPacientes()
	{
		return pacientes;
	}
	public String getFecha()
	{
		Date hoy = new Date();
		String patron = "YYYY-MM-dd";
		SimpleDateFormat formato = new SimpleDateFormat(patron);
		String salida = formato.format(hoy);
		return salida;
	}
	
	public MaxTratPacId findMaxTratPacId(SearchMaxTratPacId searchMaxTratPacId)
	{
		MaxTratPacId aux = this.tratamientoPacienteServices.findMaxTratPacId(searchMaxTratPacId);
		return aux;
	}
	
	public TratByList findTratamientoByActualListById(int tratId)
	{
		return this.tratamientoServices.findTratamientoByActualListById(tratId);
	}
	
	public void setFechaAux(String fecha)
	{
		this.fechaAux = fecha;
	}
	
	public String getFechaAux()
	{
		return this.fechaAux;
	}
	
	public List<FormasDePagos> findAllFormasDePagos()
	{	
		return this.formasDePagosServices.findAllFormasDePagos(null);
	}
	
	public FormasDePagosDesc findFormPagoTipoByDesc(String formPagAbreviacion)
	{
		this.formasDePagosDesc = this.formasDePagosServices.findFormPagoTipoByDesc(formPagAbreviacion);
		return this.formasDePagosServices.findFormPagoTipoByDesc(formPagAbreviacion);
	}
	
	public FormasDePagos findAllFormasDePagoById(FormasDePagos formasDePagos){
		return (FormasDePagos) this.formasDePagosServices.findAllFormasDePagos(formasDePagos);
	}
	
	public void insertTratamientoPagoTarjeta(TratamientoPaciente tratamientoPaciente, PagoTarjeta pagoTarjeta, FormasDePagosDesc formasDePagoDesc)
	{
		this.insertAsientoContable(tratamientoPaciente, formasDePagoDesc);
		this.formasDePagosServices.insertTratamientoPagoTarjeta(tratamientoPaciente, pagoTarjeta, formasDePagoDesc.getFormasDePagoCuenta());
	}
	
	public void insertTratamientoPagoEfectivo(TratamientoPaciente tratamientoPaciente, PagoEfectivo pagoEfectivo,  FormasDePagosDesc formasDePagoDesc)
	{
		//pagoEfectivo.setPagoEfImporte(total.intValue());
		this.insertAsientoContable(tratamientoPaciente, formasDePagoDesc);
		this.formasDePagosServices.insertTratamientoPagoEfectivo(tratamientoPaciente, pagoEfectivo,formasDePagoDesc.getFormasDePagoCuenta());
	}
	
	public void insertTratamientoPagoCredito(TratamientoPaciente tratamientoPaciente, PagoEfectivo pagoEfectivo,  FormasDePagosDesc formasDePagoDesc)
	{
		this.insertAsientoContable(tratamientoPaciente, formasDePagoDesc);
		this.formasDePagosServices.insertTratamientoPagoCredito(tratamientoPaciente, pagoEfectivo, formasDePagoDesc.getFormasDePagoCuenta());
	}
	public FormasDePagosDesc getFormasDePagosDesc(){
		return this.formasDePagosDesc;
	}
	public Caja cargoCajaActual(){
		Caja caja = this.cajaServices.cargoCajaActual();
		return caja;
	}
	public MaxNumAsientoContable maxNumAsientoContable(){
		return this.asientoContableServices.maxNumAsientoContable();
	}
	
	private void insertAsientoContable(TratamientoPaciente tratamientoPaciente, FormasDePagosDesc formasDePagoDesc){
		ArrayList<AsientoContable> asientoContableList = new ArrayList<AsientoContable>();
		
		Caja caja = this.cajaServices.cargoCajaActual();
		System.out.println("Caja==>> "+caja.getCajaId() + ", "+caja.getCajaEstado());
		Cuentas asCuentaL1 = this.cuentasServices.selectCuentaByCuentaId(formasDePagoDesc.getFormasDePagoCuenta());
		BigDecimal asCuentaDebeMontoL1 = new BigDecimal((double)tratamientoPaciente.getCostoTratSesion());
		BigDecimal asCuentaHaberMontoL1 = new BigDecimal((double)00);
		
		Tratamiento tratamiento = this.tratamientoServices.findTratamientoById(tratamientoPaciente.getTratamId());
		Cuentas cuentaImp = this.cuentasServices.selectCuentaByCuentaId(tratamiento.getImpuesto().getImpuestoCuenta().getCuentaId());
		
		Cuentas cuentaTratamiento = new Cuentas();
		cuentaTratamiento.setCuentaId(12);
		cuentaTratamiento.setCuentaDesc(tratamiento.getTratDescripcion());
		cuentaTratamiento.setCuentaTipo(3);
	
		
		MaxNumAsientoContable asConNro = this.asientoContableServices.maxNumAsientoContable();
		System.out.println("asConNro ==>> "+asConNro.getMaxNum());
		AsientoContable asientoContableL1 = new AsientoContable();
		AsientoContable asientoContableL2 = new AsientoContable();
		AsientoContable asientoContableL3 = new AsientoContable();
		
		asientoContableL1.setAsConNro(asConNro.getMaxNum());
		asientoContableL2.setAsConNro(asConNro.getMaxNum());
		asientoContableL3.setAsConNro(asConNro.getMaxNum());
		
		asientoContableL1.setCaja(caja);
		asientoContableL2.setCaja(caja);
		asientoContableL3.setCaja(caja);
		
		System.out.println("cuentaImp ==>> "+cuentaImp.getCuentaDesc());

		BigDecimal asImpDebeMonto = new BigDecimal("00");
		BigDecimal impuesto = tratamiento.getImpuesto().getImpuestoValor();
		System.out.println("asCuentaDebeMonto ==>> "+asCuentaDebeMontoL1);
		System.out.println("asImpDebeMonto ==>> "+asImpDebeMonto);
		BigDecimal aux = asCuentaDebeMontoL1.multiply(impuesto);
		BigDecimal divisor = new BigDecimal("100.00");
		BigDecimal resultado = aux.divide(divisor);
		BigDecimal asImpHaberMonto = new BigDecimal("00");
		this.total = asCuentaDebeMontoL1.subtract(resultado);
		asImpHaberMonto.add(resultado);
		System.out.println("resultado ==>> "+resultado);
		System.out.println("total ==>> "+total);
		
		asientoContableL1.setAsCuentaDebe(asCuentaL1);
		asientoContableL1.setAsCuentaHaber(asCuentaL1);
		asientoContableL1.setAsCuentaDebeMonto(asCuentaDebeMontoL1);
		asientoContableL1.setAsCuentaHaberMonto(asCuentaHaberMontoL1);
		asientoContableL1.setAsConDescripcion(asCuentaL1.getCuentaDesc());
		asientoContableL1.setAsCuentaTipo(asCuentaL1.getCuentaTipo());
		
		System.out.println("asCuentaL1.getCuentaTipo ==>> "+asCuentaL1.getCuentaTipo());
		
		asientoContableL2.setAsCuentaDebe(cuentaImp);
		asientoContableL2.setAsCuentaHaber(cuentaImp);
		asientoContableL2.setAsCuentaDebeMonto(asImpDebeMonto);
		asientoContableL2.setAsCuentaHaberMonto(resultado);
		asientoContableL2.setAsConDescripcion(cuentaImp.getCuentaDesc());
		asientoContableL2.setAsCuentaTipo(cuentaImp.getCuentaTipo());
		
		System.out.println("cuentaImp.getCuentaTipo() ==>> "+cuentaImp.getCuentaTipo());
		
		asientoContableL3.setAsCuentaDebe(cuentaTratamiento);
		asientoContableL3.setAsCuentaHaber(cuentaTratamiento);
		asientoContableL3.setAsCuentaDebeMonto(asImpDebeMonto);
		asientoContableL3.setAsCuentaHaberMonto(total);
		asientoContableL3.setAsConDescripcion(cuentaTratamiento.getCuentaDesc());
		asientoContableL3.setAsCuentaTipo(cuentaTratamiento.getCuentaTipo());
		System.out.println("cuentaTratamiento.getCuentaTipo() ==>> "+cuentaTratamiento.getCuentaTipo());
		asientoContableList.add(asientoContableL1);
		asientoContableList.add(asientoContableL2);
		asientoContableList.add(asientoContableL3);
		
		
		this.asientoContableServices.ingresarAsientoContable(asientoContableList);
	}
	
	public void procesoAsientoContable(){
		Caja caja = this.cajaServices.cargoCajaActual();
		
	}
	
}
