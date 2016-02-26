package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class GroupsAuthorities implements Serializable{
	private static final long serialVersionUID = 1L;
	private int groupAuthoritiesId;
	private String authority;
	
	public int getGroupAuthoritiesId() {
		return groupAuthoritiesId;
	}
	public void setGroupAuthoritiesId(int groupAuthoritiesId) {
		this.groupAuthoritiesId = groupAuthoritiesId;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
