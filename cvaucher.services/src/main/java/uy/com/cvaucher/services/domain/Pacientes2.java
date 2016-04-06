package uy.com.cvaucher.services.domain;


import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import uy.com.cvaucher.services.annotations.Documento;


public class Pacientes2 implements Serializable
{

	private static final long serialVersionUID = 1L;

	
	
	private int		pacId;
	
	@NotNull(message ="\n ERROR; Debe ingresar un Nombre")
	@Size(min = 3, max = 50, message = "ERROR; Debe ingresar un nombre entre 3 y 50 caracteres")
	private String 	pacNombre;
	
	@NotNull(message ="ERROR; Debe ingresar un Apellido")
	@Size(min = 3, max = 50, message = "ERROR; Debe ingresar un apellido entre 3 y 50 caracteres")
	private String 	pacApellido;
	
	
	private String tipoDocPaciente;
	
	@Documento(message = "Documento Invalido")
	private String documento;
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

	public String getTipoDocPaciente() {
		return tipoDocPaciente;
	}

	public void setTipoDocPaciente(String tipoDocPaciente) {
		
		this.tipoDocPaciente = tipoDocPaciente;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		
		this.documento = documento;
	}

//-----------------------------------------------------	
}
