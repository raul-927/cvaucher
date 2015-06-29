package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

public class SqlLoginProvider 
{
	public String showLoginUser(final String domUserNic)
	{
		return new SQL(){{
			SELECT("d.dom_usr_nic NIC, d.dom_usr_pass PASS, d.dom_usr_enabled ENABLED, r.rol_name ROL");
			FROM("domain_user d, roles r, nic_roles n");
			WHERE("d.dom_usr_nic ="+ domUserNic);
			WHERE("d.dom_usr_enabled = 1");
			WHERE("d.dom_usr_id = n.nic_rol_user_nic_id");
			WHERE("n.nic_rol_name_id = r.rol_id");
		}}.toString();
	}

}
