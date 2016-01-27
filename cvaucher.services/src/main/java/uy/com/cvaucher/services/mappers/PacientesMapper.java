package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.clases.SearchPacientes;
public interface PacientesMapper 
{
	
	@Select("SELECT * FROM pacientes")
	@ResultMap("uy.com.cvaucher.services.mappers.PacientesMapper.PacientesResult")
	List<Pacientes> findAllPacientes();
	
	
	/*@Select("SELECT * FROM pacientes " +
			"WHERE cedula = #{cedula} " +
			"OR pac_nombre = #{pacNombre} " +
			"OR pac_apellido = #{pacApellido} " +
			"OR(pac_nombre = #{pacNombre} AND pac_apellido = #{pacApellido})")
	@ResultMap("uy.com.cvaucher.services.mappers.PacientesMapper.PacientesResult")*/
	List<Pacientes> findPacientes(SearchPacientes searchPacientes);
	
	@Select("SELECT * FROM pacientes WHERE pac_id = #{pacId}")
	@ResultMap("uy.com.cvaucher.services.mappers.PacientesMapper.PacientesResult")
	Pacientes findPacientesById(int pacId);
	
	@Select("SELECT * FROM pacientes WHERE pac_nombre = #{pacNombre:VARCHAR}")
	@ResultMap("uy.com.cvaucher.services.mappers.PacientesMapper.PacientesResult")
	List<Pacientes> findPacientesByNom(String pacNombre);
	
	@Select("SELECT * FROM pacientes WHERE pac_apellido = #{pacApellido:VARCHAR}")
	@ResultMap("uy.com.cvaucher.services.mappers.PacientesMapper.PacientesResult")
	List<Pacientes> findPacientesByApellido(String pacApellido);
	
	
	@Select("SELECT * FROM pacientes WHERE cedula = #{cedula}")
	@ResultMap("uy.com.cvaucher.services.mappers.PacientesMapper.PacientesResult")
	Pacientes findPacientesByCedula(int cedula);
	
	@Select("SELECT * FROM pacientes WHERE cedula = #{cedula}")
	@ResultMap("uy.com.cvaucher.services.mappers.PacientesMapper.PacientesResult")
	List<Pacientes> findPacientesByCedulaList(int cedula);
	
	
	@Select(("SELECT * FROM pacientes WHERE pac_nombre = #{pacNombre}"
			+ " AND pac_apellido = #{pacApellido}"))
	@ResultMap("uy.com.cvaucher.services.mappers.PacientesMapper.PacientesResult")
	List<Pacientes> findPacientesByNombreAndApellido(@Param("pacNombre")String pacNombre, @Param("pacApellido") String pacApellido);
	
	@Insert("INSERT INTO pacientes " +
						"(pac_nombre, " +
						"pac_apellido, " +
						"cedula, " +
						"pac_ocupacion, " +
						"pac_soc_med, " +
						"pac_em_movil) " +
				"VALUES (#{pacNombre}, " +
						"#{pacApellido}, " +
						"#{cedula}, " +
						"#{ocupacion}, " +
						"#{sociedadMedica}, " +
						"#{emergenciaMovil} " +
						")")
	@Options(useGeneratedKeys=true, keyProperty="pacId") 
	void insertPacientes(Pacientes pacientes);
	
	
	@Update("UPDATE pacientes " +
			"SET 	pac_nombre =#{pacNombre}, " +
					"pac_apellido =#{pacApellido}, cedula =#{cedula}, " +			
					"pac_ocupacion = #{ocupacion}, " +
					"pac_soc_med =#{sociedadMedica}, " +
					"pac_em_movil =#{emergenciaMovil} " +
					
			"WHERE 	 cedula = #{cedula}")
	void updatePacientes(Pacientes pacientes);
	
	@Delete("DELETE FROM pacientes WHERE  pac_id =#{pacId}")
	void deletePacientes(int pacId);
	
	@Delete("DELETE FROM pacientes WHERE cedula = #{cedula}")
	void deletePacientesByCedula(int cedula);
	
}
