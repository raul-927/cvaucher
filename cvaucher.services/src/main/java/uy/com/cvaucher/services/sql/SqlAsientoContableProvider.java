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
			VALUES("as_con_caja_id","#{caja.cajaId}");
			VALUES("as_con_nro","#{asConNro}");
			VALUES("as_cuenta_debe","#{asCuentaDebe.cuentaId}");
			VALUES("as_cuenta_debeMonto","#{asCuentaDebeMonto}");
			VALUES("as_cuenta_haber","#{asCuentaHaber.cuentaId}");
			VALUES("as_cuenta_haberMonto","#{asCuentaHaberMonto}");
			VALUES("as_cuenta_tipo","#{asCuentaTipo}");
			VALUES("as_con_descripcion","#{asConDescripcion}");
			VALUES("as_con_fecha","#{asConFecha}");
			VALUES("as_con_hora","#{asConHora}");
			VALUES("as_con_usr","#{asConUsr}");
			
		}}.toString();
	}
	
	public String maxNumAsiento(){
		return new SQL(){{
			SELECT("MAX(as_con_nro)+1 max_num");
			FROM("asiento_contable");
		}}.toString();
	}
	
	public String cantRegistros(){
		return new SQL(){{
			SELECT("COUNT(1) max_num");
			FROM("asiento_contable");
		}}.toString();
	}
	
	public String showAsientoContable(final AsientoContable asientoContable){
		return new SQL(){{
			SELECT("as_con_id, as_con_caja_id, as_con_nro, as_cuenta_debe, as_cuenta_debeMonto, "
					+ "as_cuenta_haber, as_cuenta_haberMonto, as_cuenta_tipo, as_con_descripcion, "
					+ "as_con_fecha");
			FROM("asiento_contable");
			if(asientoContable.getAsContId()>0){
				WHERE("as_con_id = #{asConId}");
			}
			if(asientoContable.getCaja().getCajaId()>0){
				WHERE("as_con_caja_id = #{cajaId}"+asientoContable.getCaja().getCajaId());
			}
			if(asientoContable.getAsConNro()>0){
				WHERE("as_con_nro = #{asConNro}");
			}
			if(!asientoContable.getAsCuentaDebe().equals(null)||!asientoContable.getAsCuentaDebe().equals("")){
				WHERE("as_cuenta_debe = #{asCuentaDebe}");
			}
			if(!asientoContable.getAsCuentaHaber().equals(null)||!asientoContable.getAsCuentaHaber().equals("")){
				WHERE("as_cuenta_haber = #{asCuentaHaber}");
			}
		}}.toString();
	}
	public String showAsientoContableByAsConNro(final int asConNro){
		return new SQL(){{
			SELECT("as_con_id, as_con_caja_id, as_con_nro, as_cuenta_debe, as_cuenta_debeMonto, "
					+ "as_cuenta_haber, as_cuenta_haberMonto, as_cuenta_tipo, as_con_descripcion, "
					+ "as_con_fecha");
			FROM("asiento_contable");
			WHERE("as_con_nro = #{asConNro}");
		}}.toString();
	}
}
