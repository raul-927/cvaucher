package uy.com.cvaucher.services.sql;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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
			if(!(cuentas.getCuentaTipo()<0)){
				VALUES("cuenta_tipo","#{cuentaTipo}");
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
			SELECT("cuenta_id, cuenta_desc, cuenta_tipo, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
			WHERE("cuenta_id = "+cuentaId);
		}}.toString();
	}
	
	public String selectCuentaByFecha(final Date cuentaFecha){
		return new SQL(){{
			SELECT("cuenta_id, cuenta_desc, cuenta_tipo, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
			WHERE("cuenta_fecha = "+cuentaFecha);
		}}.toString();
	}
	
	public String selectCuentaByHora(final Date cuentaHora){
		return new SQL(){{
			SELECT("cuenta_id, cuenta_desc, cuenta_tipo, cuenta_fecha, cuenta_hora, cuenta_usuario");
			FROM("cuentas");
			WHERE("cuenta_hora = "+cuentaHora);
		}}.toString();
	}

	public String selectCuentaByGrupo(final String grupoCuentaId){
		return new SQL(){{
			SELECT("c.*");
			FROM("cuentas c, grupo_cuentas g");
			WHERE("c.cuenta_grupo_id = g.grupo_cuenta_id");
			WHERE("grupo_cuenta_id IN ("+grupoCuentaId+")");
		}}.toString();
	}

	public String selectAllCuentas(){
		return new SQL(){{
			SELECT("c.cuenta_id, f.form_pag_abreviacion, g.grupo_tipo_cuenta, g.grupo_cuenta_desc, c.cuenta_desc, c.cuenta_tipo, c.cuenta_fecha, c.cuenta_hora, c.cuenta_usuario");
			FROM("cuentas c, grupo_cuentas g, formas_de_pagos f");
			WHERE("c.cuenta_grupo_id = g.grupo_cuenta_id");
			ORDER_BY("c.cuenta_id");
		}}.toString();
	}
}
