package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;

import uy.com.cvaucher.services.domain.Sesiones;

public interface SesionesMapper {
	
	
	
	@Select("SELECT * FROM sesiones")
	@ResultMap("uy.com.cvaucher.services.mappers.SesionesMapper")
	List<Sesiones> findAllSesiones();
	
	
	@Select("SELECT * FROM sesiones WHERE ses_trat_pac_id =#{tratPaciente.tratPacId}"
			+ "AND tratPaciente.paciente.cedula = ")
	@ResultMap("uy.com.cvaucher.services.mappers.SesionesMapper")
	List<Sesiones> findSesionesById(int sesId);
	
	@Select("SELECT * FROM sesiones WHERE ses_pac_id =#{pacId}")
	@ResultMap("uy.com.cvaucher.services.mappers.SesionesMapper")
	List<Sesiones> findSesionesByPacId(int pacId);
	
	
	@Select("SELECT s.ses_id, s.ses_trat_pac_id, s.ses_cantidad, "
			+ "s.sesiones_realizadas,s.sesiones_pendientes, s.ses_fecha_reserva,"
			+ "s.ses_estado_realizada, s.ses_estado_vigencia, s.ses_estado_pago, "
			+ "s.ses_fecha_pago "
			+ "FROM sesiones s, tratamiento_paciente t "
			+ "WHERE s.ses_trat_pac_id = t.trat_pac_id "
			+ "AND	t.pac_cedula = #{cedula}")
	List<Sesiones> findSesionesByCedula(int cedula);
	
	@Insert("INSERT INTO sesiones" +
			"(ses_id, ses_pac_id, ses_trat_id, ses_cant, ses_realizada, ses_importe, ses_pago, ses_saldo)" +
			"VALUES" +
			"(#{sesId}, #{pacientes.pacId}, #{tratamiento.tratId}, #{sesCant}, #{sesRealizada}, #{sesImporte}, #{sesPago}, #{sesSaldo})")
	void insertSesiones(Sesiones sesiones);
	
	
	@Update("UPDATE sesiones" +
			"SET ses_pac_id 	= #{pacientes.pacId}," +
			"ses_trat_id 		=  #{tratamiento.tratId}, " +
			"ses_cant 			= #{sesCant}, " +
			"ses_realizada 		= #{sesRealizada}, " +
			"ses_importe 		= #{sesImporte}, " +
			"ses_pago			= #{sesPago}, " +
			"ses_saldo			= #{sesSaldo}" +
			"WHERE ses_id 		=#{sesId}")
	void updateSesiones(Sesiones sesiones);
	
	
	@Delete("DELETE FROM sesiones WHERE ses_id =#{sesId}")
	void deleteSesiones(int sesId);
			
}
