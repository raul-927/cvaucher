package uy.com.cvaucher.services.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.Caja;
import uy.com.cvaucher.services.interfaces.CajaInt;
import uy.com.cvaucher.services.mappers.CajaMapper;

@Service
@Transactional
public class CajaService implements CajaInt {
	
	@Autowired
	private CajaMapper cajaMapper;
	
	@Override
	public Caja aperturaCaja() {
		Caja caja = this.cajaMapper.aperturaCaja();
		return caja;
	}

	@Override
	public void insertarCaja(Caja caja) {
		this.cajaMapper.insertarCaja(caja);

	}

	@Override
	public void cerrarCaja(Caja caja) {
		this.cajaMapper.cerrarCaja(caja);

	}

}
