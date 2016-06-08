package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class TipoTratamiento implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer	tipTratId;
	private String 	tipTratDesc;
	
	
	public Integer getTipTratId() {
		return tipTratId;
	}
	public void setTipTratId(Integer tipTratId) {
		this.tipTratId = tipTratId;
	}
	public String getTipTratDesc() {
		return tipTratDesc;
	}
	public void setTipTratDesc(String tipTratDesc) {
		this.tipTratDesc = tipTratDesc;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipTratDesc == null) ? 0 : tipTratDesc.hashCode());
		result = prime * result + ((tipTratId == null) ? 0 : tipTratId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoTratamiento other = (TipoTratamiento) obj;
		if (tipTratDesc == null) {
			if (other.tipTratDesc != null)
				return false;
		} else if (!tipTratDesc.equals(other.tipTratDesc))
			return false;
		if (tipTratId == null) {
			if (other.tipTratId != null)
				return false;
		} else if (!tipTratId.equals(other.tipTratId))
			return false;
		return true;
	}
	
	
}
