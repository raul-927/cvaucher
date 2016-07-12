package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.PagoEfectivo;

public interface PagoEfectivoInt 
{
	void insertPagoEfectivo(PagoEfectivo pagoEfectivo);
	List<PagoEfectivo> showPagoEfectivoByCaja(int idCaja, String cuenta);

}
