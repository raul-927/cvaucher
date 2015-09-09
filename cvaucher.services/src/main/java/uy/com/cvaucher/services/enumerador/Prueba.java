package uy.com.cvaucher.services.enumerador;

public class Prueba {

	public static void main(String[] args){
		PruebaEnumerator enumerator = PruebaEnumerator.VALOR_3;
		
		for(PruebaEnumerator p: PruebaEnumerator.values()){
			System.out.println("Los valores son: "+ p);
			System.out.println("Los Textos 1 son: "+p.getTexto1());
			System.out.println("Los Numeros 1 son: "+p.getValor1());
			System.out.println("Los Numeros 2 son: "+p.getValor2());
			System.out.println("Los Textos 2 son: "+p.getTexto2());
		}
		
		System.out.println("El "+enumerator.toString() + " tiene el texto 1: "+enumerator.getTexto1());
		System.out.println("El "+enumerator.toString() + " tiene el numero 1: "+enumerator.getValor1());
		System.out.println("El "+enumerator.toString() + " tiene el numero 2: "+enumerator.getValor2());
		System.out.println("El "+enumerator.toString() + " tiene el texto 2: "+enumerator.getTexto2());
		

	}

}
