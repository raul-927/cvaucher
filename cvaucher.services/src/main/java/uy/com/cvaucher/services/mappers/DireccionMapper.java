package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.Direccion;



public interface DireccionMapper 
{
	
	
	@Select("SELECT * FROM direccion")
	@ResultMap("uy.com.cvaucher.services.mappers.DireccionMapper.DireccionResult")
	List<Direccion> findAllDireccion();
	
	@Select("SELECT * FROM direccion WHERE pac_cedula = #{pacCedula}")
	@ResultMap("uy.com.cvaucher.services.mappers.DireccionMapper.DireccionResult")
	List<Direccion> findDireccionByCedula( int pacCedula);
	
	
	@Insert("INSERT INTO direccion " +
			"(tpo_Vivienda, calle, nro_Puerta, nro_Ap, calle_1, calle_2, pac_cedula) " +
			"VALUES " +
			"(#{tpoVivienda}, #{calle}, #{nroPuerta}, #{nroAp}, #{calle1}, #{calle2}, #{pacientes.cedula})")
	@Options(useGeneratedKeys=true, keyProperty="dirId") 
	void insertDireccion(Direccion direccion);
	
	
	@Update("UPDATE direccion " +
			"SET tpo_Vivienda = #{tpoVivienda}, calle =  #{calle}, nro_Puerta = #{nroPuerta}, nro_Ap = #{nroAp}, calle_1 = #{calle1}, calle_2 =  #{calle2}, " +
			"pac_cedula = #{pacientes.cedula} WHERE dir_id = #{dirId}")
	void updateDireccion(Direccion direccion);
	
	
	@Delete("DELETE FROM direccion WHERE dir_id = #{dirId}")
	void deleteDireccion(int dirId);
	
}
