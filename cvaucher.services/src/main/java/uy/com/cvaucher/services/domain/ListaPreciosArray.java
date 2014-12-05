package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPreciosArray implements Serializable
{
	private static final long serialVersionUID = 1L;

	private ArrayList<Integer> listPrecId = new ArrayList() ;
	private ArrayList<Integer> listPrecTratId = new ArrayList();
	private ArrayList<Integer>	listPrecMonto = new ArrayList();
	
	
	public ArrayList<Integer> getListPrecId() {   
		return listPrecId;
	}
	public void setListPrecId(ArrayList<Integer> listPrecId) {
		this.listPrecId = listPrecId;
	}
	public ArrayList<Integer> getListPrecTratId() {
		return listPrecTratId;
	}
	public void setListPrecTratId(ArrayList<Integer> listPrecTratId) {
		this.listPrecTratId = listPrecTratId;
	}
	public ArrayList<Integer> getListPrecMonto() {
		return listPrecMonto;
	}
	public void setListPrecMonto(ArrayList<Integer> listPrecMonto) {
		this.listPrecMonto = listPrecMonto;
	}

}


