package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class Users implements Serializable{
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String passWord;
	private boolean enabled;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
