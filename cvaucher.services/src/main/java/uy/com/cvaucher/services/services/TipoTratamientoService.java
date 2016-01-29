package uy.com.cvaucher.services.services;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.annotations.Acceso;
import uy.com.cvaucher.services.domain.TipoTratamiento;
import uy.com.cvaucher.services.interfaces.TipoTratamientoInt;
import uy.com.cvaucher.services.mappers.TipoTratamientoMapper;



@Service
@Transactional
//@PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and authentication.name == 'gaby')")
@Acceso
public class TipoTratamientoService implements TipoTratamientoInt{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TipoTratamientoMapper tipoTratamientoMapper;
	
	//@PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and authentication.name == 'gaby')")
	public List<TipoTratamiento> findAllTipoTratamiento(){	
		List<TipoTratamiento> tipoTratamiento = tipoTratamientoMapper.findAllTipoTratamiento();
		return tipoTratamiento;
	}
	

	public TipoTratamiento findTipoTratamientoById(Integer tipTratId){
		logger.debug("findTipoTratamientoById :"+tipTratId);
		return tipoTratamientoMapper.findTipoTratamientoById(tipTratId);
	}
	
	@Override
	//@PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and authentication.name == 'gaby')")
	public void createTipoTratamiento(TipoTratamiento tipoTratamiento){
		tipoTratamientoMapper.insertTipoTratamiento(tipoTratamiento);
	}
	

	public void updateTipoTratamiento(TipoTratamiento tipoTratamiento){
		tipoTratamientoMapper.updateTipoTratamiento(tipoTratamiento);
	}


	@Override
	public void deleteTipoTratamiento(int tipTratId) {
		tipoTratamientoMapper.deleteTipoTratamiento(tipTratId);
		
	}


	@Override
	public void deleteTipoTratamientoByDesc(String tipTratDesc) {
		tipoTratamientoMapper.deleteTipoTratamientoByDesc(tipTratDesc);
		
	}
	
}
