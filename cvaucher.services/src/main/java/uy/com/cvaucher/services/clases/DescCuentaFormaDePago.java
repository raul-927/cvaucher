package uy.com.cvaucher.services.clases;

import java.io.Serializable;

public class DescCuentaFormaDePago implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cuentaDesc;

	public String getCuentaDesc() {
		return cuentaDesc;
	}

	public void setCuentaDesc(String cuentaDesc) {
		this.cuentaDesc = cuentaDesc;
	}

}
