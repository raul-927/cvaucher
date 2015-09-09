package uy.com.cvaucher.services.enumerador;

public enum PruebaEnumerator {
	VALOR_1("Esto es lo que vale el valor 1", 500, 450,"Texto 1"), 
	VALOR_2("Esto es lo que vale el valor 2", 200, 600,"Texto 2"),
	VALOR_3("Esto es lo que vale el valor 3", 842, 468,"Texto 3");
	
	
	private final String texto1;
	private final int valor1;
	private final int valor2;
	private final String texto2;
	
	PruebaEnumerator(String texto1, int valor1, int valor2, String texto2){
		this.texto1 = texto1;
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.texto2 = texto2;
		
	}
	
	public String getTexto1(){
		
		return this.texto1;
	}
	
	public int getValor1(){
		return this.valor1;
	}
	
	public int getValor2(){
		return this.valor2;
	}
	
	public String getTexto2(){
		
		return this.texto2;
	}
	

}
