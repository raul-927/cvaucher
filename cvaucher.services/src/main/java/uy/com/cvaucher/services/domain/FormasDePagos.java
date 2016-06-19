package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class FormasDePagos implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int formPagId;
	private String formPagAbreviacion;
	private Cuentas formPagCuenta;
	private String formPagDesc;
	private String formPagTipo;
	
	public int getFormPagId() {
		return formPagId;
	}
	public void setFormPagId(int formPagId) {
		this.formPagId = formPagId;
	}
	public String getFormPagDesc() {
		return formPagDesc;
	}
	public void setFormPagDesc(String formPagDesc) {
		this.formPagDesc = formPagDesc;
	}
	public String getFormPagAbreviacion() {
		return formPagAbreviacion;
	}
	public void setFormPagAbreviacion(String formPagAbreviacion) {
		this.formPagAbreviacion = formPagAbreviacion;
	}
	public String getFormPagTipo() {
		return formPagTipo;
	}
	public void setFormPagTipo(String formPagTipo) {
		this.formPagTipo = formPagTipo;
	}
	public Cuentas getFormPagCuenta() {
		return formPagCuenta;
	}
	public void setFormPagCuenta(Cuentas formPagCuenta) {
		this.formPagCuenta = formPagCuenta;
	}
	
}
