package uy.com.cvaucher.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.interfaces.TratamientoPacienteInt;


//@Controller
//@RequestMapping("/detallep")
public class PruebaController 
{
	private final PacientesInt pacientesServices;
	private final TratamientoInt tratamientoServices;
	//@Autowired
	public PruebaController(PacientesInt pacientesServices, TratamientoInt tratamientoServices
							,TratamientoPacienteInt tratamientoPacienteServices){
		this.pacientesServices = pacientesServices;
		this.tratamientoServices = tratamientoServices;
	}
	//@RequestMapping(value ="/detPac/{pacCedula}", params ="actualizar", method = RequestMethod.GET)
	public String showPrueba(Model model, @PathVariable("pacCedula") int pacCedula)
	{
		Pacientes pacientes = new Pacientes();
		pacientes = pacientesServices.findPacientesByCedula(pacCedula);
		
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setPacientes(pacientes);
		model.addAttribute(tratamientoPaciente);
		model.addAttribute("tratP", tratamientoServices.findAllTratamientos());
		
		return "nada/prueba";
	}
	
	//@RequestMapping(value ="/detPac/{pacCedula}", params ="actualizar", method = RequestMethod.POST)
	public String showPrueba1(Model model, @PathVariable("pacCedula") int pacCedula)
	{
		Pacientes pacientes = new Pacientes();
		pacientes = pacientesServices.findPacientesByCedula(pacCedula);
		
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setPacientes(pacientes);
		model.addAttribute(tratamientoPaciente);
		model.addAttribute("tratP", tratamientoServices.findAllTratamientos());
		
		return "nada/prueba";
	}
	
	//@RequestMapping(value ="/detPac/{pacCedula}", params ="insertTratamiento", method = RequestMethod.POST)
	public String cantSesionesTratamiento(Model model, @PathVariable("pacCedula") int pacCedula, @PathVariable("tratamId") int tratamId)
	{
		Pacientes pacientes = new Pacientes();
		pacientes = pacientesServices.findPacientesByCedula(pacCedula);
		
		TratamientoPaciente tratamientoPaciente  = new TratamientoPaciente();
		tratamientoPaciente.setPacientes(pacientes);
		model.addAttribute(tratamientoPaciente);
		model.addAttribute("tratP", tratamientoServices.findAllTratamientos());
		model.addAttribute("tratPacById", tratamientoServices.findTratamientoById(tratamId));
		//tratPacById
		
		return "nada/prueba";
	}

}
