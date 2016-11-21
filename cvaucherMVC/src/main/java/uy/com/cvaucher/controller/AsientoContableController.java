package uy.com.cvaucher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import uy.com.cvaucher.services.domain.TipoTratamiento;
import uy.com.cvaucher.services.interfaces.TipoTratamientoInt;

@Controller
public class AsientoContableController {
	public final TipoTratamientoInt tipoTratamientoService;
	
	@Autowired
	public AsientoContableController(TipoTratamientoInt tipoTratamientoService){
		this.tipoTratamientoService = tipoTratamientoService;
	}
	
	@RequestMapping(value="/prueba", headers ={"Accept=text/html, application/json"}, method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody 
	public String getPrueba(){
		System.out.println("Centro Estetico Vaucher REST!!");
		return "Centro Estetico Vaucher REST!!";
	}
	
	@RequestMapping(value ="/prueba2", headers ={"Accept=text/html, application/json"}, method =RequestMethod.GET, produces ={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody TipoTratamiento getTipoTratamiento(){
		TipoTratamiento tipoTratamiento = tipoTratamientoService.findTipoTratamientoById(1);
		return tipoTratamiento;
	}

}
