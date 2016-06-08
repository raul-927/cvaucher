package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class Tratamiento implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 				tratId;
	private TipoTratamiento 	tipoTratamiento;
	private String 				tratDescripcion;
	private int					tratCantSesiones;
	private Impuesto			impuesto;
	
	public int getTratId() {
		return tratId;
	}
	public void setTratId(int tratId) {
		this.tratId = tratId;
	}
	public TipoTratamiento getTipoTratamiento() {
		return tipoTratamiento;
	}
	public void setTipoTratamiento(TipoTratamiento tipoTratamiento) {
		this.tipoTratamiento = tipoTratamiento;
	}
	public String getTratDescripcion() {
		return tratDescripcion;
	}
	public void setTratDescripcion(String tratDescripcion) {
		this.tratDescripcion = tratDescripcion;
	}
	public int getTratCantSesiones() {
		return tratCantSesiones;
	}
	public void setTratCantSesiones(int tratCantSesiones) {
		this.tratCantSesiones = tratCantSesiones;
	}
	public Impuesto getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(Impuesto impuesto) {
		this.impuesto = impuesto;
	}
	
}
