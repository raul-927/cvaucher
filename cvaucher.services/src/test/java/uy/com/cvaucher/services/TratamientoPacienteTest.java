package uy.com.cvaucher.services;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
		int cedula = 41578943;
		int tratPacId = 41;
		int importePagado = 200;
		TratamientoPaciente tratamientoPaciente = new TratamientoPaciente();
		tratamientoPaciente.setTratPacId(tratPacId);
		tratamientoPaciente.setImportePagado(importePagado);
		
		tratamientoPacienteService.updateTratamientoPacienteImporte(tratamientoPaciente);
		tratamientoPaciente =  (TratamientoPaciente) this.tratamientoPacienteService.findTratamientoPacienteByCedula(tratamientoPaciente.getPacientes().getCedula());
		assertNotNull(tratamientoPaciente);
	}
}
