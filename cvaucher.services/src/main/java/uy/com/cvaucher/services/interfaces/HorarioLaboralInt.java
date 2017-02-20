package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.HorarioLaboral;

public interface HorarioLaboralInt {
	List<HorarioLaboral> showHorarioLaboral(HorarioLaboral horarioLaboral);
	List<HorarioLaboral> showAllHorarioLaboral();
	void insertarHorarioLaboral(HorarioLaboral horarioLaboral);
	
	
}
