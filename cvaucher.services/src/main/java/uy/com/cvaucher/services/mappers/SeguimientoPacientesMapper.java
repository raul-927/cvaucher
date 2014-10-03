package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.SeguimientoPacientes;




@SuppressWarnings("unused")
public interface SeguimientoPacientesMapper 
{
	@Select("Select * FROM seguimiento_pacientes")
	@ResultMap("uy.com.cvaucher.services.mappers.SeguimientoPacientesMapper")
	List<SeguimientoPacientes> findAllSeguimientoPacientes();
	
	@Select("Select * FROM seguimiento_pacientes WHERE pac_id =#{pacId}")
	@ResultMap("uy.com.cvaucher.services.mappers.SeguimientoPacientesMapper")
	SeguimientoPacientes findSeguimientoPacientesByid( int pacId);
	
	
	@Insert(" INSERT INTO seguimiento_pacientes" +
			"(pac_id, fecha_comienzo_tratamiento, " +
			"frecuencia, observaciones, brazo_izquierdo, " +
			"brazo_derecho, muzlo_izquierdo, " +
			"muzlo_derecho, abdomen, cintura, cadera, peso, imc)" +
			"VALUES" +
			"(#{pacientes.pacId}, #{fechComTrat}, #{frecuencia}, " +
			"#{observaciones}, #{brazoI}, #{brazoD}, " +
			"#{muzloI}, #{muzloD}, #{abdomen}, " +
			"#{cintura}, #{cadera}, #{peso}, #{imc})")
	void insertSeguimientoPacientes(SeguimientoPacientes segpacientes);
	
	
	@Update("UPDATE seguimiento_pacientes" +
			"SET  " +
			"fecha_comienzo_tratamiento= #{fechComTrat}," +
			"frecuencia =  #{frecuencia}," +
			"observaciones = #{observaciones}," +
			"brazo_izquierdo = #{brazoI}," +
			"brazo_derecho =  #{brazoD}," +
			"muzlo_izquierdo = #{muzloI}," +
			"muzlo_derecho = #{muzloD}," +
			"abdomen = #{abdomen}," +
			"cintura = #{cintura}," +
			"cadera = #{cadera}," +
			"peso = #{peso}," +
			"imc =  #{imc}" +
			"WHERE	pac_id = #{pacientes.pacId}")
	void updateSeguimientoPacientes(SeguimientoPacientes segpacientes);
	
	
	@Delete("DELETE FROM seguimiento_pacientes WHERE pac_id = #{pacId}")
	void deleteSeguimientoPacientes(int pacId);
	
	
}
