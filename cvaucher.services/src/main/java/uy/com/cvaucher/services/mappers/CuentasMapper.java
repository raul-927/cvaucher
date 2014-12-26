package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import uy.com.cvaucher.services.domain.Cuentas;

public interface CuentasMapper {
	
	
	@Insert("INSERT INTO cuentas "
			+ "(cuenta_form_pago_desc, cuenta_monto, cuenta_tipo_movimiento) "
			+ "VALUES "
			+ "(#{cuentaFormPagoDesc}, #{cuentaMonto}, #{cuentaTipoMovimiento})")
	@Options(useGeneratedKeys=true, keyProperty="cuentaId") 
	void insertarCuentas(Cuentas cuentas);
	
	@Select("SELECT cuenta_id, cuenta_form_pago_desc, cuenta_monto, cuenta_tipo_movimiento "
			+ "FROM cuentas "
			+ "WHERE cuenta_id = #{cuentaId}")
	@ResultMap("uy.com.cvaucher.services.mappers.CuentasMapper.CuentasResult")
	Cuentas showCuentaById(int cuentaId);
	
	@Select("SELECT cuenta_id, cuenta_form_pago_desc, cuenta_monto, cuenta_tipo_movimiento "
			+ "FROM cuentas")
	@ResultMap("uy.com.cvaucher.services.mappers.CuentasMapper.CuentasResult")
	List<Cuentas> showAllCuentas();
	
	@Select("SELECT cuenta_id, cuenta_form_pago_desc, cuenta_monto, cuenta_tipo_movimiento "
			+ "FROM cuentas"
			+ "WHERE cuenta_form_pago_desc = #{cuentaFormPagoDesc} "
			+ "AND cuenta_tipo_movimiento = #{cuentaTipoMovimiento}")
	@ResultMap("uy.com.cvaucher.services.mappers.CuentasMapper.CuentasResult")
	List<Cuentas> showCuentasByDescMov(String cuentaFormPagoDesc, String cuentaTipoMovimiento);
	
	@Select("SELECT cuenta_id, cuenta_form_pago_desc, cuenta_monto, cuenta_tipo_movimiento "
			+ "FROM cuentas"
			+ "WHERE cuenta_form_pago_desc = #{cuentaFormPagoDesc}")
	@ResultMap("uy.com.cvaucher.services.mappers.CuentasMapper.CuentasResult")
	List<Cuentas> showCuentasByDesc(String cuentaFormPagoDesc);
	
	
	

}
