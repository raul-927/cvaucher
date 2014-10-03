package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class SesionRealizada implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 		sesRealizadaId;
	private Sesiones 	sesiones;
	private int 		sesCantidad;
	private Date 		sesFechaRalizada;
	
	
	public int getSesRealizadaId() {
		return sesRealizadaId;
	}
	public void setSesRealizadaId(int sesRealizadaId) {
		this.sesRealizadaId = sesRealizadaId;
	}
	public Sesiones getSesiones() {
		return sesiones;
	}
	public void setSesiones(Sesiones sesiones) {
		this.sesiones = sesiones;
	}
	public int getSesCantidad() {
		return sesCantidad;
	}
	public void setSesCantidad(int sesCantidad) {
		this.sesCantidad = sesCantidad;
	}
	public Date getSesFechaRalizada() {
		return sesFechaRalizada;
	}
	public void setSesFechaRalizada(Date sesFechaRalizada) {
		this.sesFechaRalizada = sesFechaRalizada;
	}
	
	
	
	

}
