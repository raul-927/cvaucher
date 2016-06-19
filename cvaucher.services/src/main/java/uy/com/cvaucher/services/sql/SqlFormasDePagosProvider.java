package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.FormasDePagos;
public class SqlFormasDePagosProvider {

	public String findAllFormasDePagos(final FormasDePagos formasDePagos){
		return new SQL(){{
			SELECT("form_pag_id, form_pag_abreviacion, form_pag_cuenta, form_pag_desc, form_pag_tipo");
			FROM("formas_de_pago");
			if(!(formasDePagos == null)){
				
				if(formasDePagos.getFormPagId() > 0){
					WHERE("form_pag_id = #{formPagId}");
				}
				if(!(formasDePagos.getFormPagAbreviacion()== null)){
					WHERE("form_pag_abreviacion = #{formPagAbreviacion}");
				}
				if(formasDePagos.getFormPagCuenta().getCuentaId()> 0){
					WHERE("form_pag_cuenta = #{formPagCuenta}");
				}
				if(!(formasDePagos.getFormPagTipo() == null)){
					WHERE("form_pag_tipo = #{formPagTipo}");
				}
			}
		}}.toString();
	}
	
	public String insertFormasDePagos(final FormasDePagos formasDePagos){
		return new SQL(){{
			INSERT_INTO("formas_de_pagos");
			if(!(formasDePagos.getFormPagAbreviacion()== null)){
				VALUES("form_pag_abreviacion","#{formPagAbreviacion}");
			}
			if((formasDePagos.getFormPagCuenta().getCuentaId()>0)){
				VALUES("form_pag_cuentas","#{formPagCuenta}");
			}
			if(!(formasDePagos.getFormPagTipo() == null)){
				VALUES("form_pag_tipo","#{formPagTipo}");
			}
		}}.toString();
	}
	
	public String updateFormasDePagos(final FormasDePagos formasDePagos){
		return new SQL(){{
			UPDATE("formas_de_pagos");
			if(!(formasDePagos.getFormPagAbreviacion()== null)){
				SET("form_pag_abreviacion = #{formPagAbreviacion}");
			}
			if((formasDePagos.getFormPagCuenta().getCuentaId()>0)){
				SET("form_pag_cuentas = #{formPagCuenta}");
				
			}
			if(!(formasDePagos.getFormPagTipo() == null)){
				SET("form_pag_tipo = #{formPagTipo}");
			}
		}}.toString();
	}
	
}
