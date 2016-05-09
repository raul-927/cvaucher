package uy.com.cvaucher.services.interfaces;

import uy.com.cvaucher.services.domain.Caja;

public interface CajaInt {
	Caja aperturaCaja();
	void insertarCaja(Caja caja);
	void cerrarCaja(Caja caja);
}
