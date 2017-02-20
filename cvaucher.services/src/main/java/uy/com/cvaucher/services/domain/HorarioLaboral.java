package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class HorarioLaboral implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int horLabId;
	private Date horLabHoraDesde;
	private Date horLabHoraHasta;
	private int horLabSemana;
	private int horLabMes;
	private String horLabDesc;
	
	public int getHorLabId() {
		return horLabId;
	}
	public void setHorLabId(int horLabId) {
		this.horLabId = horLabId;
	}
	public Date getHorLabHoraDesde() {
		return horLabHoraDesde;
	}
	public void setHorLabHoraDesde(Date horLabHoraDesde) {
		this.horLabHoraDesde = horLabHoraDesde;
	}
	public Date getHorLabHoraHasta() {
		return horLabHoraHasta;
	}
	public void setHorLabHoraHasta(Date horLabHoraHasta) {
		this.horLabHoraHasta = horLabHoraHasta;
	}
	public int getHorLabSemana() {
		return horLabSemana;
	}
	public void setHorLabSemana(int horLabSemana) {
		this.horLabSemana = horLabSemana;
	}
	public int getHorLabMes() {
		return horLabMes;
	}
	public void setHorLabMes(int horLabMes) {
		this.horLabMes = horLabMes;
	}
	public String getHorLabDesc() {
		return horLabDesc;
	}
	public void setHorLabDesc(String horLabDesc) {
		this.horLabDesc= horLabDesc;
	}
}
