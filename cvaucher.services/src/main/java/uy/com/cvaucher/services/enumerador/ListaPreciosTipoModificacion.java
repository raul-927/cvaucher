package uy.com.cvaucher.services.enumerador;

public enum ListaPreciosTipoModificacion {
	
	MANUAL(1), PORCENTAJE(2);
	private int tipoModificacion;
	
	
	ListaPreciosTipoModificacion(int tipoModificacion)
	{
		this.tipoModificacion = tipoModificacion;
	}
	
	public int getTipoModificacion()
	{
		return this.tipoModificacion;
	}

}
