package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class SeguimientoPacientes implements Serializable
{
	/**
	 * 
	 */
	private static final long	serialVersionUID = 1L;
	private int				segPacId;
	private int				tratPacId;
	private String 			fechControl;

	private int				brazoI;
	private int				brazoD;
	private int				muzloI;
	private int				muzloD;
	private int				abdomen;
	private int				cintura;
	private int				cadera;
	private int				peso;
	private double			imc;
	private String 			observaciones;
	
	public int getSegPacId() {
		return segPacId;
	}
	public void setSegPacId(int segPacId) {
		this.segPacId = segPacId;
	}
	public int getTratPacId() {
		return tratPacId;
	}
	public void setTratPacId(int tratPacId) {
		this.tratPacId = tratPacId;
	}
	public String getFechControl() {
		return fechControl;
	}
	public void setFechControl(String fechControl) {
		this.fechControl = fechControl;
	}
	public int getBrazoI() {
		return brazoI;
	}
	public void setBrazoI(int brazoI) {
		this.brazoI = brazoI;
	}
	public int getBrazoD() {
		return brazoD;
	}
	public void setBrazoD(int brazoD) {
		this.brazoD = brazoD;
	}
	public int getMuzloI() {
		return muzloI;
	}
	public void setMuzloI(int muzloI) {
		this.muzloI = muzloI;
	}
	public int getMuzloD() {
		return muzloD;
	}
	public void setMuzloD(int muzloD) {
		this.muzloD = muzloD;
	}
	public int getAbdomen() {
		return abdomen;
	}
	public void setAbdomen(int abdomen) {
		this.abdomen = abdomen;
	}
	public int getCintura() {
		return cintura;
	}
	public void setCintura(int cintura) {
		this.cintura = cintura;
	}
	public int getCadera() {
		return cadera;
	}
	public void setCadera(int cadera) {
		this.cadera = cadera;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
