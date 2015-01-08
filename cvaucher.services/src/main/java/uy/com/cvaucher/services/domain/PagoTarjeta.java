package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class PagoTarjeta implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int tarjId;
	private int tarjPacCedula;
	private int tarjPagoId;
	private int tarjNro;
	private String tarjVence;
	private int tarjImporte;
	
	public int getTarjId() {
		return tarjId;
	}
	public void setTarjId(int tarjId) {
		this.tarjId = tarjId;
	}
	public int getTarjPacCedula() {
		return tarjPacCedula;
	}
	public void setTarjPacCedula(int tarjPacCedula) {
		this.tarjPacCedula = tarjPacCedula;
	}
	public int getTarjPagoId() {
		return tarjPagoId;
	}
	public void setTarjPagoId(int tarjPagoId) {
		this.tarjPagoId = tarjPagoId;
	}
	public int getTarjNro() {
		return tarjNro;
	}
	public void setTarjNro(int tarjNro) {
		this.tarjNro = tarjNro;
	}
	public String getTarjVence() {
		return tarjVence;
	}
	public void setTarjVence(String tarjVence) {
		this.tarjVence = tarjVence;
	}
	public int getTarjImporte() {
		return tarjImporte;
	}
	public void setTarjImporte(int tarjImporte) {
		this.tarjImporte = tarjImporte;
	}
	

}
