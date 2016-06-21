package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.SesionPagada;



public interface SesionPagadaMapper 
{
	
	
	//@Select("SELECT * FROM sesion_pagada")
	//@ResultMap("uy.com.cvaucher.services.mappers.SesionPagadaMapper")
	List<SesionPagada> findAllSesionPagada();
	
	//@Select("SELECT * FROM sesion_pagada WHERE ses_pago_id = #{sesPagoId}")
	//@ResultMap("uy.com.cvaucher.services.mappers.SesionPagadaMapper")
	SesionPagada findSesionById(int sesPagoId);
	
	//@Insert("INSERT INTO sesion_pagada" +
	//		"(ses_pago_id, ses_id, ses_monto_pagado, ses_fecha)" +
	//		"VALUES" +
	//		"(#{sesPagoId}, #{sesiones.sesId}, #{sesMontoPago}, #{sesFecha}")
	void insertSesionPagada(SesionPagada sesionPagada);
	
	//@Update("UPDATE sesion_pagada " +
	//		"SET ses_id = #{sesiones.sesId}, " +
	//		"ses_monto_pagado = #{sesMontoPago}, " +
	//		"ses_fecha = sesFecha" +
	//		"WHERE ses_pago_id = #{sesPagoId}")
	void updateSesionPagada(SesionPagada sesionPagada);
	
	//@Delete("DELETE FROM sesion_pagada WHERE ses_pago_id = #{sesPagoId}")
	void deleteSesionPagada(int sesPagoId);

}

