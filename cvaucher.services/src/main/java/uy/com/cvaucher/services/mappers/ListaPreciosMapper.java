package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.ListPrecTratDesc;
import uy.com.cvaucher.services.domain.ListaPrecios;
import uy.com.cvaucher.services.domain.MaxIdListaPrecios;

public interface ListaPreciosMapper 
{
	
	@Select("SELECT * FROM lista_precios")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.ListaPreciosResult")
	List<ListaPrecios> findAllListaPrecios();
	
	@Select("SELECT MAX(list_prec_id) Maximo_id  FROM lista_precios")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.MaxIdListaPreciosResult")
	MaxIdListaPrecios findMaxIdListaPrecios();
	
	@Select("SELECT * FROM lista_precios WHERE list_prec_id = #{listPrecId}")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.ListaPreciosResult")
	List<ListaPrecios> findListaPreciosById(Integer listPrecId);
	
	@Select("SELECT l.list_prec_id , l.list_prec_id_trat, t.trat_descripcion list_prec_desc, l.list_prec_monto "
			+ "FROM lista_precios l, tratamiento t "
			+ "WHERE l.list_prec_id_trat = t.trat_id "
			+ "AND l.list_prec_id = #{listPrecId}")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.ListaPreciosTratDescResult")
	List<ListPrecTratDesc> findListaPreciosTratDescById(int listPrecId);
	
	@Insert("INSERT INTO lista_precios "
			+ "(list_prec_id, list_prec_id_trat, list_prec_monto) "
			+ "VALUES "
			+ "(#{listPrecId}, #{listPrecTratId}, #{listPrecMonto})") 
	void insertListaPrecios(ListaPrecios listaPrecios);
	
	@Update("UPDATE lista_precios "
			+ "SET list_prec_id_trat = #{listPrecTratId}, list_prec_monto = #{listPrecMonto} "
			+ "WHERE list_prec_id = #{listaPrecios.listPrecId}")
	void updateListaPrecios(ListaPrecios listaPrecios);
	
	@Delete("DELETE FROM lista_precios WHERE list_prec_id = #{listPrecId}")
	void deleteListaPrecios(Integer listPrecId);
	
	@Select("SELECT l.list_prec_id ID_LISTA, l.list_prec_id_trat ID_LISTA_TRAT, l.list_prec_monto PRECIO_MONTO, "
			+ "a.aux_prec_id ID_AUX, a.aux_prec_id_list ID_AUX_LIST, a.aux_prec_fech_ini FECH_INI, a.aux_prec_fech_fin FECHA_FIN, a.aux_prec_descripcion DESC "
			+ "FROM lista_precios l, aux_precios a "
			+ "WHERE l.list_prec_id = a.aux_prec_id_list "
			+ "AND  current_date() BETWEEN a.aux_prec_fech_ini AND a.aux_prec_fech_fin ")
	@ResultMap("uy.com.cvaucher.services.mappers.ListaPreciosMapper.ActualListaPreciosResult")
	ListaPrecios findActualListaPrecios();

}
