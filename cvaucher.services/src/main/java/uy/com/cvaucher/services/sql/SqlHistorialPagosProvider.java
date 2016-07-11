package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.HistorialPagos;

public class SqlHistorialPagosProvider {
	
	public String findHistorialPagoByHistTratPacId(final int histTratPacId){
		return new SQL(){{
			SELECT("hist_pagos_id, hist_pagos_caja_id, hist_tipo_pago, hist_pagos_fecha_pago"
					+ "hist_pagos_hora_pago, hist_pagos_monto, hist_pagos_usuario");
			FROM("historial_pagos");
			WHERE("hist_pagos_trat_pac_id = "+histTratPacId);
		}}.toString();
	}
	
	public String insertHistorialPago(HistorialPagos historialPagos){
		return new SQL(){{
			INSERT_INTO("historial_pagos");
			VALUES("hist_pagos_caja_id","#{histPagosCajaId}");
			VALUES("hist_pagos_trat_pac_id","#{histTratPacId}");
			VALUES("hist_tipo_pago","#{histPagosTipo}");
			VALUES("hist_pagos_fecha_pago","#{histPagosFechaPago}");
			VALUES("hist_pagos_hora_pago","#{histPagosHoraPago}");
			VALUES("hist_pagos_monto","#{histPagosMonto}");
			VALUES("hist_pagos_usuario","#{histPagosUsuario}");
		}}.toString();
	}
}
