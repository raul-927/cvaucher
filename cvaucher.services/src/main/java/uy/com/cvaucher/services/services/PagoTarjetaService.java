package uy.com.cvaucher.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.interfaces.PagoTarjetaInt;
import uy.com.cvaucher.services.mappers.PagoTarjetaMapper;

@Service
@Transactional
public class PagoTarjetaService implements PagoTarjetaInt 
{
	@Autowired
	private PagoTarjetaMapper pagoTarjetaMapper;
	
	@Override
	public void insertPagoTarjeta(PagoTarjeta pagoTarjeta) 
	{
		this.pagoTarjetaMapper.insertPagoTarjeta(pagoTarjeta);

	}

	@Override
	public List<PagoTarjeta> showPagoTarjetaByCaja(int idCaja) {

		return this.pagoTarjetaMapper.showPagoTarjetaByCaja(idCaja);
	}

}
