package uy.com.cvaucher.services.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import uy.com.cvaucher.services.annotations.Dni;

public class ValidoDni implements ConstraintValidator<Dni, String> {

	@Override
	public void initialize(Dni constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		
	
		return false;
	}

}
