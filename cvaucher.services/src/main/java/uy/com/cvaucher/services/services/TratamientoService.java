package uy.com.cvaucher.services.services;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.Tratamiento;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.mappers.TratamientoMapper;


@Service
@Transactional
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
	
}
