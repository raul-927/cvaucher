package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;

import uy.com.cvaucher.services.domain.Caja;

public class SqlCajasProvider {
	
	public String aperturaCaja(){
		return new SQL(){{
			SELECT("caja_id, caja_estado, caja_fecha, caja_hora, caja_usr");
			FROM("caja");
			ORDER_BY("caja_id DESC LIMIT 1");
		}}.toString();
	}
	
	public String insertCaja(final Caja caja){
		return new SQL(){{
			INSERT_INTO("caja");
			
			if(caja.getCajaEstado()!= null){
				if(caja.getCajaEstado().equals("CERRADO")){
					VALUES("caja_estado","'ABIERTO'");
				}
				else{
					VALUES("caja_estado","'CERRADO'");
				}
			}
			if(caja.getCajaFecha()!= null){
				VALUES("caja_fecha","#{cajaFecha}");
			}
			if(caja.getCajaHora()!= null){
				VALUES("caja_hora","#{cajaHora}");
			}
			if(caja.getCajaUsr()!= null){
				VALUES("caja_usr","#{cajaUsr}");
			}
		}}.toString();
	}
	
	public String cerrarCaja(final Caja caja){
		return new SQL(){{
			UPDATE("caja");
			SET("caja_estado = #{cajaEstado}");
			WHERE("caja_id )= #{cajaId}");
		}}.toString();
	}
	
	public String cargoCajaActual(){
		return new SQL(){{
			SELECT("caja_id, caja_estado, caja_fecha, caja_hora, caja_usr");
			FROM("caja"); 
			WHERE("caja_id = ("+selectMaxIdCaja()+")");
		}}.toString();
	}
	private String selectMaxIdCaja(){
		return new SQL(){{
			SELECT("MAX(caja_id)");
			FROM("caja");
		}}.toString();
	}

}
