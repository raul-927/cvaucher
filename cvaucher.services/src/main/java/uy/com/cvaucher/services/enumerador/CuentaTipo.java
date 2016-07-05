package uy.com.cvaucher.services.enumerador;

public enum CuentaTipo{
	VENTA(1), IMPOSTIVO(2), TRATAMIENTO(3);
	private int codigo;
	
	CuentaTipo(int codigo){
		this.codigo = codigo;
	}
	public int getCodigo(){
		return this.codigo;
	}
}
