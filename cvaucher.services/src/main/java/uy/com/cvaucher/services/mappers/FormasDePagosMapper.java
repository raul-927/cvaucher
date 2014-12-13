package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.FormasDePagos;

public interface FormasDePagosMapper 
{
	@Select("SELECT * FROM formas_de_pagos")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagosResult")
	List<FormasDePagos> findAllFormasDePagos();
	
	
	@Select("SELECT * FROM formas_de_pagos WHERE formPagId=#{formPagId}")
	@ResultMap("uy.com.cvaucher.services.mappers.FormasDePagosMapper.FormasDePagosResult")
	FormasDePagos findFormasDePagosById(Integer formPagId);
	
	@Insert("INSERT INTO formas_de_pagos (form_pag_desc)VALUES(#{formPagDesc})")
	@Options(useGeneratedKeys=true, keyProperty="formPagId")
	void insertFormasDePagos(FormasDePagos formasDePagos);
	
	
	@Update("UPDATE formas_de_pagos set form_pag_desc = #{formPagDesc} WHERE  form_pag_id=#{formPagId}")
	void updateFormasDePagos(FormasDePagos formasDePagos);
	

}
