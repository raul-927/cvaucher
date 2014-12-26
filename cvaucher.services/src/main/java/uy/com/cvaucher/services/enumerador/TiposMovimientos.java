package uy.com.cvaucher.services.enumerador;

public enum TiposMovimientos {
	DEBITO(1),CREDITO(2);
	private int tipoMovimiento;
	
	TiposMovimientos(int tipoMovimiento)
	{
		this.tipoMovimiento = tipoMovimiento;
	}
	
	public int getTipoMovimiento()
	{
		return this.tipoMovimiento;
	}
}
