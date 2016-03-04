package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.Roles;

public class SqlRolesProvider 
{
	public String showAllRoles()
	{
		return new SQL(){{
			SELECT("rol_id, rol_name");
			FROM("roles");
			
		}}.toString();
	}
	
	public String sowRolesById(final int rolId)
	{
		return new SQL(){{
			SELECT("rol_id, rol_name");
			FROM("roles");
			WHERE("rol_id ="+rolId);
		}}.toString();
	}
	
	public String insertRoles(final Roles roles)
	{
		return new SQL() {{
			INSERT_INTO("roles");
			if(roles.getRolName()!= null){
				VALUES("rol_name", "#{rolName}");
			}
		}}.toString();
	}
	
	public String updateRoles(final Roles roles)
	{
		return new SQL(){{
			UPDATE("roles");
			if(roles.getRolName()!= null)
			{
				SET("rol_name = #{rolName}");
			}
		}}.toString();
	}
	
	public String deleteRoles(int rolId)
	{
		return new SQL(){{
			DELETE_FROM("roles");
			WHERE("rol_id = #{rolId}");
		}}.toString();
	}

}
