package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import uy.com.cvaucher.services.domain.PagoEfectivo;
import uy.com.cvaucher.services.sql.SqlPagoEfectivoProvider;

public interface PagoEfectivoMapper 
{
	@InsertProvider(type = SqlPagoEfectivoProvider.class, method ="insertPagoEfectivo")
	@Options(useGeneratedKeys=true, keyProperty="efId") 
	void insertPagoEfectivo(PagoEfectivo pagoEfectivo);
	
	@SelectProvider(type =SqlPagoEfectivoProvider.class, method ="showPagoEfectivoByCaja")
	@ResultMap("uy.com.cvaucher.services.mappers.PagoEfectivoMapper.PagoEfectivoResult")
	List<PagoEfectivo> showPagoEfectivoByCaja(int idCaja);
}
