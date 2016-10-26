package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class Calendario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String reserva;

	public String getReserva() {
		return reserva;
	}

	public void setReserva(String reserva) {
		this.reserva = reserva;
	}
}
