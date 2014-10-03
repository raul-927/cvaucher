package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class SeguimientoPacientes implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pacientes 		pacientes;
	private Date 			fechComTrat;
	private int 			frecuencia;
	private String 			observaciones;
	private String			brazoI;
	private String			brazoD;
	private String			muzloI;
	private String			muzloD;
	private String			abdomen;
	private String			cintura;
	private String			cadera;
	private int				peso;
	private float			imc;
	
	
	public Pacientes getPacientes() 
	{
		return pacientes;
	}
	public void setPacientes(Pacientes pacientes) 
	{
		this.pacientes = pacientes;
	}
	
	public Date getFechComTrat() 
	{
		return fechComTrat;
	}
	public void setFechComTrat(Date fechComTrat) 
	{
		this.fechComTrat = fechComTrat;
	}
	
	public int getFrecuencia() 
	{
		return frecuencia;
	}
	public void setFrecuencia(int frecuencia) 
	{
		this.frecuencia = frecuencia;
	}
	public String getObservaciones() 
	{
		return observaciones;
	}
	public void setObservaciones(String observaciones) 
	{
		this.observaciones = observaciones;
	}
	public String getBrazoI() 
	{
		return brazoI;
	}
	public void setBrazoI(String brazoI) 
	{
		this.brazoI = brazoI;
	}
	public String getBrazoD() 
	{
		return brazoD;
	}
	public void setBrazoD(String brazoD) 
	{
		this.brazoD = brazoD;
	}
	public String getMuzloI() 
	{
		return muzloI;
	}
	public void setMuzloI(String muzloI) 
	{
		this.muzloI = muzloI;
	}
	public String getMuzloD() 
	{
		return muzloD;
	}
	public void setMuzloD(String muzloD) 
	{
		this.muzloD = muzloD;
	}
	public String getAbdomen() 
	{
		return abdomen;
	}
	public void setAbdomen(String abdomen)
	{
		this.abdomen = abdomen;
	}
	public String getCintura() 
	{
		return cintura;
	}
	public void setCintura(String cintura) 
	{
		this.cintura = cintura;
	}
	public String getCadera() 
	{
		return cadera;
	}
	public void setCadera(String cadera)
	{
		this.cadera = cadera;
	}
	public int getPeso() 
	{
		return peso;
	}
	public void setPeso(int peso)
	{
		this.peso = peso;
	}
	public float getImc() 
	{
		return imc;
	}
	public void setImc(float imc)
	{
		this.imc = imc;
	}
	
	
	

}
