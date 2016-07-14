package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.clases.DescCuentaFormaDePago;
import uy.com.cvaucher.services.clases.FormasDePagosDesc;
import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.domain.PagoEfectivo;
import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.domain.TratamientoPaciente;

public interface FormasDePagosInt 
{
	List<FormasDePagos> findAllFormasDePagos(FormasDePagos formasDePagos);
	FormasDePagosDesc findFormPagoTipoByDesc(String formPagAbreviacion);
	DescCuentaFormaDePago cuentaFormaDePagoDesc(int cuentaId);
	
	void insertFormasDePagos(FormasDePagos formasDePagos);
	void updateFormasDePagos(FormasDePagos formasDePagos);
	void insertTratamientoPagoTarjeta(TratamientoPaciente tratamientoPaciente, PagoTarjeta pagoTarjeta, int idCuenta);
	void insertTratamientoPagoEfectivo(TratamientoPaciente tratamientoPaciente, PagoEfectivo pagoEfectivo, int idCuenta);
	void insertTratamientoPagoCredito(TratamientoPaciente tratamientoPaciente, PagoEfectivo pagoEfectivo, int idCuenta);
	
}
