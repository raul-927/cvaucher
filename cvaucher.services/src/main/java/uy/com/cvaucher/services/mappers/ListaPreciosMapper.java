package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.ListaPrecios;

public interface ListaPreciosMapper 
{
	
	@Select("SELECT * FROM lista_precios")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.ListaPreciosResult")
	List<ListaPrecios> findAllListaPrecios();
	
	@Select("SELECT * FROM lista_precios WHERE list_prec_id = #{listPrecId}")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.ListaPreciosResult")
	ListaPrecios findListaPreciosById(int listPrecId);
	
	@Insert("INSERT INTO lista_precios "
			+ "(list_prec_id_trat, list_prec_monto, list_prec_descripcion) "
			+ "VALUES "
			+ "(#{tratamiento.tratId}, #{listPrecMonto}, #{listPrecDescripcion}")
	@Options(useGeneratedKeys=true, keyProperty="listPrecId") 
	void insertListaPrecios(ListaPrecios listaPrecios);
	
	@Update("UPDATE lista_precios "
			+ "SET list_prec_id_trat = #{tratamiento.tratId}, list_prec_monto = #{listPrecMonto}, list_prec_descripcion = #{listPrecDescripcion} "
			+ "WHERE list_prec_id = #{listaPrecios.listPrecId}")
	void updateListaPrecios(ListaPrecios listaPrecios);
	
	@Delete("DELETE FROM lista_precios WHERE list_prec_id = #{listPrecId}")
	void deleteListaPrecios(int listPrecId);
	

}
