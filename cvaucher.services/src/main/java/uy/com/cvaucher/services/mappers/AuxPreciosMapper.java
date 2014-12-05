package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.AuxPrecios;


public interface AuxPreciosMapper 
{
	
	@Select("SELECT * FROM aux_precios")
	@ResultMap("uy.com.cvaucher.services.mappers.AuxPreciosMapper.AuxPreciosResult")
	List<AuxPrecios> findAllAuxPrecios();
	
	@Select("SELECT * FROM aux_precios WHERE aux_prec_id = #{auxPrecId}")
	@ResultMap("uy.com.cvaucher.services.mappers.AuxPreciosMapper.AuxPreciosResult")
	AuxPrecios findAuxPreciosById(int auxPrecId);
	
	@Insert("INSERT INTO aux_precios "
			+ "(aux_prec_id_list, aux_prec_fech_ini, aux_prec_fech_fin, aux_prec_descripcion) "
			+ "VALUES "
			+ "(#{listaPrecios.listPrecId}, #{auxPrecFechIni}, #{auxPrecFechFin}, #{auxPrecDescripcion}")
	@Options(useGeneratedKeys=true, keyProperty="auxPrecId") 
	void insertAuxPrecios(AuxPrecios auxPrecios);
	
	
	@Update("")
	void updateAuxPrecios(AuxPrecios auxPrecios);
	
	@Delete("DELETE FROM aux_precios WHERE aux_prec_id = #{auxPrecId}")
	void deleteAuxPrecios(int auxPrecId);
	

}
