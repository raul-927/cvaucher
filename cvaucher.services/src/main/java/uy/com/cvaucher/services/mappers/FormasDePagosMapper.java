package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.FormasDePagos;
import uy.com.cvaucher.services.clases.FormasDePagosDesc;

public interface FormasDePagosMapper 
{
	@Select("SELECT form_pag_id, form_pag_abreviacion, form_pag_desc, form_pag_tipo FROM formas_de_pagos")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagosResult")
	List<FormasDePagos> findAllFormasDePagos();
	
	@Select("SELECT form_pag_abreviacion Abreviacion, form_pag_tipo Tipo FROM formas_de_pagos "
			+ "WHERE form_pag_abreviacion = #{formPagoDesc}")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagoDescResult")
	FormasDePagosDesc findFormPagoTipoByDesc(String formPagoDesc);
	
	@Select("SELECT * FROM formas_de_pagos WHERE formPagId=#{formPagId}")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagosResult")
	FormasDePagos findFormasDePagosById(Integer formPagId);
	
	@Insert("INSERT INTO formas_de_pagos (form_pag_abreviacion, form_pag_desc, form_pag_tipo)VALUES(#{formPagAbreviacion}, #{formPagDesc}, #{formPagTipo})")
	@Options(useGeneratedKeys=true, keyProperty="formPagId")
	void insertFormasDePagos(FormasDePagos formasDePagos);
	
	
	@Update("UPDATE formas_de_pagos set form_pag_desc = #{formPagDesc} WHERE  form_pag_id=#{formPagId}")
	void updateFormasDePagos(FormasDePagos formasDePagos);
	

}