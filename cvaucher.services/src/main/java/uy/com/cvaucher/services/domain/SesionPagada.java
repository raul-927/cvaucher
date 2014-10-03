package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class SesionPagada implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 		sesPagoId;
	private int 		sesMontoPago;
	private Date 		sesFecha;
	private Sesiones	sesiones;

	
	public int getSesPagoId() {
		return sesPagoId;
	}
	public void setSesPagoId(int sesPagoId) {
		this.sesPagoId = sesPagoId;
	}
	
	public int getSesMontoPago() {
		return sesMontoPago;
	}
	public void setSesMontoPago(int sesMontoPago) {
		this.sesMontoPago = sesMontoPago;
	}
	public Date getSesFecha() {
		return sesFecha;
	}
	public void setSesFecha(Date sesFecha) {
		this.sesFecha = sesFecha;
	}
	public Sesiones getSesiones() {
		return sesiones;
	}
	public void setSesiones(Sesiones sesiones) {
		this.sesiones = sesiones;
	}
	
	
	
}
