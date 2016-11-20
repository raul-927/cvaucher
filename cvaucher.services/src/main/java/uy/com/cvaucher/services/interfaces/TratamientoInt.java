package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.TratByList;
import uy.com.cvaucher.services.domain.Tratamiento;

public interface TratamientoInt {
	
	 List<Tratamiento> findAllTratamientos();
	 List<Tratamiento> findTratamientoByCedula(int cedula);
	 
	 Tratamiento findTratamientoById(int tratId);
	 
	 List<TratByList> findAllTratamientoByActualList();
	 
	 List<Tratamiento> findNewTratamiento();
	 
	 TratByList findTratamientoByActualListById(int tratId);
	 
	 int findSesionesByTratamientoId(int tratId);
	 
	 void insertTratamiento(Tratamiento tratamiento);
	 void updateTratamiento(Tratamiento tratamiento);
	
	 void deleteTratamiento(int tratId);
	

}
