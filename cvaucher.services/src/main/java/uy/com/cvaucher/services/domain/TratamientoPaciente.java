package uy.com.cvaucher.services.domain;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;


public class TratamientoPaciente implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 		tratPacId;
	
	@DateTimeFormat(pattern = "YYYY-MM-dd")
	private String 		fecha ;
	private Pacientes 	pacientes;
	private int			tratamiento;
	private int 		costoTratSesion;
	private int 		importePagado;
	private int 		saldoPendiente;

	
	public String getFecha() {
		return this.fecha;
	}
	public void setFecha(String fecha) 
	{

		this.fecha = fecha;
	}
	
	public Pacientes getPacientes() {
		return pacientes;
	}
	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}
	
	public int getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(int tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	public int getImportePagado() {
		return importePagado;
	}
	public void setImportePagado(int importePagado) {
		this.importePagado = importePagado;
	}
	
	public int getSaldoPendiente() {
		return saldoPendiente;
	}
	public void setSaldoPendiente(int saldoPendiente) {
		this.saldoPendiente = saldoPendiente;
	}
	public int getTratPacId() {
		return tratPacId;
	}
	public void setTratPacId(int tratPacId) {
		this.tratPacId = tratPacId;
	}
	
	public int getCostoTratSesion() {
		return costoTratSesion;
	}
	public void setCostoTratSesion(int costoTratSesion) {
		this.costoTratSesion = costoTratSesion;
	}
	

}
