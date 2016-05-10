package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AsientoContable implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 		asContId;
	private int 		asCuentaDebeId;
	private BigDecimal 	asCuentaDebe;
	private int 		asCuentaHaberId;
	private BigDecimal 	asCuentaHaber;
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
	public int getAsCuentaDebeId() {
		return asCuentaDebeId;
	}
	public void setAsCuentaDebeId(int asCuentaDebeId) {
		this.asCuentaDebeId = asCuentaDebeId;
	}
	public BigDecimal getAsCuentaDebe() {
		return asCuentaDebe;
	}
	public void setAsCuentaDebe(BigDecimal asCuentaDebe) {
		this.asCuentaDebe = asCuentaDebe;
	}
	public int getAsCuentaHaberId() {
		return asCuentaHaberId;
	}
	public void setAsCuentaHaberId(int asCuentaHaberId) {
		this.asCuentaHaberId = asCuentaHaberId;
	}
	public BigDecimal getAsCuentaHaber() {
		return asCuentaHaber;
	}
	public void setAsCuentaHaber(BigDecimal asCuentaHaber) {
		this.asCuentaHaber = asCuentaHaber;
	}
	public String getAsConDescripcion() {
		return asConDescripcion;
	}
	public void setAsConDescripcion(String asConDescripcion) {
		this.asConDescripcion = asConDescripcion;
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
	
	
}
