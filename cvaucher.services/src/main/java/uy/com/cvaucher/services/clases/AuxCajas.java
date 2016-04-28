package uy.com.cvaucher.services.clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AuxCajas implements Serializable{

	private static final long serialVersionUID = 1L;
	private int cajaId;
	private String cajaEstado;
	private Date cajaFecha;
	private Date cajaHora;
	private String cajaUsr;
	private String cuentaFormPagoDesc;
	private BigDecimal monto;
	private String cuentaTipoMovimiento;
	private Date cuentaFecha;
	private Date cuentaHora;
	private String cuentaUsuario;
	
	public int getCajaId() {
		return cajaId;
	}
	public void setCajaId(int cajaId) {
		this.cajaId = cajaId;
	}
	public String getCajaEstado() {
		return cajaEstado;
	}
	public void setCajaEstado(String cajaEstado) {
		this.cajaEstado = cajaEstado;
	}
	public Date getCajaFecha() {
		return cajaFecha;
	}
	public void setCajaFecha(Date cajaFecha) {
		this.cajaFecha = cajaFecha;
	}
	public Date getCajaHora() {
		return cajaHora;
	}
	public void setCajaHora(Date cajaHora) {
		this.cajaHora = cajaHora;
	}
	public String getCajaUsr() {
		return cajaUsr;
	}
	public void setCajaUsr(String cajaUsr) {
		this.cajaUsr = cajaUsr;
	}
	public String getCuentaFormPagoDesc() {
		return cuentaFormPagoDesc;
	}
	public void setCuentaFormPagoDesc(String cuentaFormPagoDesc) {
		this.cuentaFormPagoDesc = cuentaFormPagoDesc;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		
		this.monto = monto;
	}
	public String getCuentaTipoMovimiento() {
		return cuentaTipoMovimiento;
	}
	public void setCuentaTipoMovimiento(String cuentaTipoMovimiento) {
		this.cuentaTipoMovimiento = cuentaTipoMovimiento;
	}
	public Date getCuentaFecha() {
		return cuentaFecha;
	}
	public void setCuentaFecha(Date cuentaFecha) {
		this.cuentaFecha = cuentaFecha;
	}
	public Date getCuentaHora() {
		return cuentaHora;
	}
	public void setCuentaHora(Date cuentaHora) {
		this.cuentaHora = cuentaHora;
	}
	public String getCuentaUsuario() {
		return cuentaUsuario;
	}
	public void setCuentaUsuario(String cuentaUsuario) {
		this.cuentaUsuario = cuentaUsuario;
	}
	
	
	
}
