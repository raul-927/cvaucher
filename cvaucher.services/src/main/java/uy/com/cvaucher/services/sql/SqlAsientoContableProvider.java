package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;
import uy.com.cvaucher.services.domain.AsientoContable;

public class SqlAsientoContableProvider {
	
	public String cuentaAsientoTotal(){
		return new SQL(){{
			SELECT("c.cuenta_desc Cuenta, SUM(a.as_cuenta_debeMonto - a.as_cuenta_haberMonto) Total"); 	 
			FROM("asiento_contable a, cuentas c"); 		 
			WHERE("a.as_cuenta_debe = c.cuenta_id"); 	
			WHERE("as_cuenta_haber	= c.cuenta_id");
			WHERE("c.cuenta_id = #{cuentaId}");
			WHERE("a.as_con_fecha = #{asConFecha}");
		}}.toString();
	}
	
	public String cuentasAsientoTotal(){
		return new SQL(){{
			SELECT("c.cuenta_desc Cuenta, SUM(a.as_cuenta_debeMonto - a.as_cuenta_haberMonto) Total"); 	 
			FROM("asiento_contable a, cuentas c"); 		 
			WHERE("a.as_cuenta_debe = c.cuenta_id"); 	
			WHERE("as_cuenta_haber	= c.cuenta_id");
			WHERE("a.as_con_fecha = #{asConFecha}");
			GROUP_BY("Cuenta");
		}}.toString();
	}
	
	public String ingresarAsientoContable(final AsientoContable asientoContable){
		return new SQL(){{
			INSERT_INTO("asiento_contable");
			if((asientoContable.getAsCuentaDebe().getCuentaId()>0)){
				VALUES("as_cuenta_debe_id","#{asCuentaDebeId}");
			}
			VALUES("as_cuenta_debe","#{asCuentaDebe}");
			if((asientoContable.getAsCuentaHaber().getCuentaId()>0)){
				VALUES("as_cuenta_haber_id","#{asCuentaHaberId}");
			}
			VALUES("as_cuenta_haber","#{asCuentaHaber}");
			if(!asientoContable.getAsConDescripcion().equals(null)||!asientoContable.getAsConDescripcion().equals("")){
				VALUES("as_con_descripcion","#{asConDescripcion}");
			}
			if(!asientoContable.getAsConFecha().equals(null)){
				VALUES("as_con_fecha","#{asConFecha}");
			}
			if(!asientoContable.getAsConHora().equals(null)){
				VALUES("as_con_hora","#{asConHora}");
			}
			if(!asientoContable.getAsConUsr().equals(null)){
				VALUES("as_con_usr","#{asConUsr}");
			}
		}}.toString();
	}
}
