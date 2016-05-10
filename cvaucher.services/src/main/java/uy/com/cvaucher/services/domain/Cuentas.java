package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.util.Date;

public class Cuentas  implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private int 			cuentaId;
	private String 			cuentaDesc;
	private Date 			cuentaFecha;
	private Date 			cuentaHora;
	private String			cuentaUsuario;
	
	public int getCuentaId() {
		return cuentaId;
	}
	public void setCuentaId(int cuentaId) {
		this.cuentaId = cuentaId;
	}
	public String getCuentaDesc() {
		return cuentaDesc;
	}
	public void setCuentaDesc(String cuentaDesc) {
		this.cuentaDesc = cuentaDesc;
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
