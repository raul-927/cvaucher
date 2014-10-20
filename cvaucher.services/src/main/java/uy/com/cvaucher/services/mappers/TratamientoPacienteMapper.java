package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import uy.com.cvaucher.services.domain.TratPacByCedula;
import uy.com.cvaucher.services.domain.TratamientoPaciente;

public interface TratamientoPacienteMapper 
{
	
	
	@Select("SELECT tp.fecha Fecha, "
			+ "t.trat_descripcion Tratamiento, "
			+ "tp.cant_sesiones Sesiones, "
			+ "tp.costo_tratamiento Monto, "
			+ "tp.importe_pagado Pagado, "
			+ "tp.saldo_pendiente Saldo"
			+ " FROM tratamiento_paciente tp, tratamiento t "
			+ "WHERE tp.pac_cedula = #{cedula} "
			+ "AND	tp.trat_id = t.trat_id")
	@ResultMap("uy.com.cvaucher.services.mappers.TratamientoPacienteMapper.TratamientoPacienteByCedulaResult")
	List<TratPacByCedula> findTratamientoPacienteByCedula(int cedula);
	
	@Select("SELECT * FROM tratamiento_paciente tp, tratamiento t"
			+ "WHERE tp.trat_id = t.trat_id	")
	@ResultMap("uy.com.cvaucher.services.mappers.TratamientoPacienteMapper.TratamientoPacienteResult")
	List<TratamientoPaciente> findAllTratamientoPaciente();
	
	@Insert("INSERT INTO tratamiento_paciente (fecha, pac_cedula, trat_id, "
			+ "costo_tratamiento, importe_pagado, saldo_pendiente, cant_sesiones) "
			+ "VALUES (#{fecha}, #{pacientes.cedula}, #{tratamiento}, "
			+ "#{costoTratSesion}, #{importePagado}, #{saldoPendiente}, #{cantSesiones})")
	@Options(useGeneratedKeys=true, keyProperty="tratPacId")
	void insertTratamientoPacienteMapper(TratamientoPaciente tratamientoPaciente);
	
	@Delete("DELETE FROM tratamiento_paciente WHERE trat_pac_id = #{tratPacId}")
	void deleteTratamientoPacienteMapper(int tratPacId);
	
	
	
}
