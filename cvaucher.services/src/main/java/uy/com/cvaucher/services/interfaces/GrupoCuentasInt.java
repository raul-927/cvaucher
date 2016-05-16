package uy.com.cvaucher.services.interfaces;

import java.util.List;

import uy.com.cvaucher.services.domain.GrupoCuentas;

public interface GrupoCuentasInt {
	
	void insertGrupoCuentas(GrupoCuentas grupoCuentas);
	List<GrupoCuentas> showAllGrupoCuentas();
}
