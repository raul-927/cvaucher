package uy.com.cvaucher.controller.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.AuxPrecios;
import uy.com.cvaucher.services.domain.ListaPrecios;
import uy.com.cvaucher.services.domain.ListaPreciosArray;
import uy.com.cvaucher.services.interfaces.AuxPreciosInt;
import uy.com.cvaucher.services.interfaces.ListaPreciosInt;


@Controller
@Transactional
public class FlowListaPreciosController 
{
	
	private final ListaPreciosInt listaPreciosService;
	private final AuxPreciosInt	auxPreciosService;
	private int	maxIdListaPrecios;
	private ListaPreciosArray listaPreciosArray;
	private AuxPrecios auxPrecios;
	
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
		this.auxPrecios = auxPrecios;
	}
	
	public void insertListaPreciosArray(ListaPreciosArray listaPreciosArray)
	{
		this.listaPreciosArray = listaPreciosArray;
	}
	
	@Transactional
	public void insertListaPreciosAuxPrecios()
	{
		this.listaPreciosService.insertListaPrecios(this.listaPreciosArray);
		this.auxPreciosService.insertAuxPrecios(this.auxPrecios);
	}
	
	
	
	
	
	
}
