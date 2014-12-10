package uy.com.cvaucher.controller.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uy.com.cvaucher.services.domain.AuxPrecios;
import uy.com.cvaucher.services.domain.ListaPrecios;
import uy.com.cvaucher.services.domain.ListaPreciosArray;
import uy.com.cvaucher.services.interfaces.AuxPreciosInt;
import uy.com.cvaucher.services.interfaces.ListaPreciosInt;


@Controller
public class FlowListaPreciosController 
{
	
	private final ListaPreciosInt listaPreciosService;
	private final AuxPreciosInt	auxPreciosService;
	private int	maxIdListaPrecios;
	
	@Autowired
	public FlowListaPreciosController(ListaPreciosInt listaPreciosService, AuxPreciosInt auxPreciosService)
	{
		this.listaPreciosService = listaPreciosService;
		this.auxPreciosService = auxPreciosService;
	}
	
	
	
	public void insertListaPrecios(ListaPreciosArray listaPreciosArray)
	{	
		
		this.listaPreciosService.insertListaPrecios(listaPreciosArray);
		
	}
	public int findMaxIdListaPrecios()
	{
		this.maxIdListaPrecios = this.listaPreciosService.findMaxIdListaPrecios().getMaxIdListPrecios();
		
		return this.maxIdListaPrecios;
	}
	
	public ListaPrecios findListaPreciosById(int listPrecId)
	{
		return this.listaPreciosService.findListaPreciosById(listPrecId);
	}
	
	public void insertAuxPrecios(AuxPrecios auxPrecios)
	{
		this.auxPreciosService.insertAuxPrecios(auxPrecios);
	}
	
	
}
