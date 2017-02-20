package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import uy.com.cvaucher.services.domain.JornadaLaboral;
import uy.com.cvaucher.services.sql.SqlJornadaLaboralProvider;

public interface JornadaLaboralMapper {
	
	@InsertProvider(type= SqlJornadaLaboralProvider.class, method ="insertarJornadaLaboral")
	@Options(useGeneratedKeys=true, keyProperty="jorLabId") 
	void insertJornadaLaboral(JornadaLaboral jornadaLaboral);
	
	@SelectProvider(type= SqlJornadaLaboralProvider.class, method ="selectJornadaLaboral")
	@ResultMap("")
	List<JornadaLaboral> showJornadaLaboral(JornadaLaboral jornadaLaboral);
}
