package uy.com.cvaucher.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.clases.MaxNumAsientoContable;
import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.ResultadoCuentaAsientoTotal;
import uy.com.cvaucher.services.interfaces.AsientoContableInt;
import uy.com.cvaucher.services.mappers.AsientoContableMapper;

@Service
@Transactional
public class AsientoContableService implements AsientoContableInt {
	
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
	public MaxNumAsientoContable maxNumAsientoContable() {
		MaxNumAsientoContable cantidadReg = this.cantRegistros();
		System.out.println("cantidadReg ==>> "+cantidadReg.getMaxNum());
		if(cantidadReg.getMaxNum() > 0){
			return this.asientoContableMapper.maxNumAsientoContable();
		}
		return cantidadReg;

	}

	@Override
	public MaxNumAsientoContable cantRegistros() {
		// TODO Auto-generated method stub
		MaxNumAsientoContable cantidadRegistros = this.asientoContableMapper.cantRegistros();
		//System.out.println("cantidadRegistros ==>> "+cantidadRegistros.getMaxNumAsientoContable());
		return cantidadRegistros;
	}

}
