package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class PagoCredito extends PagoEfectivo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nroNotaCredito;
	public int getNroNotaCredito() {
		return nroNotaCredito;
	}
	public void setNroNotaCredito(int nroNotaCredito) {
		this.nroNotaCredito = nroNotaCredito;
	}

}
