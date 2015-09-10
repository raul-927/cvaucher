package uy.com.cvaucher.services;



import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import uy.com.cvaucher.services.domain.Agenda;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.interfaces.AgendaInt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/test-Context.xml"})
public class AgendaTest {
	
	@Autowired
	AgendaInt agendaService;
	
	@Test
	public void selectAllTipoTratamiento()
	{
	
		Pacientes pac = new Pacientes();
		pac.setPacId(1);
		List<Agenda> agenda = (List<Agenda>)   agendaService.findAgendaByCedula(19455549);
		
		for(Agenda ag: agenda)
		{
			System.out.println("Id de Agenda: " + ag.getAgPacId()+ ", Tipo de Agenda " + ag.getTipoAgenda() + " Dato "+ag.getDato());
			assertNotNull(ag);
		}
		
	}

}
