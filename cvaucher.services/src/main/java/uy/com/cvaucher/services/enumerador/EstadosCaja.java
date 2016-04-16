package uy.com.cvaucher.services.enumerador;

public enum EstadosCaja {
	
	OPEN(1,"Abierta"),
	CLOSED(2,"Cerrada");
	
	private int codEstado;
	private String descEstado;
	
	EstadosCaja(int codEstado, String descEstado){
		this.codEstado = codEstado;
		this.descEstado = descEstado;
	}
	
	public int getCodEstado(){
		return this.codEstado;
	}
	public String getDescEstado(){
		return this.descEstado;
	}
	
}
