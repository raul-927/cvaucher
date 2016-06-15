package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class AsientoContableArray implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int 					asContId ;
	
	private int 					asConNro;
	private ArrayList<Caja>			caja				=   new ArrayList<Caja>();
	private ArrayList<Cuentas>		asCuentaDebe		=	new ArrayList<Cuentas>();
	private ArrayList<BigDecimal>	asCuentaDebeMonto 	= 	new ArrayList<BigDecimal>();
	private ArrayList<Cuentas>		asCuentaHaber 		= 	new ArrayList<Cuentas>();
	private ArrayList<BigDecimal> 	asCuentaHaberMonto 	= 	new ArrayList<BigDecimal>();
	private ArrayList<String> 		asConDescripcion 	= 	new ArrayList<String>();
	private String 					asConFecha ;
	private String 					asConHora;
	private String 					asConUsr;
	
	public int getAsContId() {
		return asContId;
	}
	public void setAsContId(int asContId) {
		this.asContId = asContId;
	}
	public int getAsConNro() {
		return asConNro;
	}
	public void setAsConNro(int asConNro) {
		this.asConNro = asConNro;
	}
	public ArrayList<Cuentas> getAsCuentaDebe() {
		return asCuentaDebe;
	}
	public void setAsCuentaDebe(ArrayList<Cuentas> asCuentaDebe) {
		this.asCuentaDebe = asCuentaDebe;
	}
	public ArrayList<BigDecimal> getAsCuentaDebeMonto() {
		return asCuentaDebeMonto;
	}
	public void setAsCuentaDebeMonto(ArrayList<BigDecimal> asCuentaDebeMonto) {
		this.asCuentaDebeMonto = asCuentaDebeMonto;
	}
	public ArrayList<Cuentas> getAsCuentaHaber() {
		return asCuentaHaber;
	}
	public void setAsCuentaHaber(ArrayList<Cuentas> asCuentaHaber) {
		this.asCuentaHaber = asCuentaHaber;
	}
	public ArrayList<BigDecimal> getAsCuentaHaberMonto() {
		return asCuentaHaberMonto;
	}
	public void setAsCuentaHaberMonto(ArrayList<BigDecimal> asCuentaHaberMonto) {
		this.asCuentaHaberMonto = asCuentaHaberMonto;
	}
	public ArrayList<String> getAsConDescripcion() {
		return asConDescripcion;
	}
	public void setAsConDescripcion(ArrayList<String> asConDescripcion) {
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
	public ArrayList<Caja> getCaja() {
		return caja;
	}
	public void setCaja(ArrayList<Caja> caja) {
		this.caja = caja;
	}

}
