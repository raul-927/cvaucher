package uy.com.cvaucher.services.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

//import uy.com.cvaucher.services.jni.CvaucherJni;

@Aspect
public class EfectivoAspect {

	@Pointcut(
			"execution(* uy.com.cvaucher.services.interfaces.FormasDePagosInt.insertTratamientoPagoEfectivo(..))")
	public void ejecutarEfectivo(){
		
	}
	@Before("ejecutarEfectivo()")
	public void ejecutoEfectivo(){
		System.out.println("Inicio de CvaucherJni en EfectivoAspect");
		/*
		CvaucherJni cvaucher = new CvaucherJni();
		int a = 48;
		int b = 62;
		int c = cvaucher.holaMundo(a, b);
		System.out.println("Desde Aspect Java, La suma de "+a+" +" +b+" = "+c);
		*/
	}
	
	@After("ejecutarEfectivo()")
	public void despuesEjecutarEfectivo(){
		System.out.println("Despues de FormasDePagosInt.insertTratamientoPagoEfectivo()");
	}
	
	
}
