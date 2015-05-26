package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class ListaPrecios implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int listPrecId;
	private int listPrecTratId;
	private int	listPrecMonto;
	
	public int getListPrecId() {
		return listPrecId;
	}
	public void setListPrecId(int listPrecId) {
		this.listPrecId = listPrecId;
	}
	public int getListPrecTratId() {
		return listPrecTratId;
	}
	public void setListPrecTratId(int listPrecTratId) {
		this.listPrecTratId = listPrecTratId;
	}
	public int getListPrecMonto() {
		return listPrecMonto;
	}
	public void setListPrecMonto(int listPrecMonto) {
		this.listPrecMonto = listPrecMonto;
	}
	
	
}


