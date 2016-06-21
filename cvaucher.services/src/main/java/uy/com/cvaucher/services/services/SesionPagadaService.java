package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.mappers.SesionPagadaMapper;
import uy.com.cvaucher.services.domain.SesionPagada;
import uy.com.cvaucher.services.interfaces.SesionPagadaInt;


//@Service
//@Transactional
public class SesionPagadaService implements SesionPagadaInt
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SesionPagadaMapper sesionPagadaMapper;
	
	
	@Override
	public List<SesionPagada> findAllSesionPagada() 
	{
		logger.debug("findAllSesionPagada :");
		
		List<SesionPagada> sesionPagada = sesionPagadaMapper.findAllSesionPagada();
		return sesionPagada;
	}

	@Override
	public SesionPagada findSesionById(int sesPagoId) 
	{
		
		logger.debug("findSesionById : " +sesPagoId);
		
		return sesionPagadaMapper.findSesionById(sesPagoId);
	}

	@Override
	public void insertSesionPagada(SesionPagada sesionPagada) 
	{
		logger.debug("insertSesionPagada : " +sesionPagada);
		
		sesionPagadaMapper.insertSesionPagada(sesionPagada);

	}

	@Override
	public void updateSesionPagada(SesionPagada sesionPagada)
	{
		logger.debug("updateSesionPagada : " +sesionPagada);
		
		sesionPagadaMapper.updateSesionPagada(sesionPagada);

	}

	@Override
	public void deleteSesionPagada(int sesPagoId) 
	{
		logger.debug("deleteSesionPagada : " +sesPagoId);
		
		sesionPagadaMapper.deleteSesionPagada(sesPagoId);

	}

}
