package uy.com.cvaucher.controller.flow;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import uy.com.cvaucher.services.domain.Caja;
import uy.com.cvaucher.services.interfaces.CajaInt;

@Controller
public class FlowCajasController {
	@Autowired
	private CajaInt cajaService;
	
	
	public FlowCajasController(){
		
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
}

