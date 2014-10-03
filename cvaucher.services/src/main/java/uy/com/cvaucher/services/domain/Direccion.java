package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class Direccion implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 	dirId;
	private String 	tpoVivienda;
	private String 	calle;
	private int 	nroPuerta;
	private int 	nroAp;
	private String 	calle1;
	private String 	calle2;
	private Pacientes pacientes;
	
	
	
	public Direccion()
	{
		
	}
	
	public Direccion(int dirId, String tpoVivienda, String calle, int nroPuerta, int nroAp, String calle1, String calle2,Pacientes pacientes) 
	{
		this.dirId = dirId;
		this.tpoVivienda = tpoVivienda;
		this.calle = calle;
		this.nroPuerta = nroPuerta;
		this.nroAp = nroAp;
		this.calle1 = calle1;
		this.calle2 = calle2;
		this.pacientes = pacientes;
		
	}

	public int getDirId() {
		return dirId;
	}
	
	public void setDirId(int dirId) 
	{
		this.dirId = dirId;
	}
//-----------------------------------------------------------	
	public String getTpoVivienda() 
	{
		return tpoVivienda;
	}
	
	public void setTpoVivienda(String tpoVivienda) 
	{
		this.tpoVivienda = tpoVivienda;
	}
//-----------------------------------------------------------	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
//-----------------------------------------------------------	
	public int getNroPuerta() {
		return nroPuerta;
	}
	
	public void setNroPuerta(int nroPuerta) {
		this.nroPuerta = nroPuerta;
	}
//-----------------------------------------------------------	
	public int getNroAp() {
		return nroAp;
	}
	
	public void setNroAp(int nroAp) {
		this.nroAp = nroAp;
	}
//-----------------------------------------------------------	
	public String getCalle1() {
		return calle1;
	}
	
	public void setCalle1(String calle1) {
		this.calle1 = calle1;
	}
//-----------------------------------------------------------	
	public String getCalle2() {
		return calle2;
	}
	
	public void setCalle2(String calle2) {
		this.calle2 = calle2;
	}
//-----------------------------------------------------------
	public Pacientes getPacientes() {
		return pacientes;
	}

	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}
	
	

}
