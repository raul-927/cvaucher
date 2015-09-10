package uy.com.cvaucher.services.domain;


import java.io.Serializable;
import java.util.InputMismatchException;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import uy.com.cvaucher.services.annotations.Cedula;


public class Pacientes implements Serializable
{

	private static final long serialVersionUID = 1L;

	
	private int		pacId;
	
	@NotNull(message ="\n ERROR; Debe ingresar un Nombre")
	@Size(min = 3, max = 50, message = "ERROR; Debe ingresar un nombre entre 3 y 50 caracteres")
	private String 	pacNombre;
	
	@NotNull(message ="ERROR; Debe ingresar un Apellido")
	@Size(min = 3, max = 50, message = "ERROR; Debe ingresar un apellido entre 3 y 50 caracteres")
	private String 	pacApellido;
	
	
	@Digits(message ="Debe ingresar unicamente numeros", fraction = 0, integer = 8)
	@Max(value=99999999, message ="ERROR; Ingrse un maximo de 8 digitos")
	@NotNull(message ="ERROR; Debe ingresar un nro de cedula valido")
	@Min(value=1111111, message ="ERROR; Ingrse un valor mayor a 6 digitos")
	@Cedula(message ="Cedula Invalida")
	private int		cedula;

	private String 	ocupacion;
	private String	sociedadMedica;
	private String	emergenciaMovil;
	
	

	public int getPacId()
	{
		return pacId;
	}

	public void setPacId(int pacId) 
	{
		this.pacId = pacId;
	}
//-----------------------------------------------------
	public String getPacNombre() 
	{
		return pacNombre;
	}

	public void setPacNombre(String pacNombre) 
	{
		this.pacNombre = pacNombre;
	}
//-----------------------------------------------------
	public String getPacApellido() 
	{
		return pacApellido;
	}

	public void setPacApellido(String pacApellido) 
	{
		this.pacApellido = pacApellido;
	}
//-----------------------------------------------------
	public int getCedula() 
	{
		
		return cedula;
	}

	public void setCedula(int cedula) 
	{
		try{
			this.cedula = cedula;
		}
		catch (InputMismatchException e){
			
		}
		catch(NumberFormatException e){
			
		}
		
	}
//-----------------------------------------------------
	

//-----------------------------------------------------
	public String getOcupacion() 
	{
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) 
	{
		this.ocupacion = ocupacion;
	}
//-----------------------------------------------------
	public String getSociedadMedica() 
	{
		return sociedadMedica;
	}

	public void setSociedadMedica(String sociedadMedica) 
	{
		this.sociedadMedica = sociedadMedica;
	}
//-----------------------------------------------------
	public String getEmergenciaMovil() 
	{
		return emergenciaMovil;
	}

	public void setEmergenciaMovil(String emergenciaMovil) 
	{
		this.emergenciaMovil = emergenciaMovil;
	}

//-----------------------------------------------------	
}
