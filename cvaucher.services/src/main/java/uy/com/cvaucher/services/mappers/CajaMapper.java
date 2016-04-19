package uy.com.cvaucher.services.mappers;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import uy.com.cvaucher.services.domain.Caja;
import uy.com.cvaucher.services.sql.SqlCajasProvider;

public interface CajaMapper {
	
	@SelectProvider(type =SqlCajasProvider.class, method = "aperturaCaja")
	@ResultMap("uy.com.cvaucher.services.mappers.CajaMapper.CajaResult")
	void aperturaCaja();
	
	@InsertProvider(type =SqlCajasProvider.class, method ="insertCaja")
	@Options(useGeneratedKeys=true, keyProperty="cajaId")
	void insertarCaja(Caja caja);
	
	@UpdateProvider(type = SqlCajasProvider.class, method ="cerrarCaja")
	void cerrarCaja(Caja caja);
	
	

}
