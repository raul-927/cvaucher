package uy.com.cvaucher.services.sql;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.ibatis.jdbc.SQL;
import org.mybatis.spring.MyBatisSystemException;

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

	public String selectAllCuentasByGrupo(final ArrayList<Integer> grupoCuentaId){
		SQL sql = new SQL();
		try{
			sql.SELECT("c.cuenta_id, f.form_pag_abreviacion, g.grupo_tipo_cuenta, g.grupo_cuenta_desc, c.cuenta_desc, c.cuenta_fecha, c.cuenta_hora, c.cuenta_usuario");
			sql.FROM("cuentas c, grupo_cuentas g, formas_de_pagos f");
			sql.WHERE("c.cuenta_grupo_id = g.grupo_cuenta_id");
			Iterator<Integer> it = grupoCuentaId.iterator();
			StringBuilder resultado = new StringBuilder();
			while(it.hasNext()){
				resultado.append(it.next()+",");
			};
			resultado.deleteCharAt(resultado.length()-1);
			sql.WHERE("g.grupo_cuenta_id IN ("+resultado+")");
			sql.ORDER_BY("c.cuenta_id");
			System.out.println("sql ==>> "+sql.toString());
		}
		catch(MyBatisSystemException e){
			System.out.println("Error ==>> "+e.getMessage());
			System.out.println("sql ==>> "+sql.toString());
		}
		catch(IllegalArgumentException e){
			System.out.println("Error de argumentos ==>> "+e.getMessage());	
			System.out.println("sql ==>> "+sql.toString());
		}
		return sql.toString();
	}

	public String selectAllCuentas(){
		return new SQL(){{
			SELECT("c.cuenta_id, f.form_pag_abreviacion, g.grupo_tipo_cuenta, g.grupo_cuenta_desc, c.cuenta_desc, c.cuenta_fecha, c.cuenta_hora, c.cuenta_usuario");
			FROM("cuentas c, grupo_cuentas g, formas_de_pagos f");
			WHERE("c.cuenta_grupo_id = g.grupo_cuenta_id");
			ORDER_BY("c.cuenta_id");
		}}.toString();
	}
}
