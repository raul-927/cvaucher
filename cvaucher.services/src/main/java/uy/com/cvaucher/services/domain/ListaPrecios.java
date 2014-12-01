package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class ListaPrecios implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int listPrecId;
	private Tratamiento tratamiento;
	private int	listPrecMonto;
	private int listPrecDescripcion;
	
	public int getListPrecId() {
		return listPrecId;
	}
	public void setListPrecId(int listPrecId) {
		this.listPrecId = listPrecId;
	}
	public Tratamiento getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}
	public int getListPrecMonto() {
		return listPrecMonto;
	}
	public void setListPrecMonto(int listPrecMonto) {
		this.listPrecMonto = listPrecMonto;
	}
	public int getListPrecDescripcion() {
		return listPrecDescripcion;
	}
	public void setListPrecDescripcion(int listPrecDescripcion) {
		this.listPrecDescripcion = listPrecDescripcion;
	}

}
