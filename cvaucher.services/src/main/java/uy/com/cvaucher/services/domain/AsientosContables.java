package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AsientosContables implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 		asContId;
	private int 		asConDebeId;
	private BigDecimal 	asconDebe;
	private int 		asConHaberId;
	private BigDecimal 	asConHaber;
	private String		asConDescripcion;
	private Date 		asConFecha;
	private Date 		asConHora;
	private String 		asConUsr;
	
	public int getAsContId() {
		return asContId;
	}
	public void setAsContId(int asContId) {
		this.asContId = asContId;
	}
	public int getAsConDebeId() {
		return asConDebeId;
	}
	public void setAsConDebeId(int asConDebeId) {
		this.asConDebeId = asConDebeId;
	}
	public BigDecimal getAsconDebe() {
		return asconDebe;
	}
	public void setAsconDebe(BigDecimal asconDebe) {
		this.asconDebe = asconDebe;
	}
	public int getAsConHaberId() {
		return asConHaberId;
	}
	public void setAsConHaberId(int asConHaberId) {
		this.asConHaberId = asConHaberId;
	}
	public BigDecimal getAsConHaber() {
		return asConHaber;
	}
	public void setAsConHaber(BigDecimal asConHaber) {
		this.asConHaber = asConHaber;
	}
	public Date getAsConFecha() {
		return asConFecha;
	}
	public void setAsConFecha(Date asConFecha) {
		this.asConFecha = asConFecha;
	}
	public Date getAsConHora() {
		return asConHora;
	}
	public void setAsConHora(Date asConHora) {
		this.asConHora = asConHora;
	}
	public String getAsConUsr() {
		return asConUsr;
	}
	public void setAsConUsr(String asConUsr) {
		this.asConUsr = asConUsr;
	}
	public String getAsConDescripcion() {
		return asConDescripcion;
	}
	public void setAsConDescripcion(String asConDescripcion) {
		this.asConDescripcion = asConDescripcion;
	}
	
	
}
