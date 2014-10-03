package uy.com.cvaucher.services.enumerador;

public enum TipoVivienda
{
	CASA(1), APARTAMENTO(2);
	private int tpo;
	
	TipoVivienda(int tpo)
	{
		this.tpo = tpo;
	}
	
	public int getTipoCasa()
	{
		return this.tpo;
	}

}
