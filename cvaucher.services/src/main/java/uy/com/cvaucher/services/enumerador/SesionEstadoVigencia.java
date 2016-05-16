package uy.com.cvaucher.services.enumerador;

public enum SesionEstadoVigencia {
	VIGENTE(1,"Vigente"),
	VENCIDA(2,"Vencida"),
	UTILIZADA(3,"Utilizada");
	private int opcion;
	private String descripcion;
	
	SesionEstadoVigencia(int opcion,String descripcion){
		this.opcion = opcion;
		this.descripcion = descripcion;
	}
	
	public int getOpcion(){
		return this.opcion;
	}
	public String getDescripcion(){
		return this.descripcion;
	}

}
