package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import uy.com.cvaucher.services.domain.Impuesto;
import uy.com.cvaucher.services.sql.SqlImpuestoProvider;

public interface ImpuestoMapper
{
	@SelectProvider(type = SqlImpuestoProvider.class,  method="findAllImpuestos")
	@ResultMap("uy.com.cvaucher.services.mappers.ImpuestoMapper.ImpuestoResult")
	List<Impuesto> findAllImpuestos();
	
	@SelectProvider(type = SqlImpuestoProvider.class,  method="findAllImpuestos")
	@ResultMap("uy.com.cvaucher.services.mappers.ImpuestoMapper.ImpuestoResult")
	Impuesto findImpuestoById(int impuestoId);
	
	@InsertProvider(type = SqlImpuestoProvider.class,  method="insertImpuesto")
	@Options(useGeneratedKeys=true, keyProperty="impuestoId") 
	void insertImpuesto(Impuesto impuesto);
	
	@SelectProvider(type = SqlImpuestoProvider.class,  method="findAllImpuestosByTipo")
	@ResultMap("uy.com.cvaucher.services.mappers.ImpuestoMapper.ImpuestoResult")
	List<Impuesto> findAllImpuestosByTipo(String impuestoTipo);
	
	
}
