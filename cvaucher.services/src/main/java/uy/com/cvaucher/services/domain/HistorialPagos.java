package uy.com.cvaucher.services.domain;

import java.util.Date;

public class HistorialPagos 
{
	private int histPagosId;
	private int histTratPacId;
	private Date histPagosFechaPago;
	private int	histPagosMonto;
	
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
	public Date getHistPagosFechaPago() {
		return histPagosFechaPago;
	}
	public void setHistPagosFechaPago(Date histPagosFechaPago) {
		this.histPagosFechaPago = histPagosFechaPago;
	}
	public int getHistPagosMonto() {
		return histPagosMonto;
	}
	public void setHistPagosMonto(int histPagosMonto) {
		this.histPagosMonto = histPagosMonto;
	}

}
