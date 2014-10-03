package uy.com.cvaucher.services.services;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.TipoAgenda;
import uy.com.cvaucher.services.interfaces.TipoAgendaInt;
import uy.com.cvaucher.services.mappers.TipoAgendaMapper;


@Service
@Transactional
public class TipoAgendaService implements TipoAgendaInt
{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TipoAgendaMapper tipoAgendaMapper;
	
	@Override
	public List<TipoAgenda> findAllTipoAgenda()
	{
		List<TipoAgenda> tipoAgenda = tipoAgendaMapper.findAllTipoAgenda();
		return tipoAgenda;
	}
	
	@Override
	public TipoAgenda findTipoAgendaById(int tpoAgId)
	{
		logger.debug("findTipoAgendaById :"+tpoAgId);
		return tipoAgendaMapper.findTipoAgendaById(tpoAgId);
	}
	
	@Override
	public void insertTipoAgenda(TipoAgenda tipoAgenda)
	{
		tipoAgendaMapper.insertTipoAgenda(tipoAgenda);
	}
	
	@Override
	public void updateTipoAgenda(TipoAgenda tipoAgenda)
	{
		tipoAgendaMapper.updateTipoAgenda(tipoAgenda);
	}
	
	@Override
	public void deleteTipoAgenda(int tpoAgId)
	{
		tipoAgendaMapper.deleteTipoAgenda(tpoAgId);
	}

}
