package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class Authorities implements Serializable{
	private static final long serialVersionUID = 1L;
	private int authId;
	private String userName;
	private String authority;
	
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
