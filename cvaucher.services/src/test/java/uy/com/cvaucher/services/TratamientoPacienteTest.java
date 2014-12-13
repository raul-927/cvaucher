package uy.com.cvaucher.services;

import java.util.List;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.MaxTratPacId;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.interfaces.TratamientoPacienteInt;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:root-Context.xml")
public class TratamientoPacienteTest {
	
	@Autowired
	TratamientoPacienteInt tratamientoPacienteService;
	

	@Test
	public void updateTratamientoPacienteImporteTest()
	{	
		
		int cedula = 19455549;
		Pacientes pacientes = new Pacientes();
		pacientes.setCedula(cedula);
		pacientes.setPacNombre("Raul");
		pacientes.setPacApellido("Hernandez");
		pacientes.setPacId(132);
		int tratPacId = 11;
		int importePagado = 200;
		String fecha = "2014-12-12";
		TratamientoPaciente tratamientoPaciente = new TratamientoPaciente();
		tratamientoPaciente.setTratPacId(tratPacId);
		tratamientoPaciente.setPacientes(pacientes);
		tratamientoPaciente.setFecha(fecha);
	
		//MaxTratPacId maxTratPacId = this.tratamientoPacienteService.findMaxTratPacId(tratamientoPaciente);
		//int aux = maxTratPacId.getMaxId();
		//System.out.println("Max id = "+aux);
		//tratamientoPacienteService.updateTratamientoPacienteImporte(tratamientoPaciente);
		//tratamientoPaciente =  (TratamientoPaciente) this.tratamientoPacienteService.findTratamientoPacienteByCedula(tratamientoPaciente.getPacientes().getCedula());
		//assertNotNull(tratamientoPaciente);
	}
	
	public void selectMaxId()
	{
		int cedula = 41578943;
		int tratPacId = 41;
		int importePagado = 200;
	}
}
