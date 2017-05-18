package uy.com.cvaucher.services.enumerador;

public enum DiasSemana {

	DOMINGO	 (1,"Domingo"),
	LUNES	 (2,"Lunes"),
	MARTES	 (3,"Martes"),
	MIERCOLES(4,"Miercoles"),
	JUEVES	 (5,"Jueves"),
	VIERNES	 (6,"Viernes"),
	SABADO	 (7,"Sabado");
	
	private int 	nroDia;
	private String 	dia;
	
	DiasSemana(int nroDia, String dia){
		this.nroDia = nroDia;
		this.dia 	= dia;
	}

	public int getNroDia() {
		return nroDia;
	}

	public void setNroDia(int nroDia) {
		this.nroDia = nroDia;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
}
