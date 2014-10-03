package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.SesionPagada;

public interface SesionPagadaInt 
{
	
	List<SesionPagada> findAllSesionPagada();
	SesionPagada findSesionById(int sesPagoId);
	void insertSesionPagada(SesionPagada sesionPagada);
	void updateSesionPagada(SesionPagada sesionPagada);
	void deleteSesionPagada(int sesPagoId);
	

}
