package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.sql.SqlPagoTarjetaProvider;

public interface PagoTarjetaMapper {
	
	@InsertProvider(type= SqlPagoTarjetaProvider.class, method="insertPagoTarjeta")
	@Options(useGeneratedKeys=true, keyProperty="tarjId") 
	void insertPagoTarjeta(PagoTarjeta pagoTarjeta);
	
	@SelectProvider(type=SqlPagoTarjetaProvider.class,method="showPagoTarjetaByCaja")
	@ResultMap("uy.com.cvaucher.services.mappers.PagoTarjetaMapper.PagoTarjetaResult")
	List<PagoTarjeta> showPagoTarjetaByCaja(@Param("idCaja")int idCaja, @Param("cuenta")String cuenta);
}
