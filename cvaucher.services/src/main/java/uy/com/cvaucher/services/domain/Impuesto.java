package uy.com.cvaucher.services.domain;

import java.io.Serializable;
import java.math.BigDecimal;
public class Impuesto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int impuestoId;
	private String impuestoDesc;
	private String impuestoDescAbrv;
	private BigDecimal impuestoValor;
	private String impuestoTipo;
	private Cuentas impuestoCuenta;
	
	public int getImpuestoId() {
		return impuestoId;
	}
	public void setImpuestoId(int impuestoId) {
		this.impuestoId = impuestoId;
	}
	public String getImpuestoDesc() {
		return impuestoDesc;
	}
	public void setImpuestoDesc(String impuestoDesc) {
		this.impuestoDesc = impuestoDesc;
	}
	public String getImpuestoDescAbrv() {
		return impuestoDescAbrv;
	}
	public void setImpuestoDescAbrv(String impuestoDescAbrv) {
		this.impuestoDescAbrv = impuestoDescAbrv;
	}
	public BigDecimal getImpuestoValor() {
		return impuestoValor;
	}
	public void setImpuestoValor(BigDecimal impuestoValor) {
		this.impuestoValor = impuestoValor;
	}
	public String getImpuestoTipo() {
		return impuestoTipo;
	}
	public void setImpuestoTipo(String impuestoTipo) {
		this.impuestoTipo = impuestoTipo;
	}
	public Cuentas getImpuestoCuenta() {
		return impuestoCuenta;
	}
	public void setImpuestoCuenta(Cuentas impuestoCuenta) {
		this.impuestoCuenta = impuestoCuenta;
	}

}
