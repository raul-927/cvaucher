package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

public class SqlArqueoCajaProvider {
	
	public String arqueoCajaDia(){
		
		return new SQL(){{
			SELECT(" hist_tipo_pago, sum(hist_pagos_monto) monto");
			FROM("historial_pagos");
			WHERE("NOT hist_tipo_pago = ''");
			WHERE("hist_pagos_fecha_pago = SYSDATE()");
			GROUP_BY("hist_tipo_pago");
		}}.toString();
		 
	}
	public String arqueoCajaGeneral(){
		
		return new SQL(){{
			SELECT(" hist_tipo_pago, sum(hist_pagos_monto) monto");
			FROM("historial_pagos");
			WHERE("NOT hist_tipo_pago = ''");
			GROUP_BY("hist_tipo_pago");
		}}.toString();
		 
	}
}
