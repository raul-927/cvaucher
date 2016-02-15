package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.DomainUser;
import uy.com.cvaucher.services.interfaces.DomainUserInt;
import uy.com.cvaucher.services.mappers.DomainUserMapper;


@Service
@Transactional
//@PreAuthorize("hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and authentication.name == 'gaby')")
public class DomainUserService implements DomainUserInt
{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DomainUserMapper domainUserMapper;
	
	@Override
	public List<DomainUser> findAllDomainUsers()
	{
		
		List<DomainUser> domainUser = domainUserMapper.findAllDomainUsers();
		
		logger.debug("findAllDomainUsers :"+domainUser);
		
		return domainUser;
	}

	@Override
	public DomainUser findDomainUserById(int domUsrId)
	{
		logger.debug("findDomainUserById :"+domUsrId);
		
		return domainUserMapper.findDomainUserById(domUsrId);
		
	}

	@Override
	public void insertDomainUser(DomainUser domainUser) 
	{
		logger.debug("insertDomainUser :"+domainUser);
		
		domainUserMapper.insertDomainUser(domainUser);

	}

	@Override
	public void updateDomainUser(DomainUser domainUser) 
	{
		logger.debug("updateDomainUser :"+domainUser);
		
		domainUserMapper.updateDomainUser(domainUser);

	}

	@Override
	public void deleteDomainUser(int domUsrId) 
	{
		logger.debug("deleteDomainUser :"+domUsrId);
		
		domainUserMapper.deleteDomainUser(domUsrId);

	}

}
