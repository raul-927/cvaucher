package uy.com.cvaucher.services.enumerador;

public enum TipoDocumento {
	DNI(1),
	CED(2),
	CEE(3),
	PAS(4);
	
	private int idTipoDoc;
	
	TipoDocumento(int idTipoDoc){
		this.idTipoDoc = idTipoDoc;
	}
	
	public int getIdTipoDoc(){
		return this.idTipoDoc;
	}

}
