package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.TipoTratamiento;

public interface TipoTratamientoInt {
	
	List<TipoTratamiento> findAllTipoTratamiento();
	TipoTratamiento findTipoTratamientoById(Integer tipTratId);
	void createTipoTratamiento(TipoTratamiento tipoTratamiento);
	void updateTipoTratamiento(TipoTratamiento tipoTratamiento);
	void deleteTipoTratamiento(int tipTratId);
	void deleteTipoTratamientoByDesc(String tipTratDesc);

}
