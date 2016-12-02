package uy.com.cvaucher.services.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import uy.com.cvaucher.services.annotations.Cedula;
import uy.com.cvaucher.services.clases.NroVerifCedula;


public class ValidoCedula extends NroVerifCedula implements ConstraintValidator<Cedula, Integer>
{
	
	@Override
	public void initialize(Cedula constraintAnnotation) {
		
	
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		
		return this.nroCedula(value);
	}
	
	
}
