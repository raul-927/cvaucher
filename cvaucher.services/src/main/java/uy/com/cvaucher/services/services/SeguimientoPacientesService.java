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
	public List<SeguimientoPacientes> findSeguimientoPacientesByTratPacId( int tratPacId) {

		logger.debug("findSeguimientoPacientesByid : "+tratPacId);
		
		List<SeguimientoPacientes> seguimientoPacientes = seguimientoPacientesMapper.findSeguimientoPacientesByTratPacId(tratPacId);
		return seguimientoPacientes;
	}

	@Override
	public void insertSeguimientoPacientes(SeguimientoPacientes seguimientoPacientes) {
		
		logger.debug("insertSeguimientoPacientes : "+seguimientoPacientes);
		
		seguimientoPacientesMapper.insertSeguimientoPacientes(seguimientoPacientes);

	}

	@Override
	public void updateSeguimientoPacientes(SeguimientoPacientes seguimientoPacientes) {

		seguimientoPacientesMapper.updateSeguimientoPacientes(seguimientoPacientes);
		
	}

	@Override
	public void deleteSeguimientoPacientes(int segPacId) {
		
		logger.debug("deleteSeguimientoPacientes : "+segPacId);
		
		seguimientoPacientesMapper.deleteSeguimientoPacientes(segPacId);
		
	}

}
