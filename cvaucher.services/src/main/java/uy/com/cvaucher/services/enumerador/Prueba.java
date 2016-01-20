package uy.com.cvaucher.services.enumerador;

public class Prueba {

	public static void main(String[] args){
		for(PruebaEnumerator p: PruebaEnumerator.values()){
			System.out.println("Para el "+ p);
			System.out.println("Texto 1 de " +p.toString()+" es: "+p.getTexto1());
			System.out.println("Numero 1 de "+p.toString()+" es: "+p.getValor1());
			System.out.println("Numero 2 de "+p.toString()+" es: "+p.getValor2());
			System.out.println("Texto 2 de  "+p.toString()+" es: "+p.getTexto2());
		}
		
		/*System.out.println("El "+enumerator.toString() + " tiene el texto 1: "+enumerator.getTexto1());
		System.out.println("El "+enumerator.toString() + " tiene el numero 1: "+enumerator.getValor1());
		System.out.println("El "+enumerator.toString() + " tiene el numero 2: "+enumerator.getValor2());
		System.out.println("El "+enumerator.toString() + " tiene el texto 2: "+enumerator.getTexto2());*/
		

	}

}
