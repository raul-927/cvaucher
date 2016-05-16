package uy.com.cvaucher.services.enumerador;

public enum TiposMovimientos {
	DEBE(1),HABER(2);
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
