package uy.com.cvaucher.services.domain;

import java.io.Serializable;

public class HistoriaClinica implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int			histCliId;
	
	private boolean 	diabetes;
	private boolean 	epilepsia;
	private boolean 	marcaPaso;
	private boolean 	diu;
	
	private String 		problemasCardiacos;
	private String 		medicacion;
	
	private int 		cantHijos;
	
	private String 		operaciones;
	
	private boolean 	hipertension;
	private boolean 	procesosOncologicos;
	private boolean 	tiroides;
	
	private String 		actividadFisica;
	private String 		cantConsumoAguaDiaria;
	private String 		alimentacion;
	
	private Pacientes 	pacientes;
	
	//-----------------------------------------------------------
	public int getHistCliId() {
		return histCliId;
	}
	public void setHistCliId(int histCliId) {
		this.histCliId = histCliId;
	}
	//-----------------------------------------------------------
	public boolean isDiabetes() {
		return diabetes;
	}
	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}
	//-----------------------------------------------------------
	public boolean isEpilepsia() {
		return epilepsia;
	}
	public void setEpilepsia(boolean epilepsia) {
		this.epilepsia = epilepsia;
	}
	//-----------------------------------------------------------
	public boolean isMarcaPaso() {
		return marcaPaso;
	}
	public void setMarcaPaso(boolean marcaPaso) {
		this.marcaPaso = marcaPaso;
	}
	//-----------------------------------------------------------
	public boolean isDiu() {
		return diu;
	}
	public void setDiu(boolean diu) {
		this.diu = diu;
	}
	//-----------------------------------------------------------
	public String getProblemasCardiacos() {
		return problemasCardiacos;
	}
	public void setProblemasCardiacos(String problemasCardiacos) {
		this.problemasCardiacos = problemasCardiacos;
	}
	//-----------------------------------------------------------
	public String getMedicacion() {
		return medicacion;
	}
	public void setMedicacion(String medicacion) {
		this.medicacion = medicacion;
	}
	//-----------------------------------------------------------
	public int getCantHijos() {
		return cantHijos;
	}
	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	//-----------------------------------------------------------
	public String getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}
	//-----------------------------------------------------------
	public boolean isHipertension() {
		return hipertension;
	}
	public void setHipertension(boolean hipertension) {
		this.hipertension = hipertension;
	}
	//-----------------------------------------------------------
	public boolean isProcesosOncologicos() {
		return procesosOncologicos;
	}
	public void setProcesosOncologicos(boolean procesosOncologicos) {
		this.procesosOncologicos = procesosOncologicos;
	}
	//-----------------------------------------------------------
	public boolean isTiroides() {
		return tiroides;
	}
	public void setTiroides(boolean tiroides) {
		this.tiroides = tiroides;
	}
	//-----------------------------------------------------------
	public String getActividadFisica() {
		return actividadFisica;
	}
	public void setActividadFisica(String actividadFisica) {
		this.actividadFisica = actividadFisica;
	}
	//-----------------------------------------------------------
	public String getCantConsumoAguaDiaria() {
		return cantConsumoAguaDiaria;
	}
	public void setCantConsumoAguaDiaria(String cantConsumoAguaDiaria) {
		this.cantConsumoAguaDiaria = cantConsumoAguaDiaria;
	}
	//-----------------------------------------------------------
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	//-----------------------------------------------------------
	public Pacientes getPacientes() {
		return pacientes;
	}
	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}
	
	

}
