package uy.com.cvaucher.services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import uy.com.cvaucher.services.domain.Roles;
import uy.com.cvaucher.services.interfaces.RolesInt;
import uy.com.cvaucher.services.mappers.RolesMapper;

public class RolesService implements RolesInt{
	@Autowired
	private RolesMapper rolesMapper;
	@Override
	public void insertRole(Roles roles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRole(Roles roles) {

		rolesMapper.updateRole(roles);
		
	}

	@Override
	public void deleteRole(Roles roles) {
		rolesMapper.deleteRole(roles);
		
	}

	@Override
	public List<Roles> showAllRoles() {
		List<Roles> roles = rolesMapper.showAllRoles();
		return roles;
	}

	@Override
	public Roles showRoleById(int rolId) {
		Roles roles = rolesMapper.showRoleById(rolId);
		return roles;
	}

}
