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
		
		String tipoDoc = valor.substring(1,3);
		String documento = valor.substring(4);
		
		if(tipoDoc.equals("")){
			
		}
		
		return control;
	}
}
