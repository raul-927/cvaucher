package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.SesionRealizada;
import uy.com.cvaucher.services.interfaces.SesionRealizadaInt;
import uy.com.cvaucher.services.mappers.SesionRealizadaMapper;


@Service
@Transactional
public class SesionRealizadaService implements SesionRealizadaInt 
{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SesionRealizadaMapper sesionRealizadaMapper;
	
	
	@Override
	public List<SesionRealizada> findAllSesionRealizada() 
	{
		logger.debug("findAllSesionRealizada :");
		List<SesionRealizada> sesRealizada = sesionRealizadaMapper.findAllSesionRealizada();
		return sesRealizada;
	}

	@Override
	public SesionRealizada findSesionRealizadaById(int sesRealizadaId) {
		
		logger.debug("findSesionRealizadaById :"+sesRealizadaId);
		
		return sesionRealizadaMapper.findSesionRealizadaById(sesRealizadaId);
	}

	@Override
	public void insertSesionRealizada(SesionRealizada sesionRealizada) {

		logger.debug("insertSesionRealizada :"+sesionRealizada);
		
		sesionRealizadaMapper.insertSesionRealizada(sesionRealizada);

	}

	@Override
	public void updateSesionRealizada(SesionRealizada sesionRealizada) {

		logger.debug("updateSesionRealizada :"+sesionRealizada);
		
		sesionRealizadaMapper.updateSesionRealizada(sesionRealizada);

	}

	@Override
	public void deleteSesionRealizada(int sesRealizadaId) {

		logger.debug("deleteSesionRealizada :"+sesRealizadaId);
		
		sesionRealizadaMapper.deleteSesionRealizada(sesRealizadaId);

	}

}
