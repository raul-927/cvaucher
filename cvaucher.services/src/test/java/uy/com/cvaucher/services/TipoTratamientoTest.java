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
@ContextConfiguration(locations={"file:src/test/resources/test-Context.xml"})
public class TipoTratamientoTest 
{
	
	@Autowired
	TipoTratamientoInt tipoTratamientoService;
	
	
	@Test
	public void insertTipoTratamiento(){
		TipoTratamiento tipoTratamiento = new TipoTratamiento();
		tipoTratamiento.setTipTratDesc("TipoTratamientoPrueba");
		tipoTratamientoService.createTipoTratamiento(tipoTratamiento);
	}
	
	
	@Test
	public void findTipoTratamientoById(){
		TipoTratamiento tipoTratamiento = new TipoTratamiento();
		
		int tipTratId = 9;
		TipoTratamiento tp = tipoTratamientoService.findTipoTratamientoById(tipTratId);
		System.out.println("Id =  "+ tp.getTipTratId());
		System.out.println("Descripcion = " +tp.getTipTratDesc());
		
		assertNotNull(tipoTratamiento);
		assertEquals("Cuponera", tp.getTipTratDesc());
	}
	
	@Test
	public void findAllTipoTratamiento()
	{
	
		List<TipoTratamiento> tipoTratamiento = tipoTratamientoService.findAllTipoTratamiento();
		
		for(TipoTratamiento t: tipoTratamiento)
		{
			System.out.println("Id de Tratamiento: " + t.getTipTratId() + ", Tratamiento " + t.getTipTratDesc());
			assertNotNull(t);
		}
		
	}
	@Test
	public void deleteTipoTratamiento(){
		 String tipTratDesc ="TipoTratamientoPrueba";
		tipoTratamientoService.deleteTipoTratamientoByDesc(tipTratDesc);
	}
	
	
	

}
