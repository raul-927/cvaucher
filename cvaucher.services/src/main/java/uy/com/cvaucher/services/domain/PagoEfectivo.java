package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class PagoEfectivo implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int efId;
	private int pagoEfCajaId;
	private int asientoNro;
	private int pagoEfId;
	private long pagoEfCedula;
	private int pagoEfImporte;
	private String pagoEfCuenta;
	private String pagoEfDesc;
	private String pagoEfUsuario;
	
	
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
	public int getPagoEfCajaId() {
		return pagoEfCajaId;
	}
	public void setPagoEfCajaId(int pagoEfCajaId) {
		this.pagoEfCajaId = pagoEfCajaId;
	}
	public String getPagoEfUsuario() {
		return pagoEfUsuario;
	}
	public void setPagoEfUsuario(String pagEfUsuario) {
		this.pagoEfUsuario = pagEfUsuario;
	}
	public String getPagoEfCuenta() {
		return pagoEfCuenta;
	}
	public void setPagoEfCuenta(String pagoEfCuenta) {
		this.pagoEfCuenta = pagoEfCuenta;
	}
	public int getAsientoNro() {
		return asientoNro;
	}
	public void setAsientoNro(int asientoNro) {
		this.asientoNro = asientoNro;
	}
	
}
