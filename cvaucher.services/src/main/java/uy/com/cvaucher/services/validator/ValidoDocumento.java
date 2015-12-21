package uy.com.cvaucher.services.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import uy.com.cvaucher.services.annotations.Documento;

public class ValidoDocumento implements ConstraintValidator<Documento, String> {
	
	@Override
	public void initialize(Documento constraintAnnotation){
		
		
	}
	
	@Override
	public boolean isValid(String valor, ConstraintValidatorContext context){
		boolean control = false;
		
		String tipoDoc = valor.substring(0,3);
		String documento = valor.substring(3);
		
		System.out.println("tipoDoc ==>> "+tipoDoc);
		System.out.println("documento ==>> "+documento);
		if(tipoDoc.equals("DNI")){
			System.out.println("Tipo de documento: "+tipoDoc+", Documento: "+documento);
		}else if(tipoDoc.equals("CED")){
			System.out.println("Tipo de documento: "+tipoDoc+", Documento: "+documento);
		}else if(tipoDoc.equals("CEE")){
			System.out.println("Tipo de documento: "+tipoDoc+", Documento: "+documento);
		}else if(tipoDoc.equals("PAS")){
			System.out.println("Tipo de documento: "+tipoDoc+", Documento: "+documento);
		}
		
		return control;
	}
}
