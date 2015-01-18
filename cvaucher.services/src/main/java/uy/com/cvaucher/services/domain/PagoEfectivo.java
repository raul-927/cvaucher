package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class PagoEfectivo implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int efId;
	private int pagoEfId;
	private long pagoEfCedula;
	private int pagoEfImporte;
	private String pagoEfDesc;
	
	public int getPagoEfId() {
		return pagoEfId;
	}
	public void setPagoEfId(int pagoEfId) {
		this.pagoEfId = pagoEfId;
	}
	public long getPagoEfCedula() {
		return pagoEfCedula;
	}
	public void setPagoEfCedula(long pagoEfCedula) {
		this.pagoEfCedula = pagoEfCedula;
	}
	public int getPagoEfImporte() {
		return pagoEfImporte;
	}
	public void setPagoEfImporte(int pagoEfImporte) {
		this.pagoEfImporte = pagoEfImporte;
	}
	public String getPagoEfDesc() {
		return pagoEfDesc;
	}
	public void setPagoEfDesc(String pagoEfDesc) {
		this.pagoEfDesc = pagoEfDesc;
	}
	public int getEfId() {
		return efId;
	}
	public void setEfId(int efId) {
		this.efId = efId;
	}
	
}
