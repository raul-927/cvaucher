package uy.com.cvaucher.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.Cuentas;
import uy.com.cvaucher.services.interfaces.CuentasInt;
import uy.com.cvaucher.services.mappers.CuentasMapper;

@Service
@Transactional
public class CuentasService implements CuentasInt 
{
	
	@Autowired
	private CuentasMapper cuentasMapper;
	@Override
	public void insertarCuentas(Cuentas cuentas) 
	{
		this.cuentasMapper.insertarCuentas(cuentas);

	}

	@Override
	public Cuentas showCuentaById(int cuentaId) {
		// TODO Auto-generated method stub
		return this.cuentasMapper.showCuentaById(cuentaId);
	}

	@Override
	public List<Cuentas> showAllCuentas() {
		// TODO Auto-generated method stub
		return this.cuentasMapper.showAllCuentas();
	}

	@Override
	public List<Cuentas> showCuentasByDescMov(String cuentaFormPagoDesc,
			String cuentaTipoMovimiento) {
		// TODO Auto-generated method stub
		return this.cuentasMapper.showCuentasByDescMov(cuentaFormPagoDesc, cuentaTipoMovimiento);
	}

	@Override
	public List<Cuentas> showCuentasByDesc(String cuentaFormPagoDesc) {
		// TODO Auto-generated method stub
		return this.cuentasMapper.showCuentasByDesc(cuentaFormPagoDesc);
	}

}
