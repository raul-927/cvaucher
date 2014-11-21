package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.SeguimientoPacientes;

public interface SeguimientoPacientesInt {
	
	List<SeguimientoPacientes> findAllSeguimientoPacientes();
	List<SeguimientoPacientes> findSeguimientoPacientesByTratPacId( int tratPacId);
	void insertSeguimientoPacientes(SeguimientoPacientes seguimientoPacientes);
	void updateSeguimientoPacientes(SeguimientoPacientes seguimientoPacientes);
	void deleteSeguimientoPacientes(int segPacId);
	
}
