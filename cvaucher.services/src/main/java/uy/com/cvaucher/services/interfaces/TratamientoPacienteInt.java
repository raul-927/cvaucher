package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.TratPacByCedula;
import uy.com.cvaucher.services.domain.TratamientoPaciente;

public interface TratamientoPacienteInt 
{
	List<TratPacByCedula> findTratamientoPacienteByCedula(int cedula);
	List<TratamientoPaciente> findAllTratamientoPaciente();
	
	void insertTratamientoPaciente(TratamientoPaciente tratamientoPaciente);
	void updateTratamientoPacienteImporte(TratamientoPaciente tratamientoPaciente);
	void deleteTratamientoPaciente(int tratPacId);

}
