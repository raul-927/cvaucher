package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.DomainUser;

public interface DomainUserInterface 
{
	
	List<DomainUser> findAllDomainUsers();

	DomainUser findDomainUserById(int domUsrId);

	void insertDomainUser(DomainUser domainUser);

	void updateDomainUser(DomainUser domainUser);

	void deleteDomainUser(int domUsrId);


}
