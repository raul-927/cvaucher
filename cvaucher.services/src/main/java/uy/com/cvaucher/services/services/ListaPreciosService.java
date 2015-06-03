package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import uy.com.cvaucher.services.domain.AuxPrecios;
import uy.com.cvaucher.services.domain.ListPrecTratDesc;
import uy.com.cvaucher.services.domain.ListaPrecios;
import uy.com.cvaucher.services.domain.ListaPreciosArray;
import uy.com.cvaucher.services.domain.MaxIdListaPrecios;
import uy.com.cvaucher.services.interfaces.ListaPreciosInt;
import uy.com.cvaucher.services.mappers.AuxPreciosMapper;
import uy.com.cvaucher.services.mappers.ListaPreciosMapper;


@Service
@Transactional
public class ListaPreciosService implements ListaPreciosInt 
{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ListaPreciosMapper listaPreciosMapper;
	
	@Autowired
	private AuxPreciosMapper auxPreciosMapper;

	@Override
	public List<ListaPrecios> findAllListaPrecios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	
	public List<ListaPrecios> findListaPreciosById(Integer listPrecId) {
		
		return this.listaPreciosMapper.findListaPreciosById(listPrecId);
	}

	@Override
	@Transactional
	
	public void insertListaPrecios(ListaPreciosArray listaPreciosArray) 
	{
		logger.debug("insertListaPrecios: "+listaPreciosArray);
		int size = listaPreciosArray.getListPrecTratId().size();
		
		ListaPrecios listaPrecios = new ListaPrecios();
		int i = 0;
		while( i < size)
		{
			int listPrecId = listaPreciosArray.getListPrecId();
			int listPrecTratId = listaPreciosArray.getListPrecTratId().get(i);
			int listPrecMonto = listaPreciosArray.getListPrecMonto().get(i);
			listaPrecios.setListPrecId(listPrecId);
			listaPrecios.setListPrecTratId(listPrecTratId);
			listaPrecios.setListPrecMonto(listPrecMonto);
			this.listaPreciosMapper.insertListaPrecios(listaPrecios);
			i++;
		}
	}

	@Override
	public void updateListaPrecios(ListaPrecios listaPrecios) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteListaPrecios(Integer listPrecId) {
		// TODO Auto-generated method stub

	}

	@Override
	public MaxIdListaPrecios findMaxIdListaPrecios() 
	{
		MaxIdListaPrecios maxIdListaPrecios = new MaxIdListaPrecios();
		int max = 0;
		if(this.listaPreciosMapper.findMaxIdListaPrecios()!= null)
		{
			max = this.listaPreciosMapper.findMaxIdListaPrecios().getMaxIdListPrecios();
		}
		 
		max++;
		maxIdListaPrecios.setMaxIdListPrecios(max);
		
		return maxIdListaPrecios;
	}

	@Override
	public void insertAuxPrecios(AuxPrecios auxPrecios) 
	{
		this.auxPreciosMapper.insertAuxPrecios(auxPrecios);
		
	}

	@Override
	public ListaPrecios findActualListaPrecios() 
	{
		
		return this.listaPreciosMapper.findActualListaPrecios();
	}

	@Override
	public List<ListPrecTratDesc> findListaPreciosTratDescById(int listPrecId) {
		
		return this.listaPreciosMapper.findListaPreciosTratDescById(listPrecId);
	}

}
