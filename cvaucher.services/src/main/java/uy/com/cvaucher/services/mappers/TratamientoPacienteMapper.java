package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.clases.SearchMaxTratPacId;
import uy.com.cvaucher.services.domain.MaxTratPacId;
import uy.com.cvaucher.services.domain.TratPacByCedula;
import uy.com.cvaucher.services.domain.TratamientoPaciente;

public interface TratamientoPacienteMapper 
{
	
	
	@Select("SELECT tp.trat_pac_id Id, tp.pac_cedula Cedula, tp.fecha Fecha, "
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
	
	@Update("CREATE TEMPORARY TABLE trat AS SELECT MAX(trat_pac_id)IdMax FROM tratamiento_paciente; "
			+ "UPDATE tratamiento_paciente "+
			"SET importe_pagado = importe_pagado + #{importePagado}, "+
			"saldo_pendiente = costo_tratamiento - importe_pagado "+
			"WHERE	trat_pac_id = (SELECT IdMax FROM trat); "
			+ "DROP TABLE trat;")
	void updateTratamientoPacienteImporteByMaxId(TratamientoPaciente tratamientoPaciente);
	
	@Select("SELECT * FROM tratamiento_paciente ")
	@ResultMap("uy.com.cvaucher.services.mappers.TratamientoPacienteMapper.TratamientoPacienteResult")
	List<TratamientoPaciente> findAllTratamientoPaciente();
	
	@Insert("INSERT INTO tratamiento_paciente (fecha, pac_cedula, trat_id, "
			+ "costo_tratamiento, importe_pagado, saldo_pendiente, cant_sesiones) "
			+ "VALUES (#{fecha}, #{pacientes.cedula}, #{tratamId}, "
			+ "#{costoTratSesion}, #{importePagado}, #{saldoPendiente}, #{cantSesiones})")
	@Options(useGeneratedKeys=true, keyProperty="tratPacId")
	void insertTratamientoPacienteMapper(TratamientoPaciente tratamientoPaciente);
	
	@Delete("DELETE FROM tratamiento_paciente WHERE trat_pac_id = #{tratPacId}")
	void deleteTratamientoPacienteMapper(int tratPacId);
	
	@Update("UPDATE tratamiento_paciente "+
			"SET importe_pagado = importe_pagado + #{importePagado}, "+
			"saldo_pendiente = costo_tratamiento - importe_pagado "+
			"WHERE	trat_pac_id = #{tratPacId};")
	void updateTratamientoPacienteImporte(TratamientoPaciente tratamientoPaciente);
	
	@Select("SELECT MAX(trat_pac_id) FROM tratamiento_paciente WHERE pac_cedula = #{cedula} "
			+ "AND trat_id = #{tratId} "
			+ "AND fecha = #{fecha}")
	@ResultMap("uy.com.cvaucher.services.mappers.TratamientoPacienteMapper.MaxTratPacIdResutl")
	MaxTratPacId findMaxTratPacId(SearchMaxTratPacId searchMaxTratPacId);
}
