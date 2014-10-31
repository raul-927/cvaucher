package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import uy.com.cvaucher.services.domain.Tratamiento;

public interface TratamientoMapper 
{
	@Select("SELECT trat_id, trat_tpo_id, trat_descripcion, trat_cant_sesiones FROM tratamiento "
			+ "ORDER BY trat_id")
	@ResultMap("uy.com.cvaucher.services.mappers.TratamientoMapper.TratResult")
	List<Tratamiento> findAllTratamientos();
	
	@Select("SELECT trat_id, trat_tpo_id, trat_descripcion, trat_cant_sesiones FROM tratamiento WHERE trat_id=#{tratId}")
	@ResultMap("uy.com.cvaucher.services.mappers.TratamientoMapper.TratResult")
	Tratamiento findTratamientoById(Integer tratId);
	
	@Select("SELECT trat_id, trat_tpo_id, trat_descripcion, trat_cant_sesiones FROM tratamiento WHERE trat_cedula=#{cedula}")
	@ResultMap("uy.com.cvaucher.services.mappers.TratamientoMapper.TratResult")
	List<Tratamiento> findTratamientoByCedula(int cedula);
	
	@Select("SELECT trat_cant_sesiones FROM tratamiento WHERE trat_id = #{tratId}")
	@ResultMap("uy.com.cvaucher.services.mappers.TratamientoMapper.SesionResult")
	int findSesionesByTratamientoId(int tratId);
	
	
	@Insert("INSERT INTO tratamiento (trat_tpo_id, trat_descripcion,trat_cant_sesiones)VALUES(#{tipoTratamiento.tipTratId}, #{tratDescripcion}, #{tratCantSesiones})")
	@Options(useGeneratedKeys=true, keyProperty="tratId")
	void insertTratamiento(Tratamiento tratamiento);
	
	
	@Update("UPDATE tratamiento set trat_tpo_id = #{tipoTratamiento.tipTratId}, trat_descripcion = #{tratDescripcion} WHERE  trat_id=#{tratId}")
	void updateTratamiento(Tratamiento tratamiento);
	
	
	@Delete("DELETE FROM tratamiento WHERE trat_id=#{tratId}")
	void deleteTratamiento(int tratId);
	
}
