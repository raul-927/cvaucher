package uy.com.cvaucher.services.domain;

import java.io.Serializable;


public class DomainUser implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int 	domUsrId;
	private String 	domUsrNom;
	private String 	domUsrAp;
	private String	domUsrNic;
	private String	domUsrPass;
	private boolean	domUsrEnabled;

	
	
	public int getDomUsrId() {
		return domUsrId;
	}
	public void setDomUsrId(int domUsrId) {
		this.domUsrId = domUsrId;
	}
	public String getDomUsrNom() {
		return domUsrNom;
	}
	public void setDomUsrNom(String domUsrNom) {
		this.domUsrNom = domUsrNom;
	}
	public String getDomUsrAp() {
		return domUsrAp;
	}
	public void setDomUsrAp(String domUsrAp) {
		this.domUsrAp = domUsrAp;
	}
	public String getDomUsrNic() {
		return domUsrNic;
	}
	public void setDomUsrNic(String domUsrNic) {
		this.domUsrNic = domUsrNic;
	}
	public String getDomUsrPass() {
		return domUsrPass;
	}
	public void setDomUsrPass(String domUsrPass) {
		this.domUsrPass = domUsrPass;
	}
	public boolean getDomUsrEnabled() {
		return domUsrEnabled;
	}
	public void setDomUsrEnabled(boolean domUsrEnabled) {
		this.domUsrEnabled = domUsrEnabled;
	}

}
