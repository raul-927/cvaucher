package uy.com.cvaucher.services.interfaces;


import java.util.List;

import uy.com.cvaucher.services.domain.AuxPrecios;
import uy.com.cvaucher.services.domain.ListaPrecios;
import uy.com.cvaucher.services.domain.ListaPreciosArray;
import uy.com.cvaucher.services.domain.MaxIdListaPrecios;

public interface ListaPreciosInt {

	
	List<ListaPrecios> findAllListaPrecios();
	ListaPrecios findListaPreciosById(Integer listPrecId);
	void insertListaPrecios(ListaPreciosArray listaPreciosArray);
	void updateListaPrecios(ListaPrecios listaPrecios);
	void deleteListaPrecios(Integer listPrecId);
	MaxIdListaPrecios findMaxIdListaPrecios();
	
	void insertAuxPrecios(AuxPrecios auxPrecios);
}
