package uy.com.cvaucher.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.enumerador.TiposFormasDePagos;
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;
import uy.com.cvaucher.services.interfaces.CuentasInt;

@Controller
@RequestMapping("/formasDePagos")
public class FormasDePagosController 
{
	private ArrayList<Integer>grupoCuentaId = new ArrayList<Integer>();
	private final FormasDePagosInt formasDePagosServices;
	private final CuentasInt		cuentasService;
	@Autowired
	public FormasDePagosController(FormasDePagosInt formasDePagosServices, CuentasInt cuentasService)
	{
		this.formasDePagosServices = formasDePagosServices;
		this.cuentasService = cuentasService;
		grupoCuentaId.add(7);
		grupoCuentaId.add(8);
		grupoCuentaId.add(9);
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "insert")
	public String showFormasDePagos(Model model, FormasDePagos formasDePagos)
	{
		
		
		model.addAttribute(new FormasDePagos());
		model.addAttribute("forPag", this.formasDePagosServices.findAllFormasDePagos(null));
		model.addAttribute("tiposPagos",TiposFormasDePagos.values());
		model.addAttribute("cuentas",this.cuentasService.selectAllCuentasByGrupo(grupoCuentaId));
		return "formasDePagos/insertFormasDePagos";
	}
	
	@RequestMapping(method = RequestMethod.POST, params = "insert")
	public String insertFormasDePagos(Model model, @Valid FormasDePagos formasDePagos, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en insertar Tipos de Pagos"+bindingResult.getAllErrors());
			model.addAttribute(new FormasDePagos());
			model.addAttribute("forPag", this.formasDePagosServices.findAllFormasDePagos(null));
			model.addAttribute("tiposPagos",TiposFormasDePagos.values());
			model.addAttribute("cuentas",this.cuentasService.selectAllCuentasByGrupo(grupoCuentaId));
		}
		this.formasDePagosServices.insertFormasDePagos(formasDePagos);
		model.addAttribute(new FormasDePagos());
		model.addAttribute("forPag", this.formasDePagosServices.findAllFormasDePagos(null));
		model.addAttribute("tiposPagos",TiposFormasDePagos.values());
		
		
		model.addAttribute("cuentas",this.cuentasService.selectAllCuentasByGrupo(grupoCuentaId));
		return "formasDePagos/insertFormasDePagos";
	}
}
