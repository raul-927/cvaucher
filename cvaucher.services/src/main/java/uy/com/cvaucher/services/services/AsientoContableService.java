package uy.com.cvaucher.services.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.clases.MaxNumAsientoContable;
import uy.com.cvaucher.services.clases.ResumenPorCuentas;
import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.AsientoContableArray;
import uy.com.cvaucher.services.domain.Cuentas;
import uy.com.cvaucher.services.domain.ResultadoCuentaAsientoTotal;
import uy.com.cvaucher.services.interfaces.AsientoContableInt;
import uy.com.cvaucher.services.mappers.AsientoContableMapper;

@Service
@Transactional
public class AsientoContableService implements AsientoContableInt {
	
	@Autowired
	private AsientoContableMapper asientoContableMapper;
	
	@Override
	public ResultadoCuentaAsientoTotal cuentaAsientoTotal() {
		// TODO Auto-generated method stub
		return this.asientoContableMapper.cuentaAsientoTotal();
	}

	@Override
	public List<ResultadoCuentaAsientoTotal> cuentasAsientoTotal() {
		// TODO Auto-generated method stub
		return this.asientoContableMapper.cuentasAsientoTotal();
	}

	@Override
	public void ingresarAsientoContable(AsientoContableArray asientoContableArray) {
		int size = asientoContableArray.getAsCuentaDebe().size();
		AsientoContable asientoContable = new AsientoContable();
		int index = 0;
		while( index < size){
			int asConNro = asientoContableArray.getAsConNro();
			Cuentas asCuentaDebe = asientoContableArray.getAsCuentaDebe().get(index);
			BigDecimal asCuentaDebeMonto = asientoContableArray.getAsCuentaDebeMonto().get(index);
			Cuentas asCuentaHaber = asientoContableArray.getAsCuentaHaber().get(index);
			BigDecimal asCuentaHaberMonto = asientoContableArray.getAsCuentaHaberMonto().get(index);
			String asConDescripcion = asientoContableArray.getAsConDescripcion().get(index);
			String asConFecha = asientoContableArray.getAsConFecha();
			String asConHora = asientoContableArray.getAsConHora();
			String asConUsr = asientoContableArray.getAsConUsr();
			asientoContable.setAsConNro(asConNro);
			asientoContable.setAsCuentaDebe(asCuentaDebe);
			asientoContable.setAsCuentaDebeMonto(asCuentaDebeMonto);
			asientoContable.setAsCuentaHaber(asCuentaHaber);
			asientoContable.setAsCuentaHaberMonto(asCuentaHaberMonto);
			asientoContable.setAsConDescripcion(asConDescripcion);
			asientoContable.setAsConFecha(asConFecha);
			asientoContable.setAsConHora(asConHora);
			asientoContable.setAsConUsr(asConUsr);
			this.asientoContableMapper.ingresarAsientoContable(asientoContable);
			index++;
		}
	}

	@Override
	public MaxNumAsientoContable maxNumAsientoContable() {
		MaxNumAsientoContable cantidadReg = this.cantRegistros();
		System.out.println("cantidadReg ==>> "+cantidadReg.getMaxNum());
		if(cantidadReg.getMaxNum() > 0){
			int maximo = this.asientoContableMapper.maxNumAsientoContable().getMaxNum();
			System.out.println("Return maximo ==>> "+maximo) ;
			return this.asientoContableMapper.maxNumAsientoContable();
		}
		else{
			cantidadReg.setMaxNum(1);
		}
		System.out.println("Return cantidadReg ==>> "+cantidadReg.getMaxNum());
		return cantidadReg;

	}

	@Override
	public MaxNumAsientoContable cantRegistros() {
		// TODO Auto-generated method stub
		MaxNumAsientoContable cantidadRegistros = this.asientoContableMapper.cantRegistros();
		System.out.println("cantidadRegistros ==>> "+cantidadRegistros.getMaxNum());
		return cantidadRegistros;
	}

	@Override
	public List<ResumenPorCuentas> resumenPorCuentas() {
		
		return this.asientoContableMapper.resumenPorCuentas();
	}

}
