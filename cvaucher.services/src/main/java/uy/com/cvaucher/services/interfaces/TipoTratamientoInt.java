package uy.com.cvaucher.services.interfaces;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

import uy.com.cvaucher.services.domain.TipoTratamiento;

public interface TipoTratamientoInt {
	
	List<TipoTratamiento> findAllTipoTratamiento();
	TipoTratamiento findTipoTratamientoById(Integer tipTratId);
	
	//@PreAuthorize("isFullyAuthenticated()")
	//@RolesAllowed("hasRole('ROLE_ADMIN')or (hasRole('ROLE_USER') and T(uy.com.cvaucher.services.security.User).getUsername() =='raul')")
	@Secured("ROLE_ADMIN")
	void createTipoTratamiento(TipoTratamiento tipoTratamiento);
	void updateTipoTratamiento(TipoTratamiento tipoTratamiento);
	void deleteTipoTratamiento(int tipTratId);
	void deleteTipoTratamientoByDesc(String tipTratDesc);

}
