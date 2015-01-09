package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.clases.FormasDePagosDesc;
import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.domain.TratamientoPaciente;

public interface FormasDePagosInt 
{
	List<FormasDePagos> findAllFormasDePagos();
	
	FormasDePagosDesc findFormPagoTipoByDesc(String formPagoDesc);
	
	FormasDePagos findFormasDePagosById(Integer formPagId);
	
	void insertFormasDePagos(FormasDePagos formasDePagos);
	
	void updateFormasDePagos(FormasDePagos formasDePagos);
	
	void insertTratamientoPagoTarjeta(TratamientoPaciente tratamientoPaciente, PagoTarjeta pagoTarjeta);
	
}
