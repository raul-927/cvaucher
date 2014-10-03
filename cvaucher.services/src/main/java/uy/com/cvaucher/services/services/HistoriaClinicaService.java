package uy.com.cvaucher.services.services;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.HistoriaClinica;
import uy.com.cvaucher.services.interfaces.HistoriaClinicaInt;
import uy.com.cvaucher.services.mappers.HistoriaClinicaMapper;

@Service
@Transactional
public class HistoriaClinicaService implements HistoriaClinicaInt
{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HistoriaClinicaMapper historiaClinicaMapper;
	
	@Override
	public List<HistoriaClinica> findAllHistoriaClinica()
	{
		List<HistoriaClinica> historiaClinica = historiaClinicaMapper.findAllHistoriaClinica();
		return historiaClinica;
	}
	
	
	@Override
	public void insertHistoriaClinica(HistoriaClinica historiaClinica)
	{
		historiaClinicaMapper.insertHistoriaClinica(historiaClinica);
	}
	
	@Override
	public void updateHistoriaClinica(HistoriaClinica historiaClinica)
	{
		historiaClinicaMapper.updateHistoriaClinica(historiaClinica);
	}
	
	@Override
	public void deleteHistoriaClinica(int histCliId)
	{
		historiaClinicaMapper.deleteHistoriaClinica(histCliId);
	}

	@Override
	public HistoriaClinica findHistoriaClinicaByCedula(int cedula) 
	{
		logger.debug("findHistoriaClinicaById :"+cedula);
		return historiaClinicaMapper.findHistoriaClinicaByCedula(cedula);
	}
	
	
}
