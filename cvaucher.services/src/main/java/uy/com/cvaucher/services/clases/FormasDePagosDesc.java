package uy.com.cvaucher.services.clases;

import java.io.Serializable;

public class FormasDePagosDesc implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private String formasDePagoDesc;
	
	public String getFormasDePagoDesc() 
	{
		return formasDePagoDesc;
	}
	
	public void setFormasDePagoDesc(String formasDePagoDesc) 
	{
		this.formasDePagoDesc = formasDePagoDesc;
	}

}
