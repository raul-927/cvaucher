package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class GroupsMembers implements Serializable{
	private static final long serialVersionUID = 1L;
	private int groupId;
	private String userName;
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
