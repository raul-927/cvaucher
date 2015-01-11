package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import uy.com.cvaucher.services.domain.HistorialPagos;

public interface HistorialPagosMapper 
{
	@Select("SELECT * FROM historial_pagos WHERE hist_pagos_trat_pac_id = #{histTratPacId}")
	@ResultMap("uy.com.cvaucher.services.mappers.HistorialPagosMapper.HistorialPagosResult")
	List<HistorialPagos> findHistorialPagoByHistTratPacId(int histTratPacId);
	
	
	@Insert("INSERT INTO historial_pagos(hist_pagos_trat_pac_id, hist_pagos_fecha_pago, hist_pagos_monto, hist_tipo_pago) "+
			" VALUES (#{histTratPacId}, #{histPagosFechaPago}, #{histPagosMonto}, #{histPagosTipo})")
	@Options(useGeneratedKeys=true, keyProperty="histPagosId")
	void insertHistorialPago(HistorialPagos historialPagos);

}
