package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class ArqueoCaja implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String 	fecha;
	private String 	usuario;
	private ArrayList<String> concepto = new ArrayList<String>();
	private ArrayList<Integer> monto = new ArrayList<Integer>();
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public ArrayList<String> getConcepto() {
		return concepto;
	}
	public void setConcepto(ArrayList<String> concepto) {
		this.concepto = concepto;
	}
	public ArrayList<Integer> getMonto() {
		return monto;
	}
	public void setMonto(ArrayList<Integer> monto) {
		this.monto = monto;
	}

}
