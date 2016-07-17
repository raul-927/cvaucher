package uy.com.cvaucher.services.enumerador;

public enum TipoCuenta {
	INGRESO(1, "Ingreso Ganancias"),
	VENTA(2,"Ventas"),
	GASTOS(3, "Gastos Perdidas"),
	DEUDAS(4, "Deudas Prestamos"),
	PATRIMONIO(5,"Patrimonio"),
	EGRESO(6,"Egreso");
	
	private int tipo;
	private String descripcion;
	
	TipoCuenta(int tipo, String descripcion){
		this.tipo = tipo;
		this.descripcion = descripcion;
	}
	
	public int getTipo(){
		return this.tipo;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
}
