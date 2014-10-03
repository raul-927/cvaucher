package uy.com.cvaucher.services.mappers;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.TipoAgenda;


public interface TipoAgendaMapper 
{
	
	
	@Select("SELECT * FROM tipo_agenda")
	@ResultMap("uy.com.cvaucher.services.mappers.TipoAgendaMapper.TipoAgendaResult")
	List<TipoAgenda> findAllTipoAgenda();
	
	@Select("SELECT * FROM tipo_agenda WHERE tpo_ag_id = #{tpoAgId}")
	@ResultMap("uy.com.cvaucher.services.mappers.TipoAgendaMapper.TipoAgendaResult")
	TipoAgenda findTipoAgendaById(int tpoAgId);
	
	@Insert("INSERT INTO tipo_agenda (tpo_ag_text) VALUES (#{tpoAgText})")
	@Options(useGeneratedKeys=true, keyProperty="tpoAgId") 
	void insertTipoAgenda(TipoAgenda tipoAgenda);
	
	
	@Update("UPDATE tipo_agenda SET tpo_ag_text = #{tpoAgText} WHERE tpo_ag_id = #{tpoAgId}")
	void updateTipoAgenda(TipoAgenda tipoAgenda);
	
	@Delete("DELETE FROM tipo_agenda WHERE  tpo_ag_id = #{tpoAgId}")
	void deleteTipoAgenda(int tpoAgId);
	
	
	
	
}
