package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class MaxTratPacId implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maxId;

	public int getMaxId() 
	{
		return maxId;
	}

	public void setMaxId(int maxId) 
	{
		this.maxId = maxId;
	}

}
