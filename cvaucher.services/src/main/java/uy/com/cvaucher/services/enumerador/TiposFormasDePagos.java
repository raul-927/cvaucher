package uy.com.cvaucher.services.enumerador;

public enum TiposFormasDePagos 
{
	EF(1),TC(2),TD(3), DP(4), CE(5);
	private int tipoFormaPago;
	
	TiposFormasDePagos(int tipoFormaPago)
	{
		this.tipoFormaPago = tipoFormaPago;
	}
	
	public int getTipoFormaPago()
	{
		return this.tipoFormaPago;
	}
}
