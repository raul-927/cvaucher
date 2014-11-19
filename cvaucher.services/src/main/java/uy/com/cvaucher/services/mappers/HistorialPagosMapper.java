package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import uy.com.cvaucher.services.domain.HistorialPagos;

public interface HistorialPagosMapper 
{
	@Select("SELECT * FROM historial_pagos WHERE hist__pagos_trat_pac_id = #{histTratPacId}")
	List<HistorialPagos> findHistorialPagoByHistTratPacId(int histTratPacId);
	
	@Insert("INSERT INTO historial_pagos(hist__pagos_trat_pac_id, hist_pagos_fecha_pago, hist_pagos_monto)"+
			" VALUES ((SELECT trat_pac_id" + 
						" FROM tratamiento_paciente" +
						" WHERE	pac_cedula = #{cedula}" +
						" AND	fecha = #{fecha}), {fechaHistorialPago}, {importe}))")
	void insertHistorialPago(HistorialPagos historialPagos);

}
