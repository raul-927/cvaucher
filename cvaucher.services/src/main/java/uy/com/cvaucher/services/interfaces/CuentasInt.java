package uy.com.cvaucher.services.interfaces;

import java.util.Date;
import java.util.List;

import uy.com.cvaucher.services.domain.Cuentas;

public interface CuentasInt {
	void insertCuenta(Cuentas cuentas);
	Cuentas selectCuentaByCuentaDesc(String cuentaDesc);
	Cuentas selectCuentaByCuentaId(final int cuentaId);
	Cuentas selectCuentaByFecha(Date cuentaFecha);
	Cuentas selectCuentaByHora(Date cuentaHora);
	//Cuentas selectCuentaByFechaHora(Date cuentaFecha, Date cuentaHora);
	List<Cuentas> selectAllCuentas();
	

}
