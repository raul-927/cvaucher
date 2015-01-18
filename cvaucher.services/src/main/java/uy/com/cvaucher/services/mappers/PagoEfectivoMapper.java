package uy.com.cvaucher.services.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import uy.com.cvaucher.services.domain.PagoEfectivo;

public interface PagoEfectivoMapper 
{
	@Insert("INSERT INTO pago_efectivo (pago_ef_id, pago_ef_cedula, pago_ef_importe, pago_ef_desc) "
			+ "VALUES (#{pagoEfId}, #{pagoEfCedula}, #{pagoEfImporte}, #{pagoEfDesc})")
	@Options(useGeneratedKeys=true, keyProperty="efId") 
	void insertPagoEfectivo(PagoEfectivo pagoEfectivo);

}
