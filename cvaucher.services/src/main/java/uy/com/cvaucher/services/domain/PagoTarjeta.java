package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class PagoTarjeta implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int tarjId;
	private int tarjetaCajaId;
	private int asientoNro;
	private int tarjPacCedula;
	private int tarjPagoId;
	private long tarjNro;
	private String tarjDesc;
	private String tarjVence;
	private int tarjImporte;
	private String tarjCuenta;
	private int cantCuotas;
	private String tarjPagoUsuario;
	
	public int getTarjId() {
		return tarjId;
	}
	public void setTarjId(int tarjId) {
		this.tarjId = tarjId;
	}
	public int getTarjPacCedula() {
		return tarjPacCedula;
	}
	public void setTarjPacCedula(int tarjPacCedula) {
		this.tarjPacCedula = tarjPacCedula;
	}
	public int getTarjPagoId() {
		return tarjPagoId;
	}
	public void setTarjPagoId(int tarjPagoId) {
		this.tarjPagoId = tarjPagoId;
	}
	public long getTarjNro() {
		return tarjNro;
	}
	public void setTarjNro(long tarjNro) {
		this.tarjNro = tarjNro;
	}
	public String getTarjVence() {
		return tarjVence;
	}
	public void setTarjVence(String tarjVence) {
		this.tarjVence = tarjVence;
	}
	public int getTarjImporte() {
		return tarjImporte;
	}
	public void setTarjImporte(int tarjImporte) {
		this.tarjImporte = tarjImporte;
	}
	public int getCantCuotas() {
		return cantCuotas;
	}
	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}
	public String getTarjDesc() {
		return tarjDesc;
	}
	public void setTarjDesc(String tarjDesc) {
		this.tarjDesc = tarjDesc;
	}
	public int getTarjetaCajaId() {
		return tarjetaCajaId;
	}
	public void setTarjetaCajaId(int tarjetaCajaId) {
		this.tarjetaCajaId = tarjetaCajaId;
	}
	public String getTarjPagoUsuario() {
		return tarjPagoUsuario;
	}
	public void setTarjPagoUsuario(String tarjPagoUsuario) {
		this.tarjPagoUsuario = tarjPagoUsuario;
	}
	public String getTarjCuenta() {
		return tarjCuenta;
	}
	public void setTarjCuenta(String tarjCuenta) {
		this.tarjCuenta = tarjCuenta;
	}
	public int getAsientoNro() {
		return asientoNro;
	}
	public void setAsientoNro(int asientoNro) {
		this.asientoNro = asientoNro;
	}
	

}
