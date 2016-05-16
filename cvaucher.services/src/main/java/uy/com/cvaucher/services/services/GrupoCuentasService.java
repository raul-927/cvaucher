package uy.com.cvaucher.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.GrupoCuentas;
import uy.com.cvaucher.services.interfaces.GrupoCuentasInt;
import uy.com.cvaucher.services.mappers.GrupoCuentasMapper;


@Service
@Transactional
public class GrupoCuentasService implements GrupoCuentasInt {
	@Autowired
	private GrupoCuentasMapper grupoCuentasMapper;
	
	@Override
	public void insertGrupoCuentas(GrupoCuentas grupoCuentas) {

		this.grupoCuentasMapper.insertGrupoCuentas(grupoCuentas);

	}

	@Override
	public List<GrupoCuentas> showAllGrupoCuentas() {
		
		return this.grupoCuentasMapper.showAllGrupoCuentas();
	}

}
