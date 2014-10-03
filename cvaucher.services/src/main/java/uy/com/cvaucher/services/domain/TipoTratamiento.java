package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class TipoTratamiento implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 	tipTratId;
	private String 	tipTratDesc;
	
	
	public int getTipTratId() {
		return tipTratId;
	}
	public void setTipTratId(int tipTratId) {
		this.tipTratId = tipTratId;
	}
	public String getTipTratDesc() {
		return tipTratDesc;
	}
	public void setTipTratDesc(String tipTratDesc) {
		this.tipTratDesc = tipTratDesc;
	}
	
	
	
	
}
