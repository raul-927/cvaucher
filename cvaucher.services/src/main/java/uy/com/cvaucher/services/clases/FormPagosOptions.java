package uy.com.cvaucher.services.clases;

import java.io.Serializable;

public class FormPagosOptions implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String formaDePagoDesc;
	private String formaDePagoTipo;
	
	
	public String getFormaDePagoDesc() {
		return formaDePagoDesc;
	}
	public void setFormaDePagoDesc(String formaDePagoDesc) {
		this.formaDePagoDesc = formaDePagoDesc;
	}
	public String getFormaDePagoTipo() {
		return formaDePagoTipo;
	}
	public void setFormaDePagoTipo(String formaDePagoTipo) {
		this.formaDePagoTipo = formaDePagoTipo;
	}

	

}
