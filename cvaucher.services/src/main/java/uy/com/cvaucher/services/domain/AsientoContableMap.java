package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class AsientoContableMap  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int 		asContId;
	private int			caja;
	private int 		asConNro;
	private int			asCuentaDebe;
	private long 		asCuentaDebeMonto;
	private int			asCuentaHaber;
	private long 		asCuentaHaberMonto;
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
	public int getCaja() {
		return caja;
	}
	public void setCaja(int caja) {
		this.caja = caja;
	}
	public int getAsConNro() {
		return asConNro;
	}
	public void setAsConNro(int asConNro) {
		this.asConNro = asConNro;
	}
	public int getAsCuentaDebe() {
		return asCuentaDebe;
	}
	public void setAsCuentaDebe(int asCuentaDebe) {
		this.asCuentaDebe = asCuentaDebe;
	}
	public long getAsCuentaDebeMonto() {
		return asCuentaDebeMonto;
	}
	public void setAsCuentaDebeMonto(long asCuentaDebeMonto) {
		this.asCuentaDebeMonto = asCuentaDebeMonto;
	}
	public int getAsCuentaHaber() {
		return asCuentaHaber;
	}
	public void setAsCuentaHaber(int asCuentaHaber) {
		this.asCuentaHaber = asCuentaHaber;
	}
	public long getAsCuentaHaberMonto() {
		return asCuentaHaberMonto;
	}
	public void setAsCuentaHaberMonto(long asCuentaHaberMonto) {
		this.asCuentaHaberMonto = asCuentaHaberMonto;
	}
	public String getAsCuentaTipo() {
		return asCuentaTipo;
	}
	public void setAsCuentaTipo(String asCuentaTipo) {
		this.asCuentaTipo = asCuentaTipo;
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

}
