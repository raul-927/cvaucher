package uy.com.cvaucher.controller;

import org.springframework.ui.Model;


//@Controller()
//@RequestMapping("/main")
public class MainController
{
	/*
	private final PacientesInt 				pacientesServices;
	private final DireccionInt 				direccionServices;
	private final SesionesInt 				sesionesServices;
	private final HistoriaClinicaInt 		historiaClinicaServices;
	private final SeguimientoPacientesInt	seguimientoPacientesServices;
	private final TratamientoInt			tratamientoServices;
	private final AgendaInt					agendaServices;
	
	private PacientesSearch pacientesSearch;
*/
	//@Autowired
	public MainController(){

		
}
	
	
	
	
	//@RequestMapping(method = RequestMethod.GET)
	public String mainMenu()
	{
		return "login";
	}
	
	
	
	
	
	//@RequestMapping(method = RequestMethod.GET)
	public String ShowSearchPacientes(Model model)
	{
		
		
		return "/login";
	}
	
	
	
}
