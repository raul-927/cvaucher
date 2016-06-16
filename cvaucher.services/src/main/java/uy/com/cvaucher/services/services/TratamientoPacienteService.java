package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.clases.SearchMaxTratPacId;
import uy.com.cvaucher.services.domain.MaxTratPacId;
import uy.com.cvaucher.services.domain.TratPacByCedula;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.interfaces.TratamientoPacienteInt;
import uy.com.cvaucher.services.mappers.TratamientoPacienteMapper;


@Service
@Transactional
//@PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and authentication.name == 'gaby')")
public class TratamientoPacienteService implements TratamientoPacienteInt {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TratamientoPacienteMapper tratamientoPacienteMapper;

	@Override
	public List<TratPacByCedula> findTratamientoPacienteByCedula(int cedula) {
		logger.debug("findTratamientoById: "+cedula);
		List<TratPacByCedula> tratamientoPaciente = this.tratamientoPacienteMapper.findTratamientoPacienteByCedula(cedula);
		return tratamientoPaciente;
	}

	@Override
	public List<TratamientoPaciente> findAllTratamientoPaciente() {
		List<TratamientoPaciente> tratamientoPaciente = this.tratamientoPacienteMapper.findAllTratamientoPaciente();
		return tratamientoPaciente;
	}

	@Override
	public void insertTratamientoPaciente(
			TratamientoPaciente tratamientoPaciente) {
			this.tratamientoPacienteMapper.insertTratamientoPacienteMapper(tratamientoPaciente);
	}

	@Override
	public void updateTratamientoPacienteImporte(TratamientoPaciente tratamientoPaciente) {
		this.tratamientoPacienteMapper.updateTratamientoPacienteImporte(tratamientoPaciente);

	}

	@Override
	public void deleteTratamientoPaciente(int tratPacId) {
		this.tratamientoPacienteMapper.deleteTratamientoPacienteMapper(tratPacId);

	}

	@Override
	public void updateTratamientoPacienteImporteByMaxId(TratamientoPaciente tratamientoPaciente) {
		this.tratamientoPacienteMapper.updateTratamientoPacienteImporteByMaxId(tratamientoPaciente);
		
	}

	@Override
	public MaxTratPacId findMaxTratPacId(SearchMaxTratPacId searchMaxTratPacId) {
		
		return this.tratamientoPacienteMapper.findMaxTratPacId(searchMaxTratPacId);
	}

}
