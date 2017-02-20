package uy.com.cvaucher.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.SeguimientoPacientes;
import uy.com.cvaucher.services.interfaces.SeguimientoPacientesInt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/test-Context.xml"})
public class SeguimientoPacienteTest
{
	@Autowired
	SeguimientoPacientesInt seguimientoPacientesServices;
	
	//@Test
	public void insertSeguimientoPacienteTest()
	{
		SeguimientoPacientes segPac = new SeguimientoPacientes();
		
		segPac.setTratPacId(43);
		segPac.setFechControl("2014-11-21");
		segPac.setBrazoI(42);
		segPac.setBrazoD(42);
		segPac.setMuzloI(60);
		segPac.setMuzloD(60);
		segPac.setAbdomen(60);
		segPac.setCintura(40);
		segPac.setCadera(40);
		segPac.setPeso(60);
		segPac.setImc(40.1);
		segPac.setObservaciones("Prueba2");
		seguimientoPacientesServices.insertSeguimientoPacientes(segPac);
		assertNotNull(segPac);
	}
	
	@Test
	public void showSeguimientoPacientes(){
		List<SeguimientoPacientes> segPac = seguimientoPacientesServices.findAllSeguimientoPacientes();
		
		for(SeguimientoPacientes sp:segPac){
			System.out.println(sp.getAbdomen());
			System.out.println(sp.getTratPacId());
			System.out.println(sp.getSegPacId());
		}
	}
	
}
