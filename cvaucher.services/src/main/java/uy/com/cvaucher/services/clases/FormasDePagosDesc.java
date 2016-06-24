package uy.com.cvaucher.services.clases;

import java.io.Serializable;

import uy.com.cvaucher.services.domain.Cuentas;

public class FormasDePagosDesc implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private String formasDePagoDesc;
	private String formasDePagoTipo;
	private int formasDePagoCuenta;
	
	public String getFormasDePagoDesc() 
	{
		return formasDePagoDesc;
	}
	
	public void setFormasDePagoDesc(String formasDePagoDesc) 
	{
		this.formasDePagoDesc = formasDePagoDesc;
	}

	public String getFormasDePagoTipo() {
		return formasDePagoTipo;
	}

	public void setFormasDePagoTipo(String formasDePagoTipo) {
		this.formasDePagoTipo = formasDePagoTipo;
	}

	public int getFormasDePagoCuenta() {
		return formasDePagoCuenta;
	}

	public void setFormasDePagoCuenta(int formasDePagoCuenta) {
		this.formasDePagoCuenta = formasDePagoCuenta;
	}

}
