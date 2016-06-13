package uy.com.cvaucher.services.enumerador;

public enum TipoImpuesto {
	ECONOMICO(1),
	PERSONAS(2);
	
	private int tipoImpuesto;
	
	TipoImpuesto(int tipoImpuesto){
		this.tipoImpuesto = tipoImpuesto;
	}
	
	public int getTipoImpuesto(){
		return this.tipoImpuesto;
	}

}
