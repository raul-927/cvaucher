package uy.com.cvaucher.services.enumerador;

public enum ListaPreciosOptions {
	NUEVA_LISTA_PRECIOS(1), 
	COPIAR_Y_MODIFICAR_LISTA_PRECIOS(2),
	INSERTAR_TRATAMIENTO_EN_LISTA_ACTUAL(3);
	private int opcion;
	
	ListaPreciosOptions(int opcion)
	{
		this.opcion = opcion;
	}
	
	public int getOpcion(){
		return this.opcion;
	}
}
