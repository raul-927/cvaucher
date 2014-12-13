package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.clases.SearchMaxTratPacId;
import uy.com.cvaucher.services.domain.MaxTratPacId;
import uy.com.cvaucher.services.domain.TratPacByCedula;
import uy.com.cvaucher.services.domain.TratamientoPaciente;

public interface TratamientoPacienteInt 
{
	List<TratPacByCedula> findTratamientoPacienteByCedula(int cedula);
	List<TratamientoPaciente> findAllTratamientoPaciente();
	MaxTratPacId findMaxTratPacId(SearchMaxTratPacId searchMaxTratPacId);
	
	void insertTratamientoPaciente(TratamientoPaciente tratamientoPaciente);
	void updateTratamientoPacienteImporte(TratamientoPaciente tratamientoPaciente);
	void updateTratamientoPacienteImporteByMaxId(TratamientoPaciente tratamientoPaciente);
	void deleteTratamientoPaciente(int tratPacId);
	
}
