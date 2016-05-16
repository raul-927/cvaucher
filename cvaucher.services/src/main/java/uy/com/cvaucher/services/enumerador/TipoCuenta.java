package uy.com.cvaucher.services.enumerador;

public enum TipoCuenta {
	INGRESO(1, "Ingreso Ganancias"),
	GASTOS(2, "Gastos Perdidas"),
	DEUDAS(3, "Deudas Prestamos"),
	PATRIMONIO(4,"Patrimonio");
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
