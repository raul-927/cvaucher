package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AsientoContable implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 		asContId;
	private Caja		caja;
	private int 		asConNro;
	private Cuentas		asCuentaDebe;
	private BigDecimal 	asCuentaDebeMonto;
	private Cuentas		asCuentaHaber;
	private BigDecimal 	asCuentaHaberMonto;
	private String		asCuentaTipo;
	private String		asConDescripcion;
	private String 		asConFecha;
	private String 		asConHora;
	private String 		asConUsr;
	
	public int getAsContId() {
		return asContId;
	}
	public void setAsContId(int asContId) {
		this.asContId = asContId;
	}
	
	public Caja getCaja() {
		return caja;
	}
	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	public Cuentas getAsCuentaDebe() {
		return asCuentaDebe;
	}
	public void setAsCuentaDebe(Cuentas asCuentaDebe) {
		this.asCuentaDebe = asCuentaDebe;
	}
	public BigDecimal getAsCuentaDebeMonto() {
		return asCuentaDebeMonto;
	}
	public void setAsCuentaDebeMonto(BigDecimal asCuentaDebeMonto) {
		this.asCuentaDebeMonto = asCuentaDebeMonto;
	}
	public Cuentas getAsCuentaHaber() {
		return asCuentaHaber;
	}
	public void setAsCuentaHaber(Cuentas asCuentaHaber) {
		this.asCuentaHaber = asCuentaHaber;
	}
	public BigDecimal getAsCuentaHaberMonto() {
		return asCuentaHaberMonto;
	}
	public void setAsCuentaHaberMonto(BigDecimal asCuentaHaberMonto) {
		this.asCuentaHaberMonto = asCuentaHaberMonto;
	}
	public String getAsConDescripcion() {
		return asConDescripcion;
	}
	public void setAsConDescripcion(String asConDescripcion) {
		this.asConDescripcion = asConDescripcion;
	}
	public String getAsConFecha() {
		return asConFecha;
	}
	public void setAsConFecha(String asConFecha) {
		this.asConFecha = asConFecha;
	}
	public String getAsConHora() {
		return asConHora;
	}
	public void setAsConHora(String asConHora) {
		this.asConHora = asConHora;
	}
	public String getAsConUsr() {
		return asConUsr;
	}
	public void setAsConUsr(String asConUsr) {
		this.asConUsr = asConUsr;
	}
	public int getAsConNro() {
		return asConNro;
	}
	public void setAsConNro(int asConNro) {
		this.asConNro = asConNro;
	}
	public String getAsCuentaTipo() {
		return asCuentaTipo;
	}
	public void setAsCuentaTipo(String asCuentaTipo) {
		this.asCuentaTipo = asCuentaTipo;
	}
	
	
}
