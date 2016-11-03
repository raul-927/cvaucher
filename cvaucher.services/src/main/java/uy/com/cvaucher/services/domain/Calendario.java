package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class Calendario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int 		idCalendario;
	private Date 		fecha;
	private Date 		hora;
	private Tratamiento tratamiento;
	private String 		estadoReserva;
	
	public int getIdCalendario() {
		return idCalendario;
	}
	public void setIdCalendario(int idCalendario) {
		this.idCalendario = idCalendario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Tratamiento getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}
	public String getEstadoReserva() {
		return estadoReserva;
	}
	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}
	
}
