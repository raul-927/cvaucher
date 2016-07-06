package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

public class SqlImpuestoProvider 
{
	
	public String findImpuestoById()
	{
		return new SQL(){{
		SELECT("i.impuesto_id, i.impuesto_desc, i.impuesto_desc_abrv, i.impuesto_valor, i.impuesto_tipo, c.cuenta_id, c.cuenta_desc");
		 FROM("impuesto i, cuentas c");
		 WHERE("i.impuesto_cuenta = c.cuenta_id");
		 WHERE("i.impuesto_id = #{impuestoId}");
			
			}}.toString();
	}
	
	public String findAllImpuestos()
	{
		return new SQL(){{
		SELECT("i.impuesto_id, i.impuesto_desc, i.impuesto_desc_abrv, i.impuesto_valor, i.impuesto_tipo, c.cuenta_desc");
		FROM("impuesto i, cuentas c");
		WHERE("i.impuesto_cuenta = c.cuenta_id");
		ORDER_BY("i.impuesto_id");
		}}.toString();
	}
	
	public String findAllImpuestosByTipo()
	{
		return new SQL(){{
		SELECT("impuesto_id, impuesto_desc, impuesto_desc_abrv, impuesto_valor, impuesto_tipo");
		FROM("impuesto");
		WHERE("impuesto_tipo = #{impuestoTipo}");
		ORDER_BY("impuesto_id");
		}}.toString();
	}

	
	public String insertImpuesto(){
		return new SQL(){{
			INSERT_INTO("impuesto");
			VALUES("impuesto_desc","#{impuestoDesc}");
			VALUES("impuesto_desc_abrv","#{impuestoDescAbrv}");
			VALUES("impuesto_valor","#{impuestoValor}");
			VALUES("impuesto_tipo","#{impuestoTipo}");
		}}.toString();
	}
	
}
