package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class Cuentas  implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private int 			cuentaId;
	private GrupoCuentas	grupoCuentas;
	private String 			cuentaDesc;
	private String			cuentaTipo;
	private String 			cuentaFecha;
	private String 			cuentaHora;
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
	public String getCuentaFecha() {
		return cuentaFecha;
	}
	public void setCuentaFecha(String cuentaFecha) {
		this.cuentaFecha = cuentaFecha;
	}
	public String getCuentaHora() {
		return cuentaHora;
	}
	public void setCuentaHora(String cuentaHora) {
		this.cuentaHora = cuentaHora;
	}
	public String getCuentaUsuario() {
		return cuentaUsuario;
	}
	public void setCuentaUsuario(String cuentaUsuario) {
		this.cuentaUsuario = cuentaUsuario;
	}
	public GrupoCuentas getGrupoCuentas() {
		return grupoCuentas;
	}
	public void setGrupoCuentas(GrupoCuentas grupoCuentas) {
		this.grupoCuentas = grupoCuentas;
	}
	public String getCuentaTipo() {
		return cuentaTipo;
	}
	public void setCuentaTipo(String cuentaTipo) {
		this.cuentaTipo = cuentaTipo;
	}
}
