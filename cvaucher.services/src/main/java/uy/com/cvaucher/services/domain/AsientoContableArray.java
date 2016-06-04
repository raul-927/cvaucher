package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class AsientoContableArray implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int 					asContId ;
	private int 					asConNro;
	private ArrayList<Cuentas>		asCuentaDebe		=	new ArrayList<Cuentas>();
	private ArrayList<BigDecimal>	asCuentaDebeMonto 	= 	new ArrayList<BigDecimal>();
	private ArrayList<Cuentas>		asCuentaHaber 		= 	new ArrayList<Cuentas>();
	private ArrayList<BigDecimal> 	asCuentaHaberMonto 	= 	new ArrayList<BigDecimal>();
	private ArrayList<String> 		asConDescripcion 	= 	new ArrayList<String>();
	private ArrayList<String> 		asConFecha 			= 	new ArrayList<String>();
	private ArrayList<String> 		asConHora 			= 	new ArrayList<String>();
	private ArrayList<String> 		asConUsr 			= 	new ArrayList<String>();
	
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
	public ArrayList<String> getAsConFecha() {
		return asConFecha;
	}
	public void setAsConFecha(ArrayList<String> asConFecha) {
		this.asConFecha = asConFecha;
	}
	public ArrayList<String> getAsConHora() {
		return asConHora;
	}
	public void setAsConHora(ArrayList<String> asConHora) {
		this.asConHora = asConHora;
	}
	public ArrayList<String> getAsConUsr() {
		return asConUsr;
	}
	public void setAsConUsr(ArrayList<String> asConUsr) {
		this.asConUsr = asConUsr;
	}

}
