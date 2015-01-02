package uy.com.cvaucher.services.clases;

import java.io.Serializable;

public class FormPagosOptions implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String formaDePago;

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

}
