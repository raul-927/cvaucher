package uy.com.cvaucher.controller.flow;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.clases.ResumenPorCuentas;
import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.Caja;
import uy.com.cvaucher.services.domain.ResultadoCuentaAsientoTotal;
import uy.com.cvaucher.services.enumerador.CuentaTipo;
import uy.com.cvaucher.services.interfaces.AsientoContableInt;
import uy.com.cvaucher.services.interfaces.CajaInt;
import uy.com.cvaucher.services.interfaces.PagoEfectivoInt;
import uy.com.cvaucher.services.interfaces.PagoTarjetaInt;

@Controller
public class FlowCajasController{
	
	
	private final CajaInt cajaService;
	private final AsientoContableInt asientoContableService;
	private final PagoEfectivoInt	 pagoEfectivoService;
	private final PagoTarjetaInt 	 pagoTarjetaService;
	
	@Autowired
	public FlowCajasController(CajaInt cajaService, 
								AsientoContableInt 	asientoContableService,
								PagoEfectivoInt 	pagoEfectivoService,
								PagoTarjetaInt 		pagoTarjetaService){
		this.cajaService = cajaService;
		this.asientoContableService = asientoContableService;
		this.pagoEfectivoService 	= pagoEfectivoService;
		this.pagoTarjetaService 	= pagoTarjetaService;
	}
	public String showDate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date hoy = new Date();
		String fecha = dateFormat.format(hoy);
		return fecha;
	}
	
	public String showHora(){
		SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm.ss");
		Date hoy = new Date();
		String hora = horaFormat.format(hoy);
		return hora;
	}
	
	public Caja aperturaCaja(){
		Caja caja = new Caja();
		caja = this.cajaService.aperturaCaja();
		if(caja.getCajaEstado().equals(null)){
			caja.setCajaEstado("CERRADO");
			caja.setCajaFecha("2000-01-01");
			caja.setCajaHora("00:00:00");
			caja.setCajaUsr("Inicio");
			caja.setCajaId(0);
			this.cajaService.insertarCaja(caja);
		}
		System.out.println("Estado Caja = "+caja.getCajaEstado());
		System.out.println("Usuario caja = "+caja.getCajaUsr());
		return caja;
	}
	
	public void insertarInicioCajaNull(){
		Caja caja = new Caja();
		caja.setCajaEstado("CERRADO");
		caja.setCajaFecha("2016-01-01");
		caja.setCajaHora("00:00:00");
		caja.setCajaUsr("Inicio");
		this.cajaService.insertarCaja(caja);
	}
	public void insertarInicioCaja(Caja caja){
		this.cajaService.insertarCaja(caja);
	}
	public String  showUser(){
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
		getPrincipal();
		System.out.println("user ==>> "+user.getUsername());
		return user.getUsername();
	}
	@RequestMapping(value ="/caja",params ="resumen", method = RequestMethod.GET)
	public String showResumenCaja(Model model, AsientoContable asientoContable){
		
		Caja caja = this.cajaService.cargoCajaActual();
		int idCaja = caja.getCajaId();
		
		List<ResumenPorCuentas> rs = asientoContableService.resumenPorCuentasTotalPorCaja(CuentaTipo.VENTA.getCodigo(), idCaja);
		
		System.out.println("idCaja ==>> "+idCaja);
		model.addAttribute(new AsientoContable());
		model.addAttribute("resumenCuentas",asientoContableService.resumenPorCuentasTotalPorCaja(CuentaTipo.VENTA.getCodigo(), idCaja));
		return "caja/resumenCaja";
	}
	
	@RequestMapping(value = "caja/detalle/${tipo}/${cuenta}", method = RequestMethod.GET)
	public String showResumenCajaCuenta(Model model, @PathVariable("tipo")String tipo, @PathVariable("cuenta")String cuenta){
		String resultado ="";
		Caja caja = this.cajaService.cargoCajaActual();
		int idCaja = caja.getCajaId();
		System.out.println("Caja actual en FlowCajasController = "+idCaja);
		if(tipo.equals("EF")||tipo.equals("CE")){
			
			model.addAttribute("pagoEfectivo", this.pagoEfectivoService.showPagoEfectivoByCaja(idCaja, cuenta));
			resultado = "cajaResumen/efectivo";
		}
		if(tipo.equals("TC")||tipo.equals("TD")){
			model.addAttribute("pagoTarjeta", this.pagoTarjetaService.showPagoTarjetaByCaja(idCaja, cuenta));
			resultado = "cajaResumen/tarjetaCredito";
		}
		if(tipo.equals("DP")){
			resultado = "cajaResumen/depositoBancario";
		}
		return resultado;
	}
}

