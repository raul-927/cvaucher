package uy.com.cvaucher.services.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import uy.com.cvaucher.services.annotations.CedulaExistente;
import uy.com.cvaucher.services.clases.NroVerifCedula;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.interfaces.PacientesInt;

public class ValidoCedulaExistente extends NroVerifCedula implements ConstraintValidator<CedulaExistente, Integer>{
	
	@Autowired
	private PacientesInt pacientesService;
	
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context){
		boolean control = true;
		boolean NroVerif = this.nroCedula(value);
		if(NroVerif){
			int cedula = value;
			Pacientes paciente = pacientesService.findPacientesByCedula(cedula);
			try{
				if(paciente !=null){
					control=false;
				}
					
			}
			catch(NullPointerException e){
				control = true;
			}
		}
		return control;
	}	
	@Override
	public void initialize(CedulaExistente constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}
}
