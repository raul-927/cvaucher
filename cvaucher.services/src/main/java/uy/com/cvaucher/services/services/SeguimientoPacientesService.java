package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import uy.com.cvaucher.services.domain.SeguimientoPacientes;
import uy.com.cvaucher.services.interfaces.SeguimientoPacientesInt;
import uy.com.cvaucher.services.mappers.SeguimientoPacientesMapper;

@Service
@Transactional
public class SeguimientoPacientesService implements SeguimientoPacientesInt 
{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SeguimientoPacientesMapper seguimientoPacientesMapper;

	@Override
	public List<SeguimientoPacientes> findAllSeguimientoPacientes() {

		logger.debug("findAllSeguimientoPacientes :");
		return seguimientoPacientesMapper.findAllSeguimientoPacientes();
	}

	@Override
	public SeguimientoPacientes findSeguimientoPacientesByid(int pacId) {

		logger.debug("findSeguimientoPacientesByid : "+pacId);
		
		return seguimientoPacientesMapper.findSeguimientoPacientesByid(pacId);
	}

	@Override
	public void insertSeguimientoPacientes(SeguimientoPacientes segpacientes) {
		
		logger.debug("insertSeguimientoPacientes : "+segpacientes);
		
		seguimientoPacientesMapper.insertSeguimientoPacientes(segpacientes);

	}

	@Override
	public void updateSeguimientoPacientes(SeguimientoPacientes segpacientes) {

		seguimientoPacientesMapper.updateSeguimientoPacientes(segpacientes);
		
	}

	@Override
	public void deleteSeguimientoPacientes(int pacId) {
		
		logger.debug("deleteSeguimientoPacientes : "+pacId);
		
		seguimientoPacientesMapper.deleteSeguimientoPacientes(pacId);
		
	}

}
