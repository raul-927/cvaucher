package uy.com.cvaucher.services.enumerador;

public enum PacientesSearch {
	CI(1), NOMBRE(2),APELLIDO(3);
	private int tipo;
	
	PacientesSearch(int tipo){
		this.tipo = tipo;
	}
	
	public int getTipo(){
		
		return this.tipo;
	}

}
