package uy.com.cvaucher.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.AuxPrecios;
import uy.com.cvaucher.services.interfaces.AuxPreciosInt;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:root-Context.xml")
public class AuxPreciosTest {

	@Autowired
	AuxPreciosInt auxPreciosServices;
	
	
	
	@Test
	public void insertAuxPreciosTest()
	{
		int listPrecId = 1;
		String auxPrecDescripcion = "Lista 1";
		String auxPrecFechIni ="2014-12-10";
		String auxPrecFechFin = "2014-12-11";
		
		
		AuxPrecios auxPrecios = new AuxPrecios();
		auxPrecios.setAuxListaPreciosId(listPrecId);
		auxPrecios.setAuxPrecDescripcion(auxPrecDescripcion);
		auxPrecios.setAuxPrecFechIni(auxPrecFechIni);
		auxPrecios.setAuxPrecFechFin(auxPrecFechFin);
		
		this.auxPreciosServices.insertAuxPrecios(auxPrecios);
	}

}
