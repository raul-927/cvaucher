package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.SesionRealizada;

public interface SesionRealizadaMapper {
	
	
	@Select("SELECT * FROM ses_realizadas")
	@ResultMap("uy.com.cvaucher.services.mappers.SesionRealizadaMapper.SesionRealizadaResult")
	List<SesionRealizada> findAllSesionRealizada();
	
	
	@Select("SELECT * FROM ses_realizadas WHERE ses_realizada_id = #{sesRealizadaId}")
	@ResultMap("uy.com.cvaucher.services.mappers.SesionRealizadaMapper.SesionRealizadaResult")
	SesionRealizada findSesionRealizadaById(int sesRealizadaId);
	
	
	@Insert("INSERT INTO ses_realizadas (ses_realizada_id, ses_id, ses_cant, ses_fecha_realizada)" +
			"VALUES (#{sesRealizadaId}, #{sesiones.sesId}, #{sesCantidad}, #{sesFechaRalizada}")
	void insertSesionRealizada(SesionRealizada sesionRealizada);
	
	
	@Update("UPDATE ses_realizadas " +
			"SET ses_id = #{sesiones.sesId}," +
			"ses_cant =  #{sesCantidad}, ses_fecha_realizada = #{sesFechaRalizada} " +
			"WHERE ses_realizada_id = #{sesRealizadaId}")
	void updateSesionRealizada(SesionRealizada sesionRealizada);
	
	
	@Delete("DELETE FROM ses_realizadas WHERE ses_realizada_id = #{sesRealizadaId}")
	void deleteSesionRealizada(int sesRealizadaId);

}
