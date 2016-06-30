package uy.com.cvaucher.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uy.com.cvaucher.services.enumerador.TipoImpuesto;
import uy.com.cvaucher.services.domain.Impuesto;
import uy.com.cvaucher.services.interfaces.CuentasInt;
import uy.com.cvaucher.services.interfaces.ImpuestoInt;

@Controller
@RequestMapping("/impuestos")
public class ImpuestoController {
	
	private ArrayList<Integer> grupoCuentaId = new ArrayList<Integer>();
	private final ImpuestoInt impuestoService;
	private final CuentasInt  cuentasService;
	
	@Autowired
	public ImpuestoController(ImpuestoInt impuestoService, CuentasInt  cuentasService){
			this.impuestoService = impuestoService;
			this.cuentasService = cuentasService;
			grupoCuentaId.add(11);
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "insert")
	public String showImpuestoInsert(Model model, Impuesto impuesto){
		
		model.addAttribute(new Impuesto());
		model.addAttribute("impuestos",impuestoService.findAllImpuestos());
		model.addAttribute("cuenta", this.cuentasService.selectAllCuentasByGrupo(grupoCuentaId));
		model.addAttribute("tipImp",TipoImpuesto.values());
		
		
		return "impuesto/formImpuesto";
	}
	
	@RequestMapping(method = RequestMethod.POST, params = "insert")
	public String impuestoInsert(Model model, @Valid Impuesto impuesto, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			model.addAttribute(new Impuesto());
			model.addAttribute("impuestos",impuestoService.findAllImpuestos());
			model.addAttribute("cuenta", this.cuentasService.selectAllCuentasByGrupo(grupoCuentaId));
			model.addAttribute("tipImp",TipoImpuesto.values());
			return "impuesto/formImpuesto";
		}
		model.addAttribute(new Impuesto());
		impuestoService.insertImpuesto(impuesto);
		model.addAttribute("impuestos",impuestoService.findAllImpuestos());
		model.addAttribute("cuenta", this.cuentasService.selectAllCuentasByGrupo(grupoCuentaId));
		model.addAttribute("tipImp",TipoImpuesto.values());
		return "impuesto/formImpuesto";
	}
}
