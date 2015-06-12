package uy.com.cvaucher.services.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Agenda implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int			agPacId;
	
	@NotNull(message ="ERROR; Debe ingresar un Tipo de Agenda")
	@Size(min = 3, max = 50, message = "ERROR; Debe ingresar un tipo deAgenda entre 3 y 50 caracteres")
	private String 		tipoAgenda;
	
	@NotNull(message ="ERROR; Debe ingresar un dato")
	@Size(min = 3, max = 50, message = "ERROR; Debe ingresar un nombre entre 3 y 50 caracteres")
	private String 		dato;

	@NotNull(message ="ERROR; Debe ingresar un paciente")
	private Pacientes 	pacientes;
	
	
	public int getAgPacId() 
	{
		return agPacId;
	}
	public void setAgPacId(int agPacId)
	{
		this.agPacId = agPacId;
	}
	
	public String getTipoAgenda() 
	{
		return tipoAgenda;
	}
	public void setTipoAgenda(String tipoAgenda)
	{
		this.tipoAgenda = tipoAgenda;
	}
	
	public String getDato() 
	{
		return this.dato;
	}
	public void setDato(String dato) 
	{
		this.dato = dato;
		
	}
	
	public Pacientes getPacientes() {
		return pacientes;
	}
	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}
	
	
	
	
	

}
