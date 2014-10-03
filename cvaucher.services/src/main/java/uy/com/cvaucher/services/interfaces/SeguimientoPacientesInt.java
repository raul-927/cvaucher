package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.SeguimientoPacientes;

public interface SeguimientoPacientesInt {
	
	List<SeguimientoPacientes> findAllSeguimientoPacientes();
	SeguimientoPacientes findSeguimientoPacientesByid( int pacId);
	void insertSeguimientoPacientes(SeguimientoPacientes segpacientes);
	void updateSeguimientoPacientes(SeguimientoPacientes segpacientes);
	void deleteSeguimientoPacientes(int pacId);
	
}
