package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.GrupoCuentas;

public class SqlGrupoCuentasProvider {
	
	public String insertGrupoCuentas(final GrupoCuentas grupoCuentas){
		return new SQL(){{
			if(!grupoCuentas.getGrupoCuentaDesc().equals(null) && !grupoCuentas.getTipoCuenta().equals(null)){
				INSERT_INTO("grupo_cuentas");
				VALUES("grupo_tipo_cuenta","#{tipoCuenta}");
				VALUES("grupo_cuenta_desc","#{grupoCuentaDesc}");
			}
		}}.toString();
	}
	
	public String showAllGrupoCuentas(){
		return new SQL(){{
			SELECT("grupo_cuenta_id, grupo_tipo_cuenta, grupo_cuenta_desc");
			FROM("grupo_cuentas");
		}}.toString();
	}
}
