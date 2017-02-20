package uy.com.cvaucher.services;



import static org.junit.Assert.*;

import java.util.List;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.interfaces.PacientesInt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/test-Context.xml"})
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
	
	@Test
	public void insertPacientes(){
		int cedula = 24578954;
		String pacNombre = "NombrTest";
		String pacApellido = "ApellidoTest";
		
		Pacientes pacientes = new Pacientes();
		pacientes.setCedula(cedula);
		pacientes.setPacNombre(pacNombre);
		pacientes.setPacApellido(pacApellido);
		pacientesService.insertPacientes(pacientes);
		Pacientes pac = pacientesService.findPacientesByCedula(cedula);
		System.out.println("Nombre = "+pac.getPacNombre());
		System.out.println("Apellido = "+pac.getPacApellido());
	}
	
	@Test
	public void deletePacientesByCedula(){
		int cedula = 24578954;
		pacientesService.deletePacientesByCedula(cedula);
	}

}
