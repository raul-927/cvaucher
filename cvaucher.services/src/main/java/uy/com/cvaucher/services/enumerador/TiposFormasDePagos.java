package uy.com.cvaucher.services.enumerador;

public enum TiposFormasDePagos 
{
	EF(1),TARJETA(2),DEPOSITO_BANCARIO(3);
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
