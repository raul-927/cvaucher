package uy.com.cvaucher.services.sql;

import org.apache.ibatis.jdbc.SQL;
import uy.com.cvaucher.services.domain.HorarioLaboral;
public class SqlHorarioLaboralProvider {
	
	public String insertarHorarioLaboral(HorarioLaboral horarioLaboral){
		return new SQL(){{
			INSERT_INTO("horario_laboral");
			VALUES("hor_lab_hora_desde","#{horLabHoraDesde}");
			VALUES("hor_lab_hora_hasta","#{horLabHoraHasta}");
			VALUES("hor_lab_semana","#{horLabSemana}");
			VALUES("hor_lab_mes","#{horLabMes}");
			VALUES("hor_lab_desc","#{horLabDesc}");
		}}.toString();
	}
	
	public String selectHorarioLaboral(final HorarioLaboral horarioLaboral){
		return new SQL(){{
			SELECT("hor_lab_id, hor_lab_hora_desde, hor_lab_hora_hasta, hor_lab_semana, hor_lab_mes, hor_lab_desc");
			FROM("horario_laboral");
			
			if(horarioLaboral.getHorLabId()!=0){
				WHERE("jor_lab_id ="+horarioLaboral.getHorLabId());
			}
			
			if(horarioLaboral.getHorLabHoraDesde()!= null){
				WHERE("jor_lab_hora_desde = "+horarioLaboral.getHorLabHoraDesde());
			}
			
			if(horarioLaboral.getHorLabHoraHasta()!=null){
				WHERE("jor_lab_hora_hasta = "+horarioLaboral.getHorLabHoraHasta());
			}
		}}.toString();
	}
	
	public String selectAllHorarioLaboral(){
		return new SQL(){{
			SELECT("hor_lab_id, hor_lab_hora_desde, hor_lab_hora_hasta, hor_lab_semana, hor_lab_mes, hor_lab_desc");
			FROM("horario_laboral");
		}}.toString();
	}
}
