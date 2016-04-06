package uy.com.cvaucher.services.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import uy.com.cvaucher.services.annotations.Documento;
import uy.com.cvaucher.services.domain.Pacientes2;

public class ValidoDocumento implements ConstraintValidator<Documento, Pacientes2> {
	
	@Override
	public void initialize(Documento constraintAnnotation){
		
		
	}
	
	@Override
	public boolean isValid(Pacientes2 valor, ConstraintValidatorContext context){
		boolean control = false;
		
		String tipoDoc = valor.getTipoDocPaciente();
		String documento = valor.getDocumento();
		
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
