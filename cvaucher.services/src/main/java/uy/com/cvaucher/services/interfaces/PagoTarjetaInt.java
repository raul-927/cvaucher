package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.PagoTarjeta;

public interface PagoTarjetaInt 
{
	void insertPagoTarjeta(PagoTarjeta pagoTarjeta);
	List<PagoTarjeta> showPagoTarjetaByCaja(int idCaja);

}
