package uy.com.cvaucher.services.select;

import org.apache.ibatis.jdbc.SQL;
public class SqlTratamientoProvider 
{
	
	public String finTratamientoById()
	{
		return new SQL(){{
		SELECT("tratr_id, trat_tpo_id, trat_descripcion, trat_cant_sesiones");
		 FROM("tratamiento");
		 WHERE("tratid = #{tratId}");
			
			}}.toString();
	}
	
	public String findAllTratamientos()
	{
		return new SQL(){{
		SELECT("t.trat_id, tt.tip_trat_descripcion, trat_descripcion, trat_cant_sesiones");
		FROM("tratamiento t, tipo_tratamiento tt");
		WHERE("t.trat_tpo_id = tt.tip_trat_id");
		ORDER_BY("trat_id");
		}}.toString();
	}
	
	public String findSesionesByTratamientoId(int tratId)
	{
		return new SQL(){{
		
		}}.toString();
		
	}
	
	public String findAllTratamientoByActualList()
	{
		return new SQL(){{
		SELECT("trat.trat_id ID, trat.trat_descripcion DESCRIPCION, trat.trat_cant_sesiones CANT_SESIONES, lis.list_prec_monto MONTO");
		FROM("tratamiento trat, lista_precios lis, aux_precios aux");
		WHERE("trat.trat_id = lis.list_prec_id_trat "
				+ "AND lis.list_prec_id = aux.aux_prec_id_list");
		}}.toString();
	}
}
