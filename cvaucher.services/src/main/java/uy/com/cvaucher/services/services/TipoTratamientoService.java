package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import uy.com.cvaucher.services.domain.TipoTratamiento;
import uy.com.cvaucher.services.interfaces.TipoTratamientoInt;
import uy.com.cvaucher.services.mappers.TipoTratamientoMapper;



@Service
@Transactional
public class TipoTratamientoService implements TipoTratamientoInt
{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TipoTratamientoMapper tipoTratamientoMapper;
	
	
	public List<TipoTratamiento> findAllTipoTratamiento() 
	{	
		List<TipoTratamiento> tipoTratamiento = tipoTratamientoMapper.findAllTipoTratamiento();
		return tipoTratamiento;
	}
	

	public TipoTratamiento findTipoTratamientoById(Integer tipTratId)
	{
		logger.debug("findTipoTratamientoById :"+tipTratId);
		return tipoTratamientoMapper.findTipoTratamientoById(tipTratId);
	}
	
	@Override
	@Secured({"ROLE_USER", "ROLE_ADMIN"})
	public void createTipoTratamiento(TipoTratamiento tipoTratamiento)
	{
		tipoTratamientoMapper.insertTipoTratamiento(tipoTratamiento);
		//return tipoTratamiento;
	}
	

	public void updateTipoTratamiento(TipoTratamiento tipoTratamiento)
	{
		tipoTratamientoMapper.updateTipoTratamiento(tipoTratamiento);
	}


	@Override
	public void deleteTipoTratamiento(int tipTratId) 
	{
		tipoTratamientoMapper.deleteTipoTratamiento(tipTratId);
		
	}
	
}
