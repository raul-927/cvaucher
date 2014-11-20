package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.HistorialPagos;
import uy.com.cvaucher.services.interfaces.HistorialPagosInt;
import uy.com.cvaucher.services.mappers.HistorialPagosMapper;

@Service
@Transactional
public class HistorialPagosService implements HistorialPagosInt 
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HistorialPagosMapper historialPagosMapper;

	@Override
	public List<HistorialPagos> findHistorialPagoByHistTratPacId(int histTratPacId) 
	{
		logger.debug("findHistorialPagoByHistTratPacId "+histTratPacId);
		List<HistorialPagos> historialPagos = this.historialPagosMapper.findHistorialPagoByHistTratPacId(histTratPacId);
		return historialPagos;
	}

	@Override
	public void insertHistorialPago(HistorialPagos historialPagos) 
	{
		logger.debug("insertHistorialPago "+historialPagos);
		this.historialPagosMapper.insertHistorialPago(historialPagos);
	}

}
