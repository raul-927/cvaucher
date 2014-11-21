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
	@ResultMap("uy.com.cvaucher.services.mappers.SeguimientoPacientesMapper.SeguimientoPacientesResult")
	List<SeguimientoPacientes> findAllSeguimientoPacientes();
	
	@Select("Select * FROM seguimiento_pacientes WHERE trat_pac_id =#{tratPacId}")
	@ResultMap("uy.com.cvaucher.services.mappers.SeguimientoPacientesMapper.SeguimientoPacientesResult")
	List<SeguimientoPacientes> findSeguimientoPacientesByTratPacId( int tratPacId);
	
	
	@Insert(" INSERT INTO seguimiento_pacientes" +
			"(trat_pac_id, fecha_control, " +
			" brazo_izquierdo, " +
			"brazo_derecho, muzlo_izquierdo, " +
			"muzlo_derecho, abdomen, cintura, cadera, peso, imc, observaciones)" +
			"VALUES" +
			"(#{tratPacId}, #{fechControl}, " +
			" #{brazoI}, #{brazoD}, " +
			"#{muzloI}, #{muzloD}, #{abdomen}, " +
			"#{cintura}, #{cadera}, #{peso}, #{imc}, #{observaciones})")
	@Options(useGeneratedKeys=true, keyProperty="segPacId")
	void insertSeguimientoPacientes(SeguimientoPacientes seguimientoPacientes);
	
	
	@Update("UPDATE seguimiento_pacientes" +
			"SET  " +
			"fecha_control = #{fechControl}," +
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
			"WHERE	seg_pac_id = #{segPacId}")
	void updateSeguimientoPacientes(SeguimientoPacientes seguimientoPacientes);
	
	
	@Delete("DELETE FROM seguimiento_pacientes WHERE seg_pac_id = #{segPacId}")
	void deleteSeguimientoPacientes(int segPacId);
	
	
}
