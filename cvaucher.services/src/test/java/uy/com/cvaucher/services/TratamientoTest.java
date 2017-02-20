package uy.com.cvaucher.services;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.Tratamiento;
import uy.com.cvaucher.services.interfaces.TratamientoInt;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/test-Context.xml"})
public class TratamientoTest 
{
	
	@Autowired
	TratamientoInt tratamientoService;
	
	
	//@Test
	/*
	public void createNewTratamiento()
	{
		TipoTratamiento tipoTratamiento = new TipoTratamiento();
		tipoTratamiento.setTipTratId(1);
		tipoTratamiento.setTipTratDesc("Terapeutico");
		
		Tratamiento tratamiento = new Tratamiento();
		
		tratamiento.setTipoTratamiento(tipoTratamiento);
		tratamiento.setTratDescripcion("Masaje modelador");
		
		
		tratamientoService.insertTratamiento(tratamiento);
		
		assertNotNull(tratamiento);
		
		assertEquals(1,tratamiento.getTipoTratamiento().getTipTratId());
		assertEquals("Masaje modelador", tratamiento.getTratDescripcion());
	}*/
	
	//@Test
	public void selectTratamientoById()
	{
		Tratamiento tratamiento = new Tratamiento();
		tratamiento = tratamientoService.findTratamientoById(11);
		
		System.out.println("id =" +tratamiento.getTratId());
		System.out.println("TipoTratamiento =" +tratamiento.getTipoTratamiento());
		System.out.println("Descripcion = "+tratamiento.getTratDescripcion());
		System.out.println("Cantidad de Sesiones = "+tratamiento.getTratCantSesiones());
	}
	
	//@Test
	public void findSesionesByTratamiento()
	{
		int tratId = 11;
		int cantSes = tratamientoService.findSesionesByTratamientoId(tratId);
		System.out.println("Tratamiento 11, cantidad de SESIONES: "+cantSes);
	}
	
	@Test
	public void findNewTratamiento()
	{
		List<Tratamiento> tratamiento = this.tratamientoService.findNewTratamiento();
		System.out.println(" findNewTratamiento()");
		for(Tratamiento t:tratamiento){
			System.out.println("id = "+t.getTratId());
			System.out.println("Descripcion = "+t.getTratDescripcion());
			System.out.println("Cantidad Sesiones = "+t.getTratCantSesiones());
			
		}
	}
	
	

}
