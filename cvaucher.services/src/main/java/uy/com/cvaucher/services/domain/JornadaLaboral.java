package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class JornadaLaboral implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int jorLabId;
	private Date jorLabHoraDesde;
	private Date jorLabHoraHasta;
	private int jorLabSemana;
	private int jorLabMes;
	
	
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
	public int getJorLabSemana() {
		return jorLabSemana;
	}
	public void setJorLabSemana(int jorLabSemana) {
		this.jorLabSemana = jorLabSemana;
	}
	public int getJorLabMes() {
		return jorLabMes;
	}
	public void setJorLabMes(int jorLabMes) {
		this.jorLabMes = jorLabMes;
	}
	
}
