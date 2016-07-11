package uy.com.cvaucher.services.mappers;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;

import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.sql.SqlPagoTarjetaProvider;

public interface PagoTarjetaMapper {
	
	@InsertProvider(type= SqlPagoTarjetaProvider.class, method="insertPagoTarjeta")
	@Options(useGeneratedKeys=true, keyProperty="tarjId") 
	void insertPagoTarjeta(PagoTarjeta pagoTarjeta);
}
