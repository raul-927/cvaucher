package uy.com.cvaucher.services.domain;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

public class AuxPrecios implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int auxPrecId;
	private int auxListaPreciosId;
	
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private String auxPrecFechIni;
	
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private String auxPrecFechFin;
	
	private String auxPrecDescripcion;

	public int getAuxPrecId() {
		return auxPrecId;
	}

	public void setAuxPrecId(int auxPrecId) {
		this.auxPrecId = auxPrecId;
	}

	public int getAuxListaPreciosId() {
		return auxListaPreciosId;
	}

	public void setAuxListaPreciosId(int auxListaPreciosId) {
		this.auxListaPreciosId = auxListaPreciosId;
	}

	public String getAuxPrecFechIni() {
		return auxPrecFechIni;
	}

	public void setAuxPrecFechIni(String auxPrecFechIni) {
		this.auxPrecFechIni = auxPrecFechIni;
	}

	public String getAuxPrecFechFin() {
		return auxPrecFechFin;
	}

	public void setAuxPrecFechFin(String auxPrecFechFin) {
		this.auxPrecFechFin = auxPrecFechFin;
	}

	public String getAuxPrecDescripcion() {
		return auxPrecDescripcion;
	}

	public void setAuxPrecDescripcion(String auxPrecDescripcion) {
		this.auxPrecDescripcion = auxPrecDescripcion;
	}


}
