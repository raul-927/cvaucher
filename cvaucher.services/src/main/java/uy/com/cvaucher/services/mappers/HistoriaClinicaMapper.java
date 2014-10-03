package uy.com.cvaucher.services.mappers;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.HistoriaClinica;


public interface HistoriaClinicaMapper 
{
	
	@Select("SELECT * FROM historia_clinica")
	@ResultMap("uy.com.cvaucher.services.mappers.HistoriaClinicaMapper.HistoriaClinicaResult")
	List<HistoriaClinica> findAllHistoriaClinica();
	
	
	@Select("SELECT * FROM historia_clinica WHERE pac_cedula = #{cedula}")
	@ResultMap("uy.com.cvaucher.services.mappers.HistoriaClinicaMapper.HistoriaClinicaResult")
	HistoriaClinica findHistoriaClinicaByCedula(int cedula);
	
	@Insert("INSERT INTO historia_clinica" +
			"(pac_cedula, diabetes, epilepsia, marcaPaso, diu, problemas_cardiacos, medicacion, cant_hijos, operaciones, " +
			"hipertension, procesos_oncologicos, tiroides, " +
			"actividad_fisica, agua_diaria, alimentacion)" +
			"VALUES" +
			"(#{pacientes.cedula},#{diabetes}, #{epilepsia}, #{marcaPaso}, #{diu}, #{problemasCardiacos}, #{medicacion}, #{cantHijos}, " +
			"#{operaciones}, #{hipertension}, #{procesosOncologicos}, #{tiroides}, #{actividadFisica}, #{cantConsumoAguaDiaria}, " +
			"#{alimentacion})")
	void insertHistoriaClinica(HistoriaClinica historiaClinica);
	
	
	@Update("UPDATE historia_clinica" +
			"SET diabetes = #{diabetes}, epilepsia = #{epilepsia}, marcaPaso = #{marcaPaso}, diu = #{diu}, problemas_cardiacos = #{problemasCardiacos}" +
			"medicacion = #{medicacion}, cant_hijos = #{cantHijos}, operaciones = #{operaciones}, hipertension = #{hipertension}, " +
			"procesos_oncologicos = #{procesosOncologicos}, tiroides = #{tiroides}, actividad_fisica = #{actividadFisica}, agua_diaria = #{cantConsumoAguaDiaria}, " +
			"alimentacion = #{alimentacion}, pacientes = #{pacientes.pacId}" +
			"WHERE hist_id = #{histCliId}")
	void updateHistoriaClinica(HistoriaClinica historiaClinica);
	
	
	@Delete("DELETE FROM historia_clinica WHERE pac_id = #{pacCliId}")
	void deleteHistoriaClinica(int pacCliId);
}
