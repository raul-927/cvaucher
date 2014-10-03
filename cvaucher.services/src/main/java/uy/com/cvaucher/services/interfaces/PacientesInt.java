package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.clases.SearchPacientes;
import uy.com.cvaucher.services.domain.Pacientes;

public interface PacientesInt 
{
	
	 
	Pacientes findPacientesById(int pacId);
	Pacientes findPacientesByCedula(int cedula);
	
	List<Pacientes> findAllPacientes();
	List<Pacientes> findPacientesByNombre(String pacNombre);
	List<Pacientes> findPacientesByApellido(String pacApellido);
	List<Pacientes> findPacientes(SearchPacientes searchPacientes);
	List<Pacientes> findPacientesByNombreAndApellido(String pacNombre, String pacApellido);
	void insertPacientes(Pacientes pacientes);
	void updatePacientes(Pacientes pacientes);
	void deletePacientes(int pacId);
	

}
