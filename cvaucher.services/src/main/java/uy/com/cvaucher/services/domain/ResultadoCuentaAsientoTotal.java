package uy.com.cvaucher.services.domain;

import java.math.BigDecimal;
import java.io.Serializable;

public class ResultadoCuentaAsientoTotal implements Serializable {

	private static final long serialVersionUID = 1L;
	private String descCuenta;
	private BigDecimal total;
	
	public String getDescCuenta() {
		return descCuenta;
	}
	public void setDescCuenta(String descCuenta) {
		this.descCuenta = descCuenta;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
}
