package uy.com.cvaucher.services.enumerador;

public enum CuentaTipo{
	VENTA("VENTA",1), 
	IMPOSTIVO("IMPOSTIVO",2), 
	TRATAMIENTO("TRATAMIENTO",3),
	RETIRO("RETIRO",4),
	GASTOS("GASTOS",5);
	private String descripcion;
	private int codigo;
	
	CuentaTipo(String descripcion, int codigo){
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getCodigo(){
		return this.codigo;
	}
}
