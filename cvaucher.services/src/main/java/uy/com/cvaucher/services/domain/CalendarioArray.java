package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class CalendarioArray implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idCalendarioArray;
	private ArrayList<Date> fecha = new ArrayList<Date>();
	private ArrayList<Date> hora = new ArrayList<Date>();
	private ArrayList<Tratamiento> tratamiento = new ArrayList<Tratamiento>();
	private ArrayList<String> estadoReserva = new ArrayList<String>();
	
	public int getIdCalendarioArray() {
		return idCalendarioArray;
	}
	public void setIdCalendarioArray(int idCalendarioArray) {
		this.idCalendarioArray = idCalendarioArray;
	}
	public ArrayList<Date> getFecha() {
		return fecha;
	}
	public void setFecha(ArrayList<Date> fecha) {
		this.fecha = fecha;
	}
	public ArrayList<Date> getHora() {
		return hora;
	}
	public void setHora(ArrayList<Date> hora) {
		this.hora = hora;
	}
	public ArrayList<Tratamiento> getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(ArrayList<Tratamiento> tratamiento) {
		this.tratamiento = tratamiento;
	}
	public ArrayList<String> getEstadoReserva() {
		return estadoReserva;
	}
	public void setEstadoReserva(ArrayList<String> estadoReserva) {
		this.estadoReserva = estadoReserva;
	}
	
	

}
