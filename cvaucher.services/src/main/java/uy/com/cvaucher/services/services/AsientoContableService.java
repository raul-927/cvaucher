package uy.com.cvaucher.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.ResultadoCuentaAsientoTotal;
import uy.com.cvaucher.services.mappers.AsientoContableMapper;

@Service
@Transactional
public class AsientoContableService implements uy.com.cvaucher.services.interfaces.AsientoContableInt {
	
	@Autowired
	private AsientoContableMapper asientoContableMapper;
	
	@Override
	public ResultadoCuentaAsientoTotal cuentaAsientoTotal() {
		// TODO Auto-generated method stub
		return this.asientoContableMapper.cuentaAsientoTotal();
	}

	@Override
	public List<ResultadoCuentaAsientoTotal> cuentasAsientoTotal() {
		// TODO Auto-generated method stub
		return this.asientoContableMapper.cuentasAsientoTotal();
	}

	@Override
	public void ingresarAsientoContable(AsientoContable asientoContable) {
		this.asientoContableMapper.ingresarAsientoContable(asientoContable);
	}

	@Override
	public int maxNumAsientoContable() {
		// TODO Auto-generated method stub
		return this.asientoContableMapper.maxNumAsientoContable();
	}

}
