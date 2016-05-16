package uy.com.cvaucher.services.sql;

import java.util.Date;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.Cuentas;

public class SqlCuentasProvider {
	
	public String insertCuenta(final Cuentas cuentas){
		return new SQL(){{
			INSERT_INTO("cuentas");
			if(!cuentas.getCuentaDesc().equals(null)){
				VALUES("cuenta_desc","#{cuentaDesc}");
			}
			if(!cuentas.getGrupoCuentas().equals(null)){
				VALUES("cuenta_grupo_id","#{grupoCuentas.grupoCuentaId}");
			}
			if(!cuentas.getCuentaFecha().equals(null)){
				VALUES("cuenta_fecha","#{cuentaFecha}");
			}
			if(!cuentas.getCuentaHora().equals(null)){
				VALUES("cuenta_hora","#{cuentaHora}");
			}
			if(!cuentas.getCuentaUsuario().equals(null)){
				VALUES("cuenta_usuario","#{cuentaUsuario}");
			}
		}}.toString();
	}
	
	public String selectCuentaByCuentaDesc(final String cuentaDesc){
		return new SQL(){{
			SELECT("cuenta_id, cuenta_desc, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
			WHERE("cuenta_desc = "+cuentaDesc);
		}}.toString();
	}
	
	public String selectCuentaByCuentaId(final int cuentaId){
		return new SQL(){{
			SELECT("cuenta_id, cuenta_desc, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
			WHERE("cuenta_id = "+cuentaId);
		}}.toString();
	}
	
	public String selectCuentaByFecha(final Date cuentaFecha){
		return new SQL(){{
			SELECT("cuenta_id, cuenta_desc, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
			WHERE("cuenta_fecha = "+cuentaFecha);
		}}.toString();
	}
	
	public String selectCuentaByHora(final Date cuentaHora){
		return new SQL(){{
			SELECT("cuenta_id, cuenta_desc, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
			WHERE("cuenta_hora = "+cuentaHora);
		}}.toString();
	}
/*
	public String selectCuentaByFechaHora(final Date cuentaFecha, final Date cuentaHora){
		return new SQL(){{
			SELECT("cuenta_id, cuenta_desc, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
			WHERE("cuenta_fecha = "+cuentaFecha);
			WHERE("cuenta_hora = "+cuentaHora);
		}}.toString();
	}
*/
	public String selectAllCuentas(){
		return new SQL(){{
			SELECT("cuenta_id, cuenta_grupo_id, cuenta_desc, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
		}}.toString();
	}
}
