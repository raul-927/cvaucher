package uy.com.cvaucher.services.services;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uy.com.cvaucher.services.clases.FormasDePagosDesc;
import uy.com.cvaucher.services.clases.MaxNumAsientoContable;
import uy.com.cvaucher.services.clases.SearchMaxTratPacId;
import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.Cuentas;
import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.domain.HistorialPagos;
import uy.com.cvaucher.services.domain.MaxTratPacId;
import uy.com.cvaucher.services.domain.PagoEfectivo;
import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.interfaces.AsientoContableInt;
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;
import uy.com.cvaucher.services.mappers.AsientoContableMapper;
import uy.com.cvaucher.services.mappers.FormasDePagosMapper;

import uy.com.cvaucher.services.mappers.HistorialPagosMapper;
import uy.com.cvaucher.services.mappers.PagoEfectivoMapper;
import uy.com.cvaucher.services.mappers.PagoTarjetaMapper;
import uy.com.cvaucher.services.mappers.TratamientoPacienteMapper;
import uy.com.cvaucher.services.jni.CvaucherJni;


@Service
@Transactional
public class FormasDePagosService implements FormasDePagosInt 
{
	@Autowired
	private FormasDePagosMapper formasDePagosMapper;
	
	@Autowired
	private TratamientoPacienteMapper tratamientoPacienteMapper;
	
	@Autowired
	private PagoTarjetaMapper pagoTarjetaMapper;
	
	@Autowired 
	private PagoEfectivoMapper pagoEfectivoMapper;
	
	@Autowired
	private HistorialPagosMapper historialPagosMapper;
	
	@Autowired 
	private AsientoContableInt asientoContableService;

	@Override
	public List<FormasDePagos> findAllFormasDePagos() 
	{
		return this.formasDePagosMapper.findAllFormasDePagos();
	}

	@Override
	public FormasDePagos findFormasDePagosById(Integer formPagId) 
	{
		return this.formasDePagosMapper.findFormasDePagosById(formPagId);
	}

	@Override
	public void insertFormasDePagos(FormasDePagos formasDePagos) 
	{
		this.formasDePagosMapper.insertFormasDePagos(formasDePagos);
	}

	@Override
	public void updateFormasDePagos(FormasDePagos formasDePagos) 
	{
		this.formasDePagosMapper.updateFormasDePagos(formasDePagos);
	}

	@Override
	public FormasDePagosDesc findFormPagoTipoByDesc(String formPagoDesc) 
	{
		return this.formasDePagosMapper.findFormPagoTipoByDesc(formPagoDesc);
	}

	@Override
	@Transactional
	public void insertTratamientoPagoTarjeta(TratamientoPaciente tratamientoPaciente, PagoTarjeta pagoTarjeta, int idCuenta) 
	{
		this.tratamientoPacienteMapper.insertTratamientoPacienteMapper(tratamientoPaciente);
		MaxTratPacId maxTratPacId = new MaxTratPacId();
		SearchMaxTratPacId search = new SearchMaxTratPacId();
		search.setCedula(tratamientoPaciente.getPacientes().getCedula());
		search.setFecha(tratamientoPaciente.getFecha());
		search.setTratId(tratamientoPaciente.getTratamId());
		HistorialPagos historialPagos = new HistorialPagos();
		
		int maxId = this.tratamientoPacienteMapper.findMaxTratPacId(search).getMaxId();
		maxTratPacId.setMaxId(maxId);
		historialPagos.setHistTratPacId(maxTratPacId.getMaxId());
		historialPagos.setHistPagosFechaPago(tratamientoPaciente.getFecha());
		historialPagos.setHistPagosMonto(tratamientoPaciente.getCostoTratSesion());
		
		pagoTarjeta.setTarjPagoId(maxTratPacId.getMaxId());
		this.pagoTarjetaMapper.insertPagoTarjeta(pagoTarjeta);
		historialPagos.setHistPagosTipo(pagoTarjeta.getTarjDesc());
		this.historialPagosMapper.insertHistorialPago(historialPagos);
		
		tratamientoPaciente.setTratPacId(maxTratPacId.getMaxId());
		tratamientoPaciente.setImportePagado(historialPagos.getHistPagosMonto());
		
		Date fechaHoy = new Date();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
		String fecha = formatoFecha.format(fechaHoy);
		String hora = formatoHora.format(fechaHoy);
		Cuentas cuentaDebe = new Cuentas();
		Cuentas cuentaHaber = new Cuentas();
		cuentaDebe.setCuentaId(tratamientoPaciente.getTratamId());
		cuentaHaber.setCuentaId(idCuenta);
		BigDecimal debe = new BigDecimal(historialPagos.getHistPagosMonto());
		BigDecimal haber = new BigDecimal(historialPagos.getHistPagosMonto());
		AsientoContable asientoContable = new AsientoContable();
		asientoContable.setAsConFecha(fecha);
		asientoContable.setAsConHora(hora);
		asientoContable.setAsCuentaDebe(cuentaDebe);
		asientoContable.setAsCuentaDebeMonto(debe);
		asientoContable.setAsCuentaHaber(cuentaHaber);
		asientoContable.setAsCuentaHaberMonto(haber);
		int prueba = 0;
		MaxNumAsientoContable maxNumAsContable;
		maxNumAsContable = this.asientoContableService.maxNumAsientoContable();
		asientoContable.setAsConNro(maxNumAsContable.getMaxNum());
		this.asientoContableService.ingresarAsientoContable(asientoContable);
		this.tratamientoPacienteMapper.updateTratamientoPacienteImporte(tratamientoPaciente);
	}
	
	@Override
	@Transactional
	public void insertTratamientoPagoEfectivo(TratamientoPaciente tratamientoPaciente, PagoEfectivo pagoEfectivo, int idCuenta)
	{
		/*System.out.println("Inicio de CvaucherJni");
		CvaucherJni cvaucher = new CvaucherJni();
		int a = 10;
		int b = 30;
		int c = cvaucher.holaMundo(a, b);
		System.out.println("Desde Java, La suma de " +a+ " + " +b+ " = "+c);
		*/
		
		this.tratamientoPacienteMapper.insertTratamientoPacienteMapper(tratamientoPaciente);
		MaxTratPacId maxTratPacId = new MaxTratPacId();
		SearchMaxTratPacId search = new SearchMaxTratPacId();
		search.setCedula(tratamientoPaciente.getPacientes().getCedula());
		search.setFecha(tratamientoPaciente.getFecha());
		search.setTratId(tratamientoPaciente.getTratamId());
		HistorialPagos historialPagos = new HistorialPagos();
		List<FormasDePagos> formasDePago = this.formasDePagosMapper.findAllFormasDePagos();
		//asientoContable.setAsCuentaDebeMonto(pagoEfectivo.getPagoEfImporte());
		int maxId = this.tratamientoPacienteMapper.findMaxTratPacId(search).getMaxId();
		maxTratPacId.setMaxId(maxId);
		historialPagos.setHistTratPacId(maxTratPacId.getMaxId());
		historialPagos.setHistPagosFechaPago(tratamientoPaciente.getFecha());
		historialPagos.setHistPagosMonto(tratamientoPaciente.getCostoTratSesion());
		
		pagoEfectivo.setPagoEfId(maxTratPacId.getMaxId());
		this.pagoEfectivoMapper.insertPagoEfectivo(pagoEfectivo);
		historialPagos.setHistPagosTipo(pagoEfectivo.getPagoEfDesc());
		this.historialPagosMapper.insertHistorialPago(historialPagos);
		
		tratamientoPaciente.setTratPacId(maxTratPacId.getMaxId());
		tratamientoPaciente.setImportePagado(historialPagos.getHistPagosMonto());
		
		Date fechaHoy = new Date();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
		String fecha = formatoFecha.format(fechaHoy);
		String hora = formatoHora.format(fechaHoy);
		Cuentas cuentaDebe = new Cuentas();
		Cuentas cuentaHaber = new Cuentas();
		cuentaDebe.setCuentaId(tratamientoPaciente.getTratamId());
		cuentaHaber.setCuentaId(idCuenta);
		BigDecimal debe = new BigDecimal(historialPagos.getHistPagosMonto());
		BigDecimal haber = new BigDecimal(historialPagos.getHistPagosMonto());
		
		
		AsientoContable asientoContable = new AsientoContable();
		asientoContable.setAsConFecha(fecha);
		asientoContable.setAsConHora(hora);
		asientoContable.setAsCuentaDebe(cuentaDebe);
		asientoContable.setAsCuentaDebeMonto(debe);
		asientoContable.setAsCuentaHaber(cuentaHaber);
		asientoContable.setAsCuentaHaberMonto(haber);
		
		MaxNumAsientoContable maxNumAsContable;
		maxNumAsContable = this.asientoContableService.maxNumAsientoContable();
		asientoContable.setAsConNro(maxNumAsContable.getMaxNum());
		this.asientoContableService.ingresarAsientoContable(asientoContable);
		
		this.tratamientoPacienteMapper.updateTratamientoPacienteImporte(tratamientoPaciente);
	}
	@Override
	@Transactional
	public void insertTratamientoPagoCredito(TratamientoPaciente tratamientoPaciente, PagoEfectivo pagoEfectivo, int idCuenta)
	{

		tratamientoPaciente.setImportePagado(pagoEfectivo.getPagoEfImporte());
		
		this.tratamientoPacienteMapper.insertTratamientoPacienteMapper(tratamientoPaciente);
		MaxTratPacId maxTratPacId = new MaxTratPacId();
		SearchMaxTratPacId search = new SearchMaxTratPacId();
		search.setCedula(tratamientoPaciente.getPacientes().getCedula());
		search.setFecha(tratamientoPaciente.getFecha());
		search.setTratId(tratamientoPaciente.getTratamId());
		HistorialPagos historialPagos = new HistorialPagos();
		
		int maxId = this.tratamientoPacienteMapper.findMaxTratPacId(search).getMaxId();
		maxTratPacId.setMaxId(maxId);
		historialPagos.setHistTratPacId(maxTratPacId.getMaxId());
		historialPagos.setHistPagosFechaPago(tratamientoPaciente.getFecha());
		historialPagos.setHistPagosMonto(tratamientoPaciente.getImportePagado());
		
		pagoEfectivo.setPagoEfId(maxTratPacId.getMaxId());
		this.pagoEfectivoMapper.insertPagoEfectivo(pagoEfectivo);
		historialPagos.setHistPagosTipo(pagoEfectivo.getPagoEfDesc());
		this.historialPagosMapper.insertHistorialPago(historialPagos);
		
		tratamientoPaciente.setTratPacId(maxTratPacId.getMaxId());
		int costoTratSesion = tratamientoPaciente.getCostoTratSesion();
		int importePagado = tratamientoPaciente.getImportePagado();
		int saldoPendiente = costoTratSesion - importePagado;
		tratamientoPaciente.setSaldoPendiente(saldoPendiente);
		tratamientoPaciente.setImportePagado(0);
		
		Date fechaHoy = new Date();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
		String fecha = formatoFecha.format(fechaHoy);
		String hora = formatoHora.format(fechaHoy);
		Cuentas cuentaDebe = new Cuentas();
		Cuentas cuentaHaber = new Cuentas();
		cuentaDebe.setCuentaId(tratamientoPaciente.getTratamId());
		cuentaHaber.setCuentaId(idCuenta);
		BigDecimal debe = new BigDecimal(historialPagos.getHistPagosMonto());
		BigDecimal haber = new BigDecimal(historialPagos.getHistPagosMonto());
		AsientoContable asientoContable = new AsientoContable();
		asientoContable.setAsConFecha(fecha);
		asientoContable.setAsConHora(hora);
		asientoContable.setAsCuentaDebe(cuentaDebe);
		asientoContable.setAsCuentaDebeMonto(debe);
		asientoContable.setAsCuentaHaber(cuentaHaber);
		asientoContable.setAsCuentaHaberMonto(haber);
		
		MaxNumAsientoContable maxNumAsContable = this.asientoContableService.maxNumAsientoContable();
		asientoContable.setAsConNro(maxNumAsContable.getMaxNum());
		this.asientoContableService.ingresarAsientoContable(asientoContable);
		
		this.tratamientoPacienteMapper.updateTratamientoPacienteImporteCredito(tratamientoPaciente);
	}
}
