package uy.com.cvaucher.services.validator;

import javax.validation.ConstraintValidator;


import javax.validation.ConstraintValidatorContext;

import uy.com.cvaucher.services.annotations.Numero;

public class ValidoNumero implements ConstraintValidator<Numero, Integer>
{

	@Override
	public void initialize(Numero constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) 
	{
		
		return false;
	}

}
