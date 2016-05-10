package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;
import uy.com.cvaucher.services.domain.AsientoContable;

public class SqlAsientoContableProvider {
	
	public String ingresarAsientoContable(){
		return new SQL(){{
			INSERT_INTO("asiento_contable");
			VALUES("as_cuenta_debe_id","#{asCuentaDebeId}");
			VALUES("as_cuenta_debe","#{asCuentaDebe}");
			VALUES("asCuentaHaberId","#{as_cuenta_haber_id}");
			VALUES("as_cuenta_haber","#{asCuentaHaber}");
			VALUES("asConDescripcion","#{as_con_descripcion}");
			VALUES("asConFecha","#{as_con_fecha}");
			VALUES("asConHora","#{as_con_hora}");
			VALUES("asConUsr","#{as_con_usr}");
		}}.toString();
	}
}
