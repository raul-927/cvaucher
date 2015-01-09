package uy.com.cvaucher.services.clases;

import java.io.Serializable;

public class SearchMaxTratPacId implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fecha;
	private int cedula;
	private int tratId;
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getTratId() {
		return tratId;
	}
	public void setTratId(int tratId) {
		this.tratId = tratId;
	}

}
