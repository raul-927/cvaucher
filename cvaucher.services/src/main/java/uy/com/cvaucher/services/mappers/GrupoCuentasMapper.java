package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import uy.com.cvaucher.services.domain.GrupoCuentas;
import uy.com.cvaucher.services.sql.SqlGrupoCuentasProvider;

public interface GrupoCuentasMapper {
	
	
	@InsertProvider(type = SqlGrupoCuentasProvider.class, method ="insertGrupoCuentas")
	@Options(useGeneratedKeys=true, keyProperty="grupoCuentaId") 
	void insertGrupoCuentas(GrupoCuentas grupoCuentas);
	
	@SelectProvider(type = SqlGrupoCuentasProvider.class, method ="showAllGrupoCuentas")
	@ResultMap("uy.com.cvaucher.services.mappers.GrupoCuentasMapper.GrupoCuentasResult")
	List<GrupoCuentas> showAllGrupoCuentas();
}
