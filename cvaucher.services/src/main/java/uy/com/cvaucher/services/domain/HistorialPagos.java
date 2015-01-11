package uy.com.cvaucher.services.domain;

import java.io.Serializable;


import org.springframework.format.annotation.DateTimeFormat;

public class HistorialPagos implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private int histPagosId;
	private int histTratPacId;
	private int	histPagosMonto;
	private String histPagosTipo;
	
	@DateTimeFormat(pattern = "YYYY-MM-dd")
	private String histPagosFechaPago;
	
	
	
	public int getHistPagosId() {
		return histPagosId;
	}
	public void setHistPagosId(int histPagosId) {
		this.histPagosId = histPagosId;
	}
	
	public int getHistTratPacId() {
		return histTratPacId;
	}
	public void setHistTratPacId(int histTratPacId) {
		this.histTratPacId = histTratPacId;
	}
	public String getHistPagosFechaPago() {
		return histPagosFechaPago;
	}
	public void setHistPagosFechaPago(String histPagosFechaPago) {
		this.histPagosFechaPago = histPagosFechaPago;
	}
	public int getHistPagosMonto() {
		return histPagosMonto;
	}
	public void setHistPagosMonto(int histPagosMonto) {
		this.histPagosMonto = histPagosMonto;
	}
	public String getHistPagosTipo() {
		return histPagosTipo;
	}
	public void setHistPagosTipo(String histPagosTipo) {
		this.histPagosTipo = histPagosTipo;
	}

}
