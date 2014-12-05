package uy.com.cvaucher.services.services;

import java.util.ArrayList;
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
	public void insertListaPrecios(ListaPreciosArray listaPreciosArray) 
	{
		
		this.listaPreciosMapper.insertListaPrecios(listaPreciosArray);
		System.out.println("Esto es una prueba");
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
