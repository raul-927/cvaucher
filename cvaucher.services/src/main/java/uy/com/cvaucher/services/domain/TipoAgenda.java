package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class TipoAgenda implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int 	tpoAgId;
	
	private  String	tpoAgText;
	
	
	public int getTpoAgId() 
	{
		return tpoAgId;
	}
	public void setTpoAgId(int tpoAgId) 
	{
		this.tpoAgId = tpoAgId;
	}
	
	public String getTpoAgText()
	{
		return tpoAgText;
	}
	public void setTpoAgText(String tpoAgText) 
	{
		
		
		this.tpoAgText = tpoAgText;
		
	}

}
