package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import uy.com.cvaucher.services.domain.ResultadoCuentaAsientoTotal;
import uy.com.cvaucher.services.sql.SqlAsientoContableProvider;

public interface AsientoContableMapper {
	
	
	@SelectProvider(type = SqlAsientoContableProvider.class,  method="cuentaAsientoTotal")
	@ResultMap("uy.com.cvaucher.services.mappers.AsientoContableMapper.CuentaAsientoResult")
	ResultadoCuentaAsientoTotal cuentaAsientoTotal();
	
	@SelectProvider(type = SqlAsientoContableProvider.class,  method="cuentaAsientoTotal")
	@ResultMap("uy.com.cvaucher.services.mappers.AsientoContableMapper.CuentaAsientoResult")
	List<ResultadoCuentaAsientoTotal> cuentasAsientoTotal();
	
	@InsertProvider(type =SqlAsientoContableProvider.class, method ="ingresarAsientoContable")
	@Options(useGeneratedKeys=true, keyProperty="asContId")
	void ingresarAsientoContable();
	
	

}
