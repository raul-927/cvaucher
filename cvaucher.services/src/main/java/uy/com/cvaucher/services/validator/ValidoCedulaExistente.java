package uy.com.cvaucher.services.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import uy.com.cvaucher.services.annotations.CedulaExistente;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.interfaces.PacientesInt;

public class ValidoCedulaExistente implements ConstraintValidator<CedulaExistente, Integer>{
	
	@Autowired
	private PacientesInt pacientesService;
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context){
			boolean control = false;
			int cedula = value;
			Pacientes paciente = pacientesService.findPacientesByCedula(cedula);
			if(cedula >0){
				try{
					
					if(paciente !=null){
						control=false;
					}
					
				}catch(NullPointerException e){
					control = false;
				}
			}
			else{
				control=true;
			}
			
			
				
		
		return control;
	}
	@Override
	public void initialize(CedulaExistente constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}
}
