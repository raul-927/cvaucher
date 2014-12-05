package uy.com.cvaucher.services.domain;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

public class AuxPrecios implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int auxPrecId;
	private ListaPrecios listaPrecios;
	
	@DateTimeFormat(pattern = "YYYY-MM-dd")
	private String auxPrecFechIni;
	
	@DateTimeFormat(pattern = "YYYY-MM-dd")
	private String auxPrecFechFin;
	
	private String auxPrecDescripcion;

	public String getAuxPrecDescripcion() {
		return auxPrecDescripcion;
	}

	public void setAuxPrecDescripcion(String auxPrecDescripcion) {
		this.auxPrecDescripcion = auxPrecDescripcion;
	}

	public int getAuxPrecId() {
		return auxPrecId;
	}

	public void setAuxPrecId(int auxPrecId) {
		this.auxPrecId = auxPrecId;
	}

	public ListaPrecios getListaPrecios() {
		return listaPrecios;
	}

	public void setListaPrecios(ListaPrecios listaPrecios) {
		this.listaPrecios = listaPrecios;
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

}
