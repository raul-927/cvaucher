package uy.com.cvaucher.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.Impuesto;
import uy.com.cvaucher.services.interfaces.ImpuestoInt;
import uy.com.cvaucher.services.mappers.ImpuestoMapper;



@Service
@Transactional
public class ImpuestoService implements ImpuestoInt {
	
	@Autowired
	private ImpuestoMapper impuestoMapper;

	@Override
	public List<Impuesto> findAllImpuestos() {
		// TODO Auto-generated method stub
		return this.impuestoMapper.findAllImpuestos();
	}

	@Override
	public Impuesto findImpuestoById(int impuestoId) {
		// TODO Auto-generated method stub
		return this.impuestoMapper.findImpuestoById(impuestoId);
	}

	@Override
	public void insertImpuesto(Impuesto impuesto) {
		
		this.impuestoMapper.insertImpuesto(impuesto);

	}

}
