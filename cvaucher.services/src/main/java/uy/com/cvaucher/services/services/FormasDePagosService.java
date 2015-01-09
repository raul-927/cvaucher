package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;












import uy.com.cvaucher.services.clases.FormasDePagosDesc;
import uy.com.cvaucher.services.clases.SearchMaxTratPacId;
import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.domain.HistorialPagos;
import uy.com.cvaucher.services.domain.MaxTratPacId;
import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;
import uy.com.cvaucher.services.mappers.FormasDePagosMapper;



import uy.com.cvaucher.services.mappers.HistorialPagosMapper;
import uy.com.cvaucher.services.mappers.PagoTarjetaMapper;
import uy.com.cvaucher.services.mappers.TratamientoPacienteMapper;
import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;
import uy.com.cvaucher.services.mappers.FormasDePagosMapper;


@Service
@Transactional
public class FormasDePagosService implements FormasDePagosInt 
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private FormasDePagosMapper formasDePagosMapper;
	
	@Autowired
	private TratamientoPacienteMapper tratamientoPacienteMapper;
	
	@Autowired
	private PagoTarjetaMapper pagoTarjetaMapper;
	
	@Autowired
	private HistorialPagosMapper historialPagosMapper;

	@Override
	public List<FormasDePagos> findAllFormasDePagos() 
	{
		// TODO Auto-generated method stub
		return this.formasDePagosMapper.findAllFormasDePagos();
	}

	@Override
	public FormasDePagos findFormasDePagosById(Integer formPagId) 
	{
		// TODO Auto-generated method stub
		return this.formasDePagosMapper.findFormasDePagosById(formPagId);
	}

	@Override
	public void insertFormasDePagos(FormasDePagos formasDePagos) 
	{
		this.formasDePagosMapper.insertFormasDePagos(formasDePagos);

	}

	@Override
	public void updateFormasDePagos(FormasDePagos formasDePagos) 
	{
		this.formasDePagosMapper.updateFormasDePagos(formasDePagos);


	}

	@Override
	public FormasDePagosDesc findFormPagoTipoByDesc(String formPagoDesc) 
	{
		return this.formasDePagosMapper.findFormPagoTipoByDesc(formPagoDesc);
	}

	@Override
	@Transactional
	public void insertTratamientoPagoTarjeta(TratamientoPaciente tratamientoPaciente, PagoTarjeta pagoTarjeta) 
	{
		this.tratamientoPacienteMapper.insertTratamientoPacienteMapper(tratamientoPaciente);
		MaxTratPacId maxTratPacId = new MaxTratPacId();
		SearchMaxTratPacId search = new SearchMaxTratPacId();
		search.setCedula(tratamientoPaciente.getPacientes().getCedula());
		search.setFecha(tratamientoPaciente.getFecha());
		search.setTratId(tratamientoPaciente.getTratamId());
		HistorialPagos historialPagos = new HistorialPagos();
		
		int maxId = this.tratamientoPacienteMapper.findMaxTratPacId(search).getMaxId();
		maxTratPacId.setMaxId(maxId);
		historialPagos.setHistTratPacId(maxTratPacId.getMaxId());
		historialPagos.setHistPagosFechaPago(tratamientoPaciente.getFecha());
		historialPagos.setHistPagosMonto(tratamientoPaciente.getCostoTratSesion());
		this.pagoTarjetaMapper.insertPagoTarjeta(pagoTarjeta);
		
		this.historialPagosMapper.insertHistorialPago(historialPagos);
		
		tratamientoPaciente.setTratPacId(maxTratPacId.getMaxId());
		tratamientoPaciente.setImportePagado(historialPagos.getHistPagosMonto());
		
		this.tratamientoPacienteMapper.updateTratamientoPacienteImporte(tratamientoPaciente);
		
		
	}

	
	

}
