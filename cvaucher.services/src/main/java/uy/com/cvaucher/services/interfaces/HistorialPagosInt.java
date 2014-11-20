package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.HistorialPagos;

public interface HistorialPagosInt 
{
	List<HistorialPagos> findHistorialPagoByHistTratPacId(int histTratPacId);
	
	void insertHistorialPago(HistorialPagos historialPagos);

}
