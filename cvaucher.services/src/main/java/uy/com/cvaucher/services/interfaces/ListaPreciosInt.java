package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.ListaPrecios;

public interface ListaPreciosInt {

	
	List<ListaPrecios> findAllListaPrecios();
	ListaPrecios findListaPreciosById(int listPrecId);
	void insertListaPrecios(ListaPrecios listaPrecios);
	void updateListaPrecios(ListaPrecios listaPrecios);
	void deleteListaPrecios(int listPrecId);
}
