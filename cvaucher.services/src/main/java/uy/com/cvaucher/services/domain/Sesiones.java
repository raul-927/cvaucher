package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class Sesiones implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int 				sesId;
	private TratamientoPaciente	tratPaciente;
	private int					sesCantidad;
	private int					sesRealizadas;
	private int					sesPendientes;
	private Date				sesFechaReserva;
	private String				sesEstadoRealizada;
	private String				sesEstadoVigencia;
	private int 				sesEstadoPago;
	private Date 				sesFechaPago;
	
	
	public int getSesId() {
		return sesId;
	}
	public void setSesId(int sesId) {
		this.sesId = sesId;
	}
	
	public String getSesEstadoRealizada() {
		return sesEstadoRealizada;
	}
	public void setSesEstadoRealizada(String sesEstadoRealizada) {
		this.sesEstadoRealizada = sesEstadoRealizada;
	}
	public String getSesEstadoVigencia() {
		return sesEstadoVigencia;
	}
	public void setSesEstadoVigencia(String sesEstadoVigencia) {
		this.sesEstadoVigencia = sesEstadoVigencia;
	}
	public Date getSesFechaReserva() {
		return sesFechaReserva;
	}
	public void setSesFechaReserva(Date sesFechaReserva) {
		this.sesFechaReserva = sesFechaReserva;
	}
	public int getSesEstadoPago() {
		return sesEstadoPago;
	}
	public void setSesEstadoPago(int sesEstadoPago) {
		this.sesEstadoPago = sesEstadoPago;
	}
	public Date getSesFechaPago() {
		return sesFechaPago;
	}
	public void setSesFechaPago(Date sesFechaPago) {
		this.sesFechaPago = sesFechaPago;
	}
	public TratamientoPaciente getTratPaciente() {
		return tratPaciente;
	}
	public void setTratPaciente(TratamientoPaciente tratPaciente) {
		this.tratPaciente = tratPaciente;
	}
	public int getSesCantidad() {
		return sesCantidad;
	}
	public void setSesCantidad(int sesCantidad) {
		this.sesCantidad = sesCantidad;
	}
	public int getSesRealizadas() {
		return sesRealizadas;
	}
	public void setSesRealizadas(int sesRealizadas) {
		this.sesRealizadas = sesRealizadas;
	}
	public int getSesPendientes() {
		return sesPendientes;
	}
	public void setSesPendientes(int sesPendientes) {
		this.sesPendientes = sesPendientes;
	}
	
	

	

}
