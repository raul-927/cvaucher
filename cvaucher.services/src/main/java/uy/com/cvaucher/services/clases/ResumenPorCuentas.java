package uy.com.cvaucher.services.clases;

import java.io.Serializable;

public class ResumenPorCuentas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cuenta;
	private double total;
	private String tipo;
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
