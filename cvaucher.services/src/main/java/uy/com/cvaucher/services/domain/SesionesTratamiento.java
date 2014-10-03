package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class SesionesTratamiento extends Tratamiento implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int 		sesId;
	private Pacientes 	pacientes;
	private int 		sesCant;
	private int 		sesRealizada;
	private int 		sesImporte;
	private int 		sesPago;
	private int 		sesSaldo;
	
	public int getSesId() {
		return sesId;
	}
	public void setSesId(int sesId) {
		this.sesId = sesId;
	}
	public Pacientes getPacientes() {
		return pacientes;
	}
	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}
	public int getSesCant() {
		return sesCant;
	}
	public void setSesCant(int sesCant) {
		this.sesCant = sesCant;
	}
	public int getSesRealizada() {
		return sesRealizada;
	}
	public void setSesRealizada(int sesRealizada) {
		this.sesRealizada = sesRealizada;
	}
	public int getSesImporte() {
		return sesImporte;
	}
	public void setSesImporte(int sesImporte) {
		this.sesImporte = sesImporte;
	}
	public int getSesPago() {
		return sesPago;
	}
	public void setSesPago(int sesPago) {
		this.sesPago = sesPago;
	}
	public int getSesSaldo() {
		return sesSaldo;
	}
	public void setSesSaldo(int sesSaldo) {
		this.sesSaldo = sesSaldo;
	}

}
