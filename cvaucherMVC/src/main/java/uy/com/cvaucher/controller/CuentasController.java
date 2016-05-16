package uy.com.cvaucher.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.cvaucher.services.interfaces.CuentasInt;
import uy.com.cvaucher.services.interfaces.GrupoCuentasInt;
import uy.com.cvaucher.services.domain.Cuentas;
import uy.com.cvaucher.services.enumerador.TiposMovimientos;

@Controller
@RequestMapping("/cuentas")
public class CuentasController 
{
	private final CuentasInt cuentasService;
	private final GrupoCuentasInt grupoCuentasService;
	
	@Autowired
	public CuentasController(CuentasInt cuentasService,GrupoCuentasInt grupoCuentasService){
		this.cuentasService = cuentasService;
		this.grupoCuentasService = grupoCuentasService;
	}
	
	@RequestMapping(value ="/cuenta",params ="insert", method = RequestMethod.GET)
	public String showInsertCuenta(Model model, Cuentas cuentas){
		
		model.addAttribute(new Cuentas());
		model.addAttribute("muestroCuentas", this.cuentasService.selectAllCuentas());
		model.addAttribute("allGrupoCuentas",this.grupoCuentasService.showAllGrupoCuentas());
		return "cuentas/cuentas";
	}
	
	@RequestMapping(value ="/cuenta",params ="insert", method = RequestMethod.POST)
	public String insertCuenta(Model model, @Valid Cuentas cuentas, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			
			model.addAttribute(new Cuentas());
			model.addAttribute("muestroCuentas", this.cuentasService.selectAllCuentas());
			model.addAttribute("allGrupoCuentas",this.grupoCuentasService.showAllGrupoCuentas());
			return "cuentas/cuentas";
		}
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		model.addAttribute(new Cuentas());
		this.cuentasService.insertCuenta(cuentas);
		model.addAttribute("muestroCuentas", this.cuentasService.selectAllCuentas());
		model.addAttribute("user",user.getUsername());
		model.addAttribute("fecha",this.showDate());
		model.addAttribute("hora",this.showHora());
		model.addAttribute("allGrupoCuentas",this.grupoCuentasService.showAllGrupoCuentas());
		return "cuentas/cuentas";
	}
	private String showDate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date hoy = new Date();
		String fecha = dateFormat.format(hoy);
		return fecha;
	}
	
	private String showHora(){
		SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm.ss");
		Date hoy = new Date();
		String hora = horaFormat.format(hoy);
		return hora;
	}
}
