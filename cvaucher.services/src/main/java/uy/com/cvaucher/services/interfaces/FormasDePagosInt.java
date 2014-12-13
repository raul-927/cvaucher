package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.FormasDePagos;

public interface FormasDePagosInt 
{
	List<FormasDePagos> findAllFormasDePagos();
	
	FormasDePagos findFormasDePagosById(Integer formPagId);
	
	void insertFormasDePagos(FormasDePagos formasDePagos);
	
	void updateFormasDePagos(FormasDePagos formasDePagos);
	
}
