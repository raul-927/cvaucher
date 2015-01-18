package uy.com.cvaucher.services.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.PagoEfectivo;
import uy.com.cvaucher.services.interfaces.PagoEfectivoInt;
import uy.com.cvaucher.services.mappers.PagoEfectivoMapper;


@Service
@Transactional
public class PagoEfectivoService implements PagoEfectivoInt 
{
	
	@Autowired
	private PagoEfectivoMapper pagoEfectivoMapper;
	
	@Override
	public void insertPagoEfectivo(PagoEfectivo pagoEfectivo) 
	{
		this.pagoEfectivoMapper.insertPagoEfectivo(pagoEfectivo);

	}

}
