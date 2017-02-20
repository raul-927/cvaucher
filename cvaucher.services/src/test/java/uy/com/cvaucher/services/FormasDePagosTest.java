package uy.com.cvaucher.services;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/test-Context.xml"})
public class FormasDePagosTest 
{
	@Autowired
	FormasDePagosInt formasDePagosServices;
	
	@Test
	public void selectAllFormasDePagos()
	{
		List<FormasDePagos> formasPagos = this.formasDePagosServices.findAllFormasDePagos(null);
		
		for(FormasDePagos fp: formasPagos)
		{
			System.out.println("ID = "+fp.getFormPagId());
			System.out.println("Abreviacion = "+fp.getFormPagAbreviacion());
			System.out.println("Descripcion = "+fp.getFormPagDesc());
			System.out.println("Tipo = "+fp.getFormPagTipo());
		}
	}
}
