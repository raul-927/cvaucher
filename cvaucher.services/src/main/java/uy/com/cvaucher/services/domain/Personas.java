package uy.com.cvaucher.services.domain;

import java.util.InputMismatchException;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import uy.com.cvaucher.services.annotations.Cedula;

public abstract class  Personas 
{
	@NotNull(message ="\n ERROR; Debe ingresar un Nombre")
	@Size(min = 3, max = 50, message = "ERROR; Debe ingresar un nombre entre 3 y 50 caracteres")
	private String 			nombre;
	
	@NotNull(message ="ERROR; Debe ingresar un Apellido")
	@Size(min = 3, max = 50, message = "ERROR; Debe ingresar un apellido entre 3 y 50 caracteres")
	private String 			apellido;
	
	
	@Max(value=99999999, message ="ERROR; Ingrse un maximo de 8 digitos")
	@NotNull(message ="ERROR; Debe ingresar un nro de cedula valido")
	@Min(value=1111111, message ="ERROR; Ingrse un valor mayor a 6 digitos")
	@Cedula(message ="Cedula Invalida")
	private int				cedula;
	
	
	//-----------------------------------------------------
		public String getNombre() 
		{
			return nombre;
		}

		public void nombre(String nombre) 
		{
			this.nombre = nombre;
		}
	//-----------------------------------------------------
		public String getApellido() 
		{
			return apellido;
		}

		public void setApellido(String apellido) 
		{
			this.apellido = apellido;
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
}
