package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.Agenda;


public interface AgendaInt 
{
	 List<Agenda> findAllAgenda();
	 List<Agenda> findAgendaById(int pacId);
	 List<Agenda> findAgendaByCedula(int cedula);
	 void insertAgenda(Agenda  agenda);
	 void updateAgenda(Agenda agenda);
	 void deleteAgenda(int agPacId);
	 

	
}
