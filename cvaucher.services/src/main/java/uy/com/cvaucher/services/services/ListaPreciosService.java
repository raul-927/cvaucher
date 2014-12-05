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
	public void insertListaPrecios(ListaPreciosArray listaPreciosArray) 
	{
		logger.debug("listaPreciosArray: "+listaPreciosArray);
		
		for(int i = 0; i > 20; i++)
		{
			System.out.println(i);
		}
		
		int size = listaPreciosArray.getListPrecTratId().size();
		System.out.println("size = "+size);
		size = size-1;
		System.out.println("size = "+size);
		ListaPrecios listaPrecios = new ListaPrecios();
		
		for(int i=0; i>size; i++)
		{
			System.out.println("Id Lista dentro del for = "+listaPreciosArray.getListPrecId());
			System.out.println("Tratamiento dentro del for = "+listaPreciosArray.getListPrecTratId().get(i));
			System.out.println("Monto dentro del for = "+listaPreciosArray.getListPrecMonto().get(i));
			int listPrecId = listaPreciosArray.getListPrecId();
			int listPrecTratId = listaPreciosArray.getListPrecTratId().get(i);
			int listPrecMonto = listaPreciosArray.getListPrecMonto().get(i);
			listaPrecios.setListPrecId(listPrecId);
			listaPrecios.setListPrecTratId(listPrecTratId);
			listaPrecios.setListPrecMonto(listPrecMonto);
			this.listaPreciosMapper.insertListaPrecios(listaPrecios);
			
		}
		int listPrecId = listaPreciosArray.getListPrecId();
		int listPrecTratId = listaPreciosArray.getListPrecTratId().get(1);
		int listPrecMonto = listaPreciosArray.getListPrecMonto().get(1);
		listaPrecios.setListPrecId(listPrecId);
		listaPrecios.setListPrecTratId(listPrecTratId);
		listaPrecios.setListPrecMonto(listPrecMonto);
		//this.listaPreciosMapper.insertListaPrecios(listaPrecios);
		System.out.println("Id Lista fuera del for = "+listaPrecios.getListPrecId());
		System.out.println("Tratamiento fuera del for = "+listaPrecios.getListPrecTratId());
		System.out.println("Monto fuera del for = "+listaPrecios.getListPrecMonto());
		
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
