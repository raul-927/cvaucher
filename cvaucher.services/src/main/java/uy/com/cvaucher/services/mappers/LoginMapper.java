package uy.com.cvaucher.services.mappers;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import uy.com.cvaucher.services.domain.Login;
import uy.com.cvaucher.services.sql.SqlLoginProvider;

public interface LoginMapper {
	
	
	@SelectProvider(type =SqlLoginProvider.class, method ="showLoginUser")
	@ResultMap("uy.com.cvaucher.services.mappers.LoginMapper.LoginResult")
	Login showLoginUser(String domUserNic);

}
