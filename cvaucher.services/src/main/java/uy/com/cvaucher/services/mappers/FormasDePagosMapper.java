package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.clases.FormasDePagosDesc;

public interface FormasDePagosMapper 
{
	@Select("SELECT f.form_pag_id, f.form_pag_abreviacion, f.form_pag_desc, f.form_pag_tipo, c.cuenta_desc FROM formas_de_pagos f, cuentas c "
			+ "WHERE f.form_pag_cuenta_id = c.cuenta_id")
	
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagosResult")
	List<FormasDePagos> findAllFormasDePagos();
	
	@Select("SELECT form_pag_abreviacion Abreviacion, form_pag_tipo Tipo FROM formas_de_pagos "
			+ "WHERE form_pag_abreviacion = #{formPagoDesc}")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagoDescResult")
	FormasDePagosDesc findFormPagoTipoByDesc(String formPagoDesc);
	
	@Select("SELECT * FROM formas_de_pagos WHERE formPagId=#{formPagId}")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagosResult")
	FormasDePagos findFormasDePagosById(Integer formPagId);
	
	@Insert("INSERT INTO formas_de_pagos (form_pag_abreviacion, form_pag_desc, form_pag_tipo, form_pag_cuenta_id)VALUES(#{formPagAbreviacion}, #{formPagDesc}, #{formPagTipo}, #{cuentas.cuentaId})")
	@Options(useGeneratedKeys=true, keyProperty="formPagId")
	void insertFormasDePagos(FormasDePagos formasDePagos);
	
	
	@Update("UPDATE formas_de_pagos set form_pag_desc = #{formPagDesc} WHERE  form_pag_id=#{formPagId}")
	void updateFormasDePagos(FormasDePagos formasDePagos);
	

}
