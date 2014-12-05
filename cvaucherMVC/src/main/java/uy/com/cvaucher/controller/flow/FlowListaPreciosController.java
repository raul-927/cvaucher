package uy.com.cvaucher.controller.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uy.com.cvaucher.services.domain.ListaPreciosArray;
import uy.com.cvaucher.services.interfaces.ListaPreciosInt;


@Controller
public class FlowListaPreciosController 
{
	
	private final ListaPreciosInt listaPreciosService;
	
	@Autowired
	public FlowListaPreciosController(ListaPreciosInt listaPreciosService)
	{
		this.listaPreciosService = listaPreciosService;
	}
	
	public void insertListaPrecios(ListaPreciosArray listaPreciosArray)
	{
		
		this.listaPreciosService.insertListaPrecios(listaPreciosArray);
	}
}