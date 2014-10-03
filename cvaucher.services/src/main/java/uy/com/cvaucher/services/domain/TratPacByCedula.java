package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class TratPacByCedula implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private int 	tratPacId;
	private String 	fecha;
	private String 	tratDesc;
	private int 	costoTratamiento;
	private int 	importePagado;
	private int 	saldoPendiente;
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCostoTratamiento() {
		return costoTratamiento;
	}
	public void setCostoTratamiento(int costoTratamiento) {
		this.costoTratamiento = costoTratamiento;
	}
	public int getImportePagado() {
		return importePagado;
	}
	public void setImportePagado(int importePagado) {
		this.importePagado = importePagado;
	}
	public int getSaldoPendiente() {
		return saldoPendiente;
	}
	public void setSaldoPendiente(int saldoPendiente) {
		this.saldoPendiente = saldoPendiente;
	}
	public String getTratDesc() {
		return tratDesc;
	}
	public void setTratDesc(String tratDesc) {
		this.tratDesc = tratDesc;
	}
	
	

}
