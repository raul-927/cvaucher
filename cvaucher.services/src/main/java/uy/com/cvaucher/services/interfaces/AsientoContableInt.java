package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.ResultadoCuentaAsientoTotal;

public interface AsientoContableInt {
	ResultadoCuentaAsientoTotal cuentaAsientoTotal();
	List<ResultadoCuentaAsientoTotal> cuentasAsientoTotal();
	void ingresarAsientoContable(AsientoContable asientoContable);

}
