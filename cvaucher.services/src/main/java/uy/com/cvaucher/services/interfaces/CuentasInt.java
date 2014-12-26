package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.Cuentas;

public interface CuentasInt {
	void insertarCuentas(Cuentas cuentas);
	Cuentas showCuentaById(int cuentaId);
	List<Cuentas> showAllCuentas();
	List<Cuentas> showCuentasByDescMov(String cuentaFormPagoDesc, String cuentaTipoMovimiento);
	List<Cuentas> showCuentasByDesc(String cuentaFormPagoDesc);
	

}
