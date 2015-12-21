package uy.com.cvaucher.services;



import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.TipoTratamiento;
import uy.com.cvaucher.services.interfaces.TipoTratamientoInt;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="test-Context.xml")
public class TipoTratamientoTest 
{
	
	@Autowired
	TipoTratamientoInt tipoTratamientoService;
	
	
	
	@Test
	public void createNewTipoTratamiento()
	{
		TipoTratamiento tipoTratamiento = new TipoTratamiento();
		
		
		TipoTratamiento tp = tipoTratamientoService.findTipoTratamientoById(tipoTratamiento.getTipTratId());
		System.out.println("Id =  "+ tp.getTipTratId());
		System.out.println("Descripcion = " +tp.getTipTratDesc());
		
		assertNotNull(tipoTratamiento);
		assertEquals("Estetico", tipoTratamiento.getTipTratDesc());
	}
	
	@Test
	public void selectAllTipoTratamiento()
	{
	
		List<TipoTratamiento> tipoTratamiento = tipoTratamientoService.findAllTipoTratamiento();
		
		for(TipoTratamiento t: tipoTratamiento)
		{
			System.out.println("Id de Tratamiento: " + t.getTipTratId() + ", Tratamiento " + t.getTipTratDesc());
			assertNotNull(t);
		}
		
	}
	
	
	

}
