package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class FormasDePagos implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int formPagId;
	private int formPagDesc;
	
	public int getFormPagId() {
		return formPagId;
	}
	public void setFormPagId(int formPagId) {
		this.formPagId = formPagId;
	}
	public int getFormPagDesc() {
		return formPagDesc;
	}
	public void setFormPagDesc(int formPagDesc) {
		this.formPagDesc = formPagDesc;
	}
}
