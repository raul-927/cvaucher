package uy.com.cvaucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uy.com.cvaucher.services.interfaces.CuentasInt;

@Controller
@RequestMapping("/cuentas")
public class CuentasController 
{
	@Autowired
	public CuentasController(CuentasInt CuentasService){
	}
	
	
	
}
