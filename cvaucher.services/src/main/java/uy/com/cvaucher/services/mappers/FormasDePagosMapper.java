package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.sql.SqlFormasDePagosProvider;
import uy.com.cvaucher.services.clases.DescCuentaFormaDePago;
import uy.com.cvaucher.services.clases.FormasDePagosDesc;

public interface FormasDePagosMapper 
{
	//@Select("SELECT * FROM formas_de_pagos")
	@SelectProvider(type = SqlFormasDePagosProvider.class, method = "findAllFormasDePagos")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagosResult")
	List<FormasDePagos> findAllFormasDePagos(FormasDePagos formasDePagos);
	
	//@Select("SELECT form_pag_abreviacion Abreviacion, form_pag_tipo Tipo, form_pag_cuenta Cuenta FROM formas_de_pagos WHERE form_pag_abreviacion = #{formPagAbreviacion}")
	@SelectProvider(type = SqlFormasDePagosProvider.class, method = "findFormPagoTipoByDesc")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagoDescResult")
	FormasDePagosDesc findFormPagoTipoByDesc(@Param("formPagAbreviacion") String formPagAbreviacion);
	
	/*@Select("SELECT cu.cuenta_desc "
	+ "FROM formas_de_pagos f, cuentas cu "
	+ "WHERE cu.cuenta_id = #{cuentaId} "
	+ "AND f.form_pag_cuenta = cu.cuenta_id LIMIT 1")*/
	@SelectProvider(type = SqlFormasDePagosProvider.class, method = "cuentaFormaDePagoDesc")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.DescCuentaFormaDePago")
	DescCuentaFormaDePago cuentaFormaDePagoDesc(@Param("cuentaId")int cuentaId);
	
	@InsertProvider(type = SqlFormasDePagosProvider.class, method = "insertFormasDePagos")
	@Options(useGeneratedKeys=true, keyProperty="formPagId")
	void insertFormasDePagos(FormasDePagos formasDePagos);
	
	@UpdateProvider(type = SqlFormasDePagosProvider.class, method = "updateFormasDePagos")
	void updateFormasDePagos(FormasDePagos formasDePagos);
	
}
