package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.Sesiones;

public interface SesionesInt {
	List<Sesiones> findAllSesiones();
	List<Sesiones> findSesionesById(int sesId);
	List<Sesiones> findSesionesByPacId(int pacId);
	void insertSesiones(Sesiones sesiones);
	void updateSesiones(Sesiones sesiones);
	void deleteSesiones(int sesId);

}
