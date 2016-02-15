package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.Agenda;

import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.mappers.AgendaMapper;

@Service
@Transactional
@PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and authentication.name == 'gaby')")
public class AgendaService implements AgendaInt
{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Autowired
	private AgendaMapper agendaMapper;
	
	
	@Override
	public List<Agenda> findAllAgenda()
	{
		logger.debug("findAllAgenda()");
		List<Agenda> agenda = agendaMapper.findAllAgenda();
		return agenda;
	}
	
	@Override
	public List<Agenda> findAgendaById(int pacId)
	{
		logger.debug("findAgendaById :"+pacId);
		List<Agenda> agenda = agendaMapper.findAgendaById(pacId);
		return agenda;
	}
	
	@Override
	public void insertAgenda(Agenda agenda)
	{
		logger.debug("insertAgenda :"+agenda);
		agendaMapper.insertAgenda(agenda);
	}
	
	@Override
	public void updateAgenda(Agenda agenda)
	{
		logger.debug("updateAgenda :"+agenda);
		agendaMapper.updateAgenda(agenda);
	}
	
	@Override
	public void deleteAgenda(int agPacId)
	{
		logger.debug("deleteAgenda :"+agPacId);
		agendaMapper.deleteAgenda(agPacId);
	}

	@Override
	public List<Agenda> findAgendaByCedula(int cedula) {
		logger.debug("findAgendaById :"+cedula);
		List<Agenda> agenda = agendaMapper.findAgendaByCedula(cedula);
		return agenda;
	}
	
}
