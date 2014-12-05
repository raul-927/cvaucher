package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.ListaPrecios;
import uy.com.cvaucher.services.domain.ListaPreciosArray;
import uy.com.cvaucher.services.interfaces.ListaPreciosInt;
import uy.com.cvaucher.services.mappers.ListaPreciosMapper;


@Service
@Transactional
public class ListaPreciosService implements ListaPreciosInt 
{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ListaPreciosMapper listaPreciosMapper;

	@Override
	public List<ListaPrecios> findAllListaPrecios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaPrecios findListaPreciosById(Integer listPrecId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void insertListaPrecios(ListaPreciosArray listaPreciosArray) 
	{
		logger.debug("listaPreciosArray: "+listaPreciosArray);
		int size = listaPreciosArray.getListPrecTratId().size();
		System.out.println("size = "+size);
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
			System.out.println("listaPrecios.getListPrecId() = "+listaPrecios.getListPrecId());
			System.out.println("listaPrecios.getListPrecTratId() = "+listaPrecios.getListPrecTratId());
			System.out.println("listaPrecios.getListPrecMonto() = "+listaPrecios.getListPrecMonto());
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

}
