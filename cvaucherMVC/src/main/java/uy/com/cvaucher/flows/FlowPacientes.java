package uy.com.cvaucher.flows;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import uy.com.cvaucher.services.domain.Agenda;
import uy.com.cvaucher.services.domain.Direccion;
import uy.com.cvaucher.services.domain.HistoriaClinica;
import uy.com.cvaucher.services.domain.Pacientes;

@Component
public class FlowPacientes implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pacientes 		pacientes;
	private Direccion direccion;
	private Agenda	agenda;
	private HistoriaClinica	historiaClinica;
	
	public Pacientes getPacientes() {
		return pacientes;
	}
	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}
	
	public Direccion getDireccion() {
		return  direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion.setPacientes(this.pacientes);
		this.direccion =  direccion;
		
	}
	
	public Agenda getAgenda() {
		return agenda;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda =  agenda;
	}
	
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	
	public void addPacientes(Pacientes pacientes)
	{
		this.pacientes = pacientes;
		this.direccion.setPacientes(this.pacientes);
		this.agenda.setPacientes(this.pacientes);
	
	}
	
	

}
