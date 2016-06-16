package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.FormasDePagos;
public class SqlFormasDePagosProvider {
	
	public String findFormasDePagosById(int formPagId){
		return new SQL(){{
			SELECT("form_pag_id, form_pag_abreviacion, form_pag_cuenta_id, form_pag_desc, form_pag_tipo");
			FROM("formas_de_pago");
			WHERE("form_pag_id = #{formPagId}");
		}}.toString();
	}
	
	public String findAllFormasDePagos(final FormasDePagos formasDePagos){
		return new SQL(){{
			SELECT("form_pag_id, form_pag_abreviacion, form_pag_cuenta_id, form_pag_desc, form_pag_tipo");
			FROM("formas_de_pago");
			if(!(formasDePagos == null)){
				if(formasDePagos.getFormPagId() > 0){
					WHERE("form_pag_id = #{formPagId}");
				}
				if(formasDePagos.getCuentas().getCuentaId() > 0){
					WHERE("form_pag_cuenta_id = #{cuentas.cuentaId}");
				}
				if(!(formasDePagos.getFormPagTipo() == null)){
					WHERE("form_pag_tipo = #{formPagTipo}");
				}
			}
		}}.toString();
	}

}
