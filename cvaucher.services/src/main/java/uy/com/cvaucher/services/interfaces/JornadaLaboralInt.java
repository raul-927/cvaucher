package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.JornadaLaboral;

public interface JornadaLaboralInt {
	List<JornadaLaboral> showJornadaLaboral(JornadaLaboral jornadaLaboral);
	List<JornadaLaboral> showAllJornadaLaboral();
	void insertarJornadaLaboral(JornadaLaboral jornadaLaboral);
	
	
}
