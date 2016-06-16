package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class GrupoCuentas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int grupoCuentaId;
	private	String tipoCuenta;
	private String grupoCuentaDesc;
	
	public int getGrupoCuentaId() {
		return grupoCuentaId;
	}
	public void setGrupoCuentaId(int grupoCuentaId) {
		this.grupoCuentaId = grupoCuentaId;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public String getGrupoCuentaDesc() {
		return grupoCuentaDesc;
	}
	public void setGrupoCuentaDesc(String grupoCuentaDesc) {
		this.grupoCuentaDesc = grupoCuentaDesc;
	}
	
}
