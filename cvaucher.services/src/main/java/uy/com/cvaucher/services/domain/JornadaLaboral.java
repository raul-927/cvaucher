package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class JornadaLaboral implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 	jorLabId;
	private Date 	jorLabHoraDesde;
	private Date 	jorLabHoraHasta;
	private int		jorLabCantHoras;
	private Date	jorLabHoraDescDesde;
	private Date	jorLabHoraDescHasta;
	private String  jorLabDesc;
	
	public int getJorLabId() {
		return jorLabId;
	}
	public void setJorLabId(int jorLabId) {
		this.jorLabId = jorLabId;
	}
	public Date getJorLabHoraDesde() {
		return jorLabHoraDesde;
	}
	public void setJorLabHoraDesde(Date jorLabHoraDesde) {
		this.jorLabHoraDesde = jorLabHoraDesde;
	}
	public Date getJorLabHoraHasta() {
		return jorLabHoraHasta;
	}
	public void setJorLabHoraHasta(Date jorLabHoraHasta) {
		this.jorLabHoraHasta = jorLabHoraHasta;
	}
	public String getJorLabDesc() {
		return jorLabDesc;
	}
	public void setJorLabDesc(String jorLabDesc) {
		this.jorLabDesc = jorLabDesc;
	}
	public int getJorLabCantHoras() {
		return jorLabCantHoras;
	}
	public void setJorLabCantHoras(int jorLabCantHoras) {
		this.jorLabCantHoras = jorLabCantHoras;
	}
	public Date getJorLabHoraDescDesde() {
		return jorLabHoraDescDesde;
	}
	public void setJorLabHoraDescDesde(Date jorLabHoraDescDesde) {
		this.jorLabHoraDescDesde = jorLabHoraDescDesde;
	}
	public Date getJorLabHoraDescHasta() {
		return jorLabHoraDescHasta;
	}
	public void setJorLabHoraDescHasta(Date jorLabHoraDescHasta) {
		this.jorLabHoraDescHasta = jorLabHoraDescHasta;
	}
	
}
