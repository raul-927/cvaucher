package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.FormasDePagos;
public class SqlFormasDePagosProvider {

	public String findAllFormasDePagos(final FormasDePagos formasDePagos){
		return new SQL(){{
			SELECT("f.form_pag_id, f.form_pag_abreviacion, c.cuenta_desc, f.form_pag_desc, f.form_pag_tipo");
			FROM("formas_de_pagos f, cuentas c");
			WHERE("f.form_pag_cuenta = c.cuenta_id");
			if(formasDePagos != null){
				
				if(formasDePagos.getFormPagId() > 0){
					WHERE("form_pag_id = #{formPagId}");
				}
				if(formasDePagos.getFormPagAbreviacion()!= null){
					WHERE("form_pag_abreviacion = #{formPagAbreviacion}");
				}
				if(formasDePagos.getFormPagCuenta().getCuentaId()> 0){
					WHERE("form_pag_cuenta = #{formPagCuenta}");
				}
				if(formasDePagos.getFormPagTipo() != null){
					WHERE("form_pag_tipo = #{formPagTipo}");
				}
				if(formasDePagos.getFormPagDesc()!=null){
					WHERE("form_pag_desc = #{formPagDesc}");
				}
			}
		}}.toString();
	}
	
	public String findFormPagoTipoByDesc(){
		String sql= new SQL(){{
				SELECT("form_pag_abreviacion Abreviacion, form_pag_tipo Tipo, form_pag_cuenta Cuenta ");
				FROM("formas_de_pagos");
				WHERE("form_pag_abreviacion = #{formPagAbreviacion}");
		}}.toString();
		System.out.println("sql ==>> "+sql);
		
		return sql;
	}
	
	public String insertFormasDePagos(final FormasDePagos formasDePagos){
		return new SQL(){{
			INSERT_INTO("formas_de_pagos");
			if(!(formasDePagos.getFormPagAbreviacion()== null)){
				VALUES("form_pag_abreviacion","#{formPagAbreviacion}");
			}
			if((formasDePagos.getFormPagCuenta().getCuentaId()>0)){
				VALUES("form_pag_cuenta","#{formPagCuenta.cuentaId}");
			}
			if(formasDePagos.getFormPagDesc()!=null){
				VALUES("form_pag_desc","#{formPagDesc}");
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
	
	public String cuentaFormaDePagoDesc(){
		return new SQL(){{
			SELECT_DISTINCT("cu.cuenta_desc");
			FROM("formas_de_pagos f, cuentas cu");
			WHERE("cu.cuenta_id = #{cuentaId}");
			WHERE("f.form_pag_cuenta = cu.cuenta_id");
			
		}}.toString();
		
	}
	
}
