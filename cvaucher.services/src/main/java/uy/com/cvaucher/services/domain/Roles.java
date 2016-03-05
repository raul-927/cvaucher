package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class Roles implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int		rolId;
	private String 	rolName;
	
	
	public int getRolId() {
		return this.rolId;
	}
	public void setRolId(int rolId) {
		this.rolId = rolId;
	}
	
	public String getRolName() {
		return this.rolName;
	}
	public void setRolName(String rolName) {
		
		this.rolName = rolName;
	}

	

}
