package uy.com.cvaucher.services.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import uy.com.cvaucher.services.domain.PagoTarjeta;

public interface PagoTarjetaMapper 
{
	@Insert("INSERT INTO pago_tarjetas "
			+ "(tarj_pac_cedula, tarj_pago_id, tarj_nro, tarj_desc, tarj_vence, tarj_importe, tarj_cuotas) "
			+ "VALUES (#{tarjPacCedula}, #{tarjPagoId}, #{tarjNro}, #{tarjDesc}, #{tarjVence}, #{tarjImporte}, #{cantCuotas})")
	@Options(useGeneratedKeys=true, keyProperty="tarjId") 
	void insertPagoTarjeta(PagoTarjeta pagoTarjeta);

}
