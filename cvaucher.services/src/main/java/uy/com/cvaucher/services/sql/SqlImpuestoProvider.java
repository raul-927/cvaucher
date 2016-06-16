package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

public class SqlImpuestoProvider 
{
	
	public String findImpuestoById()
	{
		return new SQL(){{
		SELECT("impuesto_id, impuesto_desc, impuesto_desc_abrv, impuesto_valor, impuesto_tipo");
		 FROM("impuesto");
		 WHERE("impuesto_id = #{impuestoId}");
			
			}}.toString();
	}
	
	public String findAllImpuestos()
	{
		return new SQL(){{
		SELECT("impuesto_id, impuesto_desc, impuesto_desc_abrv, impuesto_valor, impuesto_tipo");
		FROM("impuesto");
		ORDER_BY("impuesto_id");
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
