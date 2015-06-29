package uy.com.cvaucher.services.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.domain.Login;
import uy.com.cvaucher.services.interfaces.LoginInt;
import uy.com.cvaucher.services.mappers.LoginMapper;

@Service
@Transactional
public class LoginService implements LoginInt {

	@Autowired
	private LoginMapper loginMapper;
	@Override
	public Login showLoginUser(String domUserNic) {
		
		return loginMapper.showLoginUser(domUserNic);
		
	}

}
