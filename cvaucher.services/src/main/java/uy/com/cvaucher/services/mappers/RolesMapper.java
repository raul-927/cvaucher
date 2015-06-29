package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import uy.com.cvaucher.services.domain.Roles;
import uy.com.cvaucher.services.sql.SqlRolesProvider;

public interface RolesMapper {
	
	@InsertProvider(type =SqlRolesProvider.class, method ="insertRoles")
	@Options(useGeneratedKeys=true, keyProperty="rolId")
	void insertRole(Roles roles);
	
	@UpdateProvider(type = SqlRolesProvider.class, method ="updateRoles")
	void updateRole(Roles roles);
	
	@DeleteProvider(type = SqlRolesProvider.class, method ="deleteRoles")
	void deleteRole(Roles roles);
	
	@SelectProvider(type =SqlRolesProvider.class, method ="showAllRoles")
	@ResultMap("uy.com.cvaucher.services.mappers.RolesMapper.RolesResult")
	List<Roles> showAllRoles();
	
	@SelectProvider(type=SqlRolesProvider.class, method ="sowRolesById")
	@ResultMap("uy.com.cvaucher.services.mappers.RolesMapper.RolesResult")
	Roles showRoleById(int rolId);

}
