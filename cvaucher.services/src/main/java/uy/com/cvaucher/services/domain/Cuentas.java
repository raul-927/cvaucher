package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class Cuentas  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cuentaId;
	private String cuentaFormPagoDesc;
	private int cuentaMonto;
	private String cuentaTipoMovimiento;
	private String cuentaFecha;
	
	public int getCuentaId() {
		return cuentaId;
	}
	public void setCuentaId(int cuentaId) {
		this.cuentaId = cuentaId;
	}
	public String getCuentaFormPagoDesc() {
		return cuentaFormPagoDesc;
	}
	public void setCuentaFormPagoDesc(String cuentaFormPagoDesc) {
		this.cuentaFormPagoDesc = cuentaFormPagoDesc;
	}
	public int getCuentaMonto() {
		return cuentaMonto;
	}
	public void setCuentaMonto(int cuentaMonto) {
		this.cuentaMonto = cuentaMonto;
	}
	public String getCuentaTipoMovimiento() {
		return cuentaTipoMovimiento;
	}
	public void setCuentaTipoMovimiento(String cuentaTipoMovimiento) {
		this.cuentaTipoMovimiento = cuentaTipoMovimiento;
	}
	public String getCuentaFecha() {
		return cuentaFecha;
	}
	public void setCuentaFecha(String cuentaFecha) {
		this.cuentaFecha = cuentaFecha;
	}
}
