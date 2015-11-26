package uy.com.cvaucher.services.enumerador;

public enum TiposFormasDePagos 
{
	EF(1,"Efectivo"),
	TC(2,"Targeta de Credito"),
	TD(3,"Targeta de Debito"), 
	DP(4,"Deposito Cuenta Bancaria"), 
	CE(5,"Credito Efectivo");
	
	private final int tipoFormaPago;
	private final String descFormaPago;
	
	
	TiposFormasDePagos(int tipoFormaPago, String descFormaPago)
	{
		this.tipoFormaPago = tipoFormaPago;
		this.descFormaPago = descFormaPago;
	}
	
	public int getTipoFormaPago()
	{
		return this.tipoFormaPago;
	}
	public String getDecFormaPago(){
		return this.descFormaPago;
	}
}
