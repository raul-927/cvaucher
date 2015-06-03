package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPreciosArray implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int 			   listPrecId ;
	private ArrayList<Integer> listPrecTratId = new ArrayList<Integer>();
	private ArrayList<Integer> listPrecMonto  = new ArrayList<Integer>();
	private ArrayList<String>  listPrecDesc   = new ArrayList<String>();
	
	
	public int getListPrecId() {   
		return listPrecId;
	}
	public void setListPrecId(int listPrecId) {
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
	public ArrayList<String> getListPrecDesc() {
		return listPrecDesc;
	}
	public void setListPrecDesc(ArrayList<String> listPrecDesc) {
		this.listPrecDesc = listPrecDesc;
	}

}


