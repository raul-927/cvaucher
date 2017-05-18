package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class Calendario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int calId;
	private Date calFecha;
	private Date calHora;
	private Tratamiento calTratamiento;
	private String estadoReserva;
	public int getCalId() {
		return calId;
	}
	public void setCalId(int calId) {
		this.calId = calId;
	}
	public Date getCalFecha() {
		return calFecha;
	}
	public void setCalFecha(Date calFecha) {
		this.calFecha = calFecha;
	}
	public Date getCalHora() {
		return calHora;
	}
	public void setCalHora(Date calHora) {
		this.calHora = calHora;
	}
	public Tratamiento getCalTratamiento() {
		return calTratamiento;
	}
	public void setCalTratamiento(Tratamiento calTratamiento) {
		this.calTratamiento = calTratamiento;
	}
	public String getEstado() {
		return estadoReserva;
	}
	public void setEstado(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}
	
}
