package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.interfaces.FormasDePagosInt;
import uy.com.cvaucher.services.mappers.FormasDePagosMapper;


@Service
@Transactional
public class FormasDePagoService implements FormasDePagosInt 
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private FormasDePagosMapper formasDePagosMapper;
	

	@Override
	public List<FormasDePagos> findAllFormasDePagos() 
	{
		// TODO Auto-generated method stub
		return this.findAllFormasDePagos();
	}

	@Override
	public FormasDePagos findFormasDePagosById(Integer formPagId) 
	{
		// TODO Auto-generated method stub
		return this.findFormasDePagosById(formPagId);
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

}
