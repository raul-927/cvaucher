package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.Direccion;

public interface DireccionInt 
{
	
	List<Direccion> findAllDireccion();
	List<Direccion> findDireccionById(int dirId);
	void insertDireccion(Direccion direccion);
	void updateDireccion(Direccion direccion);
	void deleteDireccion(int dirId);
	List<Direccion> findDireccionByCedula(int pacCedula);

}
