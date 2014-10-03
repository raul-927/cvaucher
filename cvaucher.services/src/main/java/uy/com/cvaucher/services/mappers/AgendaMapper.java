package uy.com.cvaucher.services.mappers;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.Agenda;



public interface AgendaMapper
{
	@Select("SELECT * FROM agenda")
	@ResultMap("uy.com.cvaucher.services.mappers.AgendaMapper.AgendaResult")
	List<Agenda> findAllAgenda();
	
	
	
	@Select("SELECT * FROM agenda WHERE pac_cedula = #{pacCedula}")
	@ResultMap("uy.com.cvaucher.services.mappers.AgendaMapper.AgendaResult")
	List<Agenda> findAgendaById(int pacCedula);
	
	@Select("SELECT * FROM agenda WHERE pac_cedula = #{pacCedula}")
	@ResultMap("uy.com.cvaucher.services.mappers.AgendaMapper.AgendaResult")
	List<Agenda> findAgendaByCedula(int cedula);
	
	
	@Insert("INSERT INTO agenda(ag_tipo, ag_dato, pac_cedula)VALUES(#{tipoAgenda}, #{dato}, #{pacientes.cedula})")
	void insertAgenda(Agenda agenda);
	
	
	@Update("UPDATE agenda SET ag_tipo = #{tipoAgenda}, ag_dato = #{dato}, pac_cedula = #{pacientes.cedula} WHERE ag_pac_Id = #{agPacId}")
	void updateAgenda(Agenda agenda);
	
	
	@Delete("DELETE FROM agenda WHERE ag_pac_Id = #{agPacId}")
	void deleteAgenda(int agPacId);
}
