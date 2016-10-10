package uy.com.cvaucher.services.enumerador;

public enum Meses {
	ENERO		(1,"Enero"),
	FEBRERO		(2,"Febrero"),
	MARZO		(3,"Marzo"),
	ABRIL		(4,"Abril"),
	MAYO		(5,"Mayo"),
	JUNIO		(6,"Junio"),
	JULIO		(7,"Julio"),
	AGOSTO		(8,"Agosto"),
	SETIEMBRE	(9,"Setiembre"),
	OCTUBRE		(10,"Octubre"),
	NOVIEMBRE	(11,"Noviembre"),
	DICIEMBRE	(12,"Diciembre");
	
	private int 	nroMes;
	private String 	nombreMes;
	
	Meses(int nroMes,String nombreMes){
		this.nroMes = nroMes;
		this.nombreMes = nombreMes;
	}
	
	public int getNroMes(){
		return this.nroMes;
	}
	
	public String getombreMes(){
		return this.nombreMes;
	}
}
