package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class TratByList implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String descripcion;
	private int sesiones;
	private int monto;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getSesiones() {
		return sesiones;
	}
	public void setSesiones(int sesiones) {
		this.sesiones = sesiones;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
