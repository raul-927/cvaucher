package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.HistoriaClinica;

public interface HistoriaClinicaInt {
	
	List<HistoriaClinica> findAllHistoriaClinica();
	HistoriaClinica findHistoriaClinicaByCedula(int cedula);
	
	void insertHistoriaClinica(HistoriaClinica historiaClinica);
	void updateHistoriaClinica(HistoriaClinica historiaClinica);
	void deleteHistoriaClinica(int histCliId);

}
