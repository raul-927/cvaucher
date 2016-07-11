package uy.com.cvaucher.services.interfaces;

import java.util.ArrayList;
import java.util.List;

import uy.com.cvaucher.services.clases.MaxNumAsientoContable;
import uy.com.cvaucher.services.clases.ResumenPorCuentas;
import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.ResultadoCuentaAsientoTotal;

public interface AsientoContableInt {
	
	ResultadoCuentaAsientoTotal cuentaAsientoTotal();
	List<ResultadoCuentaAsientoTotal> cuentasAsientoTotal();
	void ingresarAsientoContable(ArrayList<AsientoContable> asientoContableList);
	MaxNumAsientoContable maxNumAsientoContable();
	MaxNumAsientoContable cantRegistros();
	List<ResumenPorCuentas> resumenPorCuentas(int cuentaTipo);
	List<ResumenPorCuentas> resumenPorCuentasTotalPorCaja(int cuentaTipo, int idCaja);

}
