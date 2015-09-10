package uy.com.cvaucher.services;



import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.interfaces.PacientesInt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-Context.xml"})
public class PacientesTest {
	
	@Autowired
	PacientesInt pacientesService;
	
	
	
	@Test
	public void selectAllPacientes()
	{
	
		List<Pacientes> pacientes = (List<Pacientes>)   pacientesService.findAllPacientes();
		
		for(Pacientes pac: pacientes)
		{
			System.out.println("Id de Paciente: " + pac.getPacId()+ ", Nombre " + pac.getPacNombre() + " Apellido " +pac.getPacApellido());
			assertNotNull(pac);
		}
	}
	
	@Test
	public void selectPacientesByCedula()
	{
		int cedula = 19455549;
		Pacientes pacientes =  pacientesService.findPacientesByCedula(cedula);
		
			System.out.println("Id de Paciente: " + pacientes.getPacId()+ ", Nombre " + pacientes.getPacNombre() 
			+ " Apellido " +pacientes.getPacApellido());
			assertNotNull(pacientes);

	}
	
	
	@Test
		public void selectPacientesByNombre()
		{
			String pacNombre ="Raul";
			List<Pacientes> pacientes = (List<Pacientes>)   pacientesService.findPacientesByNombre(pacNombre);
			
			for(Pacientes pac: pacientes)
			{
				System.out.println("Id de Paciente: " + pac.getPacId()+ ", Nombre " + pac.getPacNombre() + " Apellido " +pac.getPacApellido());
				assertNotNull(pac);
			}
		}
	
	@Test
	public void selectPacientesByApellido()
	{
		String pacApellido ="Hernandez";
		List<Pacientes> pacientes = (List<Pacientes>)   pacientesService.findPacientesByApellido(pacApellido);
		
		for(Pacientes pac: pacientes)
		{
			System.out.println("Id de Paciente: " + pac.getPacId()+ ", Nombre " + pac.getPacNombre() + " Apellido " +pac.getPacApellido());
			assertNotNull(pac);
		}
	}
	
	@Test
	public void selectPacientesByNombreAndApellido()
	{
		String pacNombre ="Raul";
		String pacApellido ="Hernandez";
		List<Pacientes> pacientes = (List<Pacientes>)   pacientesService.findPacientesByNombreAndApellido(pacNombre, pacApellido);
		
		for(Pacientes pac: pacientes)
		{
			System.out.println("Id de Paciente: " + pac.getPacId()+ ", Nombre " + pac.getPacNombre() + " Apellido " +pac.getPacApellido());
			assertNotNull(pac);
		}
	}

}
