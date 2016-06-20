package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.Sesiones;
import uy.com.cvaucher.services.interfaces.SesionesInt;
import uy.com.cvaucher.services.mappers.SesionesMapper;


//@Service
//@Transactional
public class SesionesService implements SesionesInt {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SesionesMapper sesionesMapper;
	
	@Override
	public List<Sesiones> findAllSesiones() {
		
		logger.debug("findAllSesiones :");
		
		return sesionesMapper.findAllSesiones();
	}

	@Override
	public List<Sesiones> findSesionesById(int sesId) {
		
		logger.debug("findSesionesById :"+sesId);

		return sesionesMapper.findSesionesById(sesId);
	}

	@Override
	public void insertSesiones(Sesiones sesiones) {

		logger.debug("insertSesiones :"+sesiones);
		
		sesionesMapper.insertSesiones(sesiones);

	}

	@Override
	public void updateSesiones(Sesiones sesiones) {
		
		logger.debug("updateSesiones :"+sesiones);

		sesionesMapper.updateSesiones(sesiones);

	}

	@Override
	public void deleteSesiones(int sesId) {
		
		logger.debug("deleteSesiones :"+sesId);

		sesionesMapper.deleteSesiones(sesId);

	}

	@Override
	public List<Sesiones> findSesionesByPacId(int pacId) 
	{
		logger.debug("insertSesiones :"+pacId);
		return sesionesMapper.findSesionesByPacId(pacId);
	}

}
