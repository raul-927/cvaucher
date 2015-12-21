package uy.com.cvaucher.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.AuxPrecios;
import uy.com.cvaucher.services.domain.ListaPrecios;
import uy.com.cvaucher.services.domain.ListaPreciosArray;
import uy.com.cvaucher.services.interfaces.AuxPreciosInt;
import uy.com.cvaucher.services.interfaces.ListaPreciosInt;
import uy.com.cvaucher.services.mappers.AuxPreciosMapper;
import uy.com.cvaucher.services.mappers.ListaPreciosMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:root-Context.xml")
public class ListaPreciosTest 
{
	@Autowired
	ListaPreciosInt listaPreciosService;
	
	@Autowired 
	ListaPreciosMapper listam;
	@Autowired
	AuxPreciosInt auxPreciosMapper;
	
	@Test
	public void insertListaPreciosTest()
	{
		int listPrecId = 1;
		int listPrecTratId = 21;
		int listPrecMonto = 8500;
		Integer listprecId = (Integer)listPrecId;
		ListaPrecios listaPrecios = new ListaPrecios();
		listaPrecios.setListPrecId(listPrecId);
		listaPrecios.setListPrecTratId(listPrecTratId);
		listaPrecios.setListPrecMonto(listPrecMonto);
		//ListaPreciosArray listaPreciosArray = new ListaPreciosArray();
		listam.insertListaPrecios(listaPrecios);
		//this.listaPreciosService.insertListaPrecios(listaPreciosArray);
	}
	@Test
	public void insertAuxPreciosTest()
	{
		int listPrecId = 1;
		String auxPrecDescripcion = "Lista 1";
		String auxPrecFechIni ="10/12/2014";
		String auxPrecFechFin = "11/10/2014";
		
		
		AuxPrecios auxPrecios = new AuxPrecios();
		auxPrecios.setAuxListaPreciosId(listPrecId);
		auxPrecios.setAuxPrecDescripcion(auxPrecDescripcion);
		auxPrecios.setAuxPrecFechIni(auxPrecFechIni);
		auxPrecios.setAuxPrecFechFin(auxPrecFechFin);
		
		this.listaPreciosService.insertAuxPrecios(auxPrecios);
	}
	


}
