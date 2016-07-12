package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.PagoTarjeta;

public class SqlPagoTarjetaProvider {
	
	public String insertPagoTarjeta(PagoTarjeta pagoTarjeta){
		return new SQL(){{
			INSERT_INTO("pago_tarjetas");
			VALUES("tarjeta_caja_id","#{tarjetaCajaId}");
			VALUES("tarj_pac_cedula","#{tarjPacCedula}");
			VALUES("tarj_pago_id","#{tarjPagoId}");
			VALUES("tarj_nro","#{tarjNro}");
			VALUES("tarj_desc","#{tarjDesc}");
			VALUES("tarj_vence","#{tarjVence}");
			VALUES("tarj_importe","#{tarjImporte}");
			VALUES("tarj_cuenta","#{tarjCuenta}");
			VALUES("tarj_cuotas","#{cantCuotas}");
		}}.toString();
	}
	
	public String showPagoTarjetaByCaja(final int idCaja){
		return new SQL(){{
			SELECT("tarj_id,tarj_pac_cedula, tarjeta_caja_id, tarj_pago_id, tarj_nro, tarj_desc, tarj_vence, tarj_importe, tarj_cuenta, tarj_cuotas, tarj_pago_usuario");
			FROM("pago_tarjetas");
			WHERE("tarjeta_caja_id = "+idCaja);
		}}.toString();
	}

}
