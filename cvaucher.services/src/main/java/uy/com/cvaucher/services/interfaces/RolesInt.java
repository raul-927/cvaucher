package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.Roles;



public interface RolesInt {
	
	void 		insertRole(Roles roles);
	void 		updateRole(Roles roles);
	void 		deleteRole(Roles roles);
	List<Roles> showAllRoles();
	Roles 		showRoleById(int rolId);
	

}
