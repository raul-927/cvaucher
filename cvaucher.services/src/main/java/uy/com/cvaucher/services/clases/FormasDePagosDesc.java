package uy.com.cvaucher.services.clases;

import java.io.Serializable;

import uy.com.cvaucher.services.domain.Cuentas;

public class FormasDePagosDesc implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private String formasDePagoDesc;
	private String formasDePagoTipo;
	private Cuentas formasDePagoCuenta;
	
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

	public Cuentas getFormasDePagoCuenta() {
		return formasDePagoCuenta;
	}

	public void setFormasDePagoCuenta(Cuentas formasDePagoCuenta) {
		this.formasDePagoCuenta = formasDePagoCuenta;
	}

}
