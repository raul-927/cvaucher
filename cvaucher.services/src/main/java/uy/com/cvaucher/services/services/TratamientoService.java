package uy.com.cvaucher.services.services;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.TratByList;
import uy.com.cvaucher.services.domain.Tratamiento;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.mappers.TratamientoMapper;


@Service
@Transactional
//@PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and authentication.name == 'gaby')")
public class TratamientoService implements TratamientoInt
{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TratamientoMapper tratamientoMapper;
	
	@Override
	public List<Tratamiento> findAllTratamientos()
	{
		logger.debug("findAllTratamientos: ");
		List<Tratamiento> tratamiento = tratamientoMapper.findAllTratamientos();
		return tratamiento;
	}
	
	@Override
	public Tratamiento findTratamientoById(int tratId)
	{
		logger.debug("findTratamientoById: " +tratId);
		return tratamientoMapper.findTratamientoById(tratId);
	}
	
	@Override
	public void insertTratamiento(Tratamiento tratamiento)
	{
		tratamientoMapper.insertTratamiento(tratamiento);
	}
	
	@Override
	public void updateTratamiento(Tratamiento tratamiento)
	{
		tratamientoMapper.updateTratamiento(tratamiento);
	}
	
	@Override
	public void deleteTratamiento(int tratId)
	{
		tratamientoMapper.deleteTratamiento(tratId);
	}

	@Override
	public List<Tratamiento> findTratamientoByCedula(int cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findSesionesByTratamientoId(int tratId) {
		
		return tratamientoMapper.findSesionesByTratamientoId(tratId);
	}

	@Override
	public List<TratByList> findAllTratamientoByActualList() {
		
		return this.tratamientoMapper.findAllTratamientoByActualList();
	}

	@Override
	public TratByList findTratamientoByActualListById(int tratId) {
		// TODO Auto-generated method stub
		return  this.tratamientoMapper.findTratamientoByActualListById(tratId);
	}

	@Override
	public List<Tratamiento> findNewTratamiento() {
		// TODO Auto-generated method stub
		return this.tratamientoMapper.findNewTratamiento();
	}

}
