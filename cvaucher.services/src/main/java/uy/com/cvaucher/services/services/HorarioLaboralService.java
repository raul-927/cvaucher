package uy.com.cvaucher.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.HorarioLaboral;
import uy.com.cvaucher.services.interfaces.HorarioLaboralInt;
import uy.com.cvaucher.services.mappers.HorarioLaboralMapper;

@Service
@Transactional
public class HorarioLaboralService implements HorarioLaboralInt {

	@Autowired
	private HorarioLaboralMapper horarioLaboralMapper;
	
	@Override
	public List<HorarioLaboral> showHorarioLaboral(HorarioLaboral horarioLaboral) {
		// TODO Auto-generated method stub
		return horarioLaboralMapper.showHorarioLaboral(horarioLaboral);
	}

	@Override
	public List<HorarioLaboral> showAllHorarioLaboral() {
		// TODO Auto-generated method stub
		return horarioLaboralMapper.showAllHorarioLaboral();
	}

	@Override
	public void insertarHorarioLaboral(HorarioLaboral horarioLaboral) {
		// TODO Auto-generated method stub
		horarioLaboralMapper.insertJornadaLaboral(horarioLaboral);
	}

}
