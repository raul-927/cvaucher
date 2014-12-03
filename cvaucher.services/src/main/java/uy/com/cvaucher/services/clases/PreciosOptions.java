package uy.com.cvaucher.services.clases;

import java.io.Serializable;

public class PreciosOptions implements Serializable
{

	private static final long serialVersionUID = 1L;
	private int opcion;

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
}
