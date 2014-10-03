package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.TipoTratamiento;

public interface TipoTratamientoMapper
{
	@Select("SELECT * FROM tipo_tratamiento")
	@ResultMap("uy.com.cvaucher.services.mappers.TipoTratamientoMapper.TipoTratResult")
	List<TipoTratamiento> findAllTipoTratamiento();
	
	
	@Select("SELECT * FROM tipo_tratamiento WHERE tip_trat_id=#{tipTratId}")
	@ResultMap("uy.com.cvaucher.services.mappers.TipoTratamientoMapper.TipoTratResult")
	TipoTratamiento findTipoTratamientoById(Integer tipTratId);
	
	@Insert("INSERT INTO tipo_tratamiento (tip_trat_descripcion)VALUES(#{tipTratDesc})")
	@Options(useGeneratedKeys=true, keyProperty="tipTratId")
	void insertTipoTratamiento(TipoTratamiento tipoTratamiento);
	
	
	@Update("UPDATE tipo_tratamiento set tip_trat_descripcion = #{tipTratDesc} WHERE  tip_trat_id=#{tipTratId}")
	void updateTipoTratamiento(TipoTratamiento tipoTratamiento);
	
	
	@Delete("DELETE FROM tipo_tratamiento WHERE tip_trat_id=#{tipTratId}")
	int deleteTipoTratamiento(int tipTratId);
	
}
