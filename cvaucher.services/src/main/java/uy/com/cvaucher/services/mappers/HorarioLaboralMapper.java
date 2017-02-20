package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import uy.com.cvaucher.services.domain.HorarioLaboral;
import uy.com.cvaucher.services.sql.SqlHorarioLaboralProvider;

public interface HorarioLaboralMapper {
	
	@InsertProvider(type= SqlHorarioLaboralProvider.class, method ="insertarHorarioLaboral")
	@Options(useGeneratedKeys=true, keyProperty="horLabId") 
	void insertJornadaLaboral(HorarioLaboral horarioLaboral);
	
	@SelectProvider(type= SqlHorarioLaboralProvider.class, method ="selectHorarioLaboral")
	@ResultMap("uy.com.cvaucher.services.mappers.HorarioLaboralMapper.HorarioLaboralResult")
	List<HorarioLaboral> showHorarioLaboral(HorarioLaboral horarioLaboral);
	
	@SelectProvider(type= SqlHorarioLaboralProvider.class, method ="selectAllHorarioLaboral")
	@ResultMap("uy.com.cvaucher.services.mappers.HorarioLaboralMapper.HorarioLaboralResult")
	List<HorarioLaboral> showAllHorarioLaboral();
}
