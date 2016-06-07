package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.Impuesto;

public interface ImpuestoInt{
	List<Impuesto> findAllImpuestos();
	Impuesto findImpuestoById(int impuestoId);
	void insertImpuesto(Impuesto impuesto);
}
