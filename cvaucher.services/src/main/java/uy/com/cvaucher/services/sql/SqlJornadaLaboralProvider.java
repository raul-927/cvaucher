package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;
import uy.com.cvaucher.services.domain.JornadaLaboral;
public class SqlJornadaLaboralProvider {
	
	public String insertarJornadaLaboral(JornadaLaboral jornadaLaboral){
		return new SQL(){{
			INSERT_INTO("jornada_laboral");
			VALUES("jor_lab_hora_desde","#{jorLabHoraDesde}");
			VALUES("jor_lab_hora_hasta","#{jorLabHoraHasta}");
			VALUES("jor_lab_semana","#{jorLabSemana}");
			VALUES("jor_lab_mes","#{jorLabMes}");
		}}.toString();
	}
	
	public String selectJornadaLaboral(final JornadaLaboral jornadaLaboral){
		return new SQL(){{
			SELECT("jor_lab_id, jor_lab_hora_desde, jor_lab_hora_hasta, jor_lab_semana, jor_lab_mes");
			FROM("jornada_laboral");
			
			if(jornadaLaboral.getJorLabId()!=0){
				WHERE("jor_lab_id ="+jornadaLaboral.getJorLabId());
			}
			
			if(jornadaLaboral.getJorLabHoraDesde()!= null){
				WHERE("jor_lab_hora_desde = "+jornadaLaboral.getJorLabHoraDesde());
			}
			
			if(jornadaLaboral.getJorLabHoraHasta()!=null){
				WHERE("jor_lab_hora_hasta = "+jornadaLaboral.getJorLabHoraHasta());
			}
		}}.toString();
	}
}
