package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.sql.SqlFormasDePagosProvider;
import uy.com.cvaucher.services.clases.FormasDePagosDesc;

public interface FormasDePagosMapper 
{
	//@Select("SELECT * FROM formas_de_pagos")
	@SelectProvider(type = SqlFormasDePagosProvider.class, method = "findAllFormasDePagos")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagosResult")
	List<FormasDePagos> findAllFormasDePagos(FormasDePagos formasDePagos);
	
	
	@SelectProvider(type = SqlFormasDePagosProvider.class, method = "findFormPagoTipoByDesc")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagoDescResult")
	FormasDePagosDesc findFormPagoTipoByDesc(String formPagAbreviacion);
	
	
	@InsertProvider(type = SqlFormasDePagosProvider.class, method = "insertFormasDePagos")
	@Options(useGeneratedKeys=true, keyProperty="formPagId")
	void insertFormasDePagos(FormasDePagos formasDePagos);
	
	@UpdateProvider(type = SqlFormasDePagosProvider.class, method = "updateFormasDePagos")
	void updateFormasDePagos(FormasDePagos formasDePagos);
	

}
