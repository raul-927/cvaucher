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
				VALUES("asCuentaHaberId","#{as_cuenta_haber_id}");
			}
			VALUES("as_cuenta_haber","#{asCuentaHaber}");
			if(!asientoContable.getAsConDescripcion().equals(null)||!asientoContable.getAsConDescripcion().equals("")){
				VALUES("asConDescripcion","#{as_con_descripcion}");
			}
			if(!asientoContable.getAsConFecha().equals(null)){
				VALUES("asConFecha","#{as_con_fecha}");
			}
			if(!asientoContable.getAsConHora().equals(null)){
				VALUES("asConHora","#{as_con_hora}");
			}
			if(!asientoContable.getAsConUsr().equals(null)){
				VALUES("asConUsr","#{as_con_usr}");
			}
		}}.toString();
	}
}
