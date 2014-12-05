package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.ListaPrecios;
import uy.com.cvaucher.services.domain.MaxIdListaPrecios;

public interface ListaPreciosMapper 
{
	
	@Select("SELECT * FROM lista_precios")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.ListaPreciosResult")
	List<ListaPrecios> findAllListaPrecios();
	
	@Select("SELECT MAX list_prec_id Maximo_Id FROM lista_precios")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.MaxIdListaPreciosResult")
	MaxIdListaPrecios findMaxIdListaPrecios();
	
	@Select("SELECT * FROM lista_precios WHERE list_prec_id = #{listPrecId}")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.ListaPreciosResult")
	ListaPrecios findListaPreciosById(Integer listPrecId);
	
	@Insert("INSERT INTO lista_precios "
			+ "(list_prec_id, list_prec_id_trat, list_prec_monto) "
			+ "VALUES "
			+ "(#{listPrecId}, #{listPrecTratId}, #{list_prec_monto})") 
	void insertListaPrecios(ListaPrecios listaPrecios);
	
	@Update("UPDATE lista_precios "
			+ "SET list_prec_id_trat = #{listPrecTratId}, list_prec_monto = #{listPrecMonto} "
			+ "WHERE list_prec_id = #{listaPrecios.listPrecId}")
	void updateListaPrecios(ListaPrecios listaPrecios);
	
	@Delete("DELETE FROM lista_precios WHERE list_prec_id = #{listPrecId}")
	void deleteListaPrecios(Integer listPrecId);
	

}
