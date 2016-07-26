package uy.com.cvaucher.services.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.clases.DescCuentaFormaDePago;
import uy.com.cvaucher.services.clases.FormasDePagosDesc;
import uy.com.cvaucher.services.clases.MaxNumAsientoContable;
import uy.com.cvaucher.services.clases.ResumenPorCuentas;
import uy.com.cvaucher.services.domain.AsientoContable;
import uy.com.cvaucher.services.domain.Caja;
import uy.com.cvaucher.services.domain.Cuentas;
import uy.com.cvaucher.services.domain.PagoEfectivo;
import uy.com.cvaucher.services.domain.PagoTarjeta;
import uy.com.cvaucher.services.domain.ResultadoCuentaAsientoTotal;
import uy.com.cvaucher.services.domain.Tratamiento;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.enumerador.CuentaTipo;
import uy.com.cvaucher.services.interfaces.AsientoContableInt;
import uy.com.cvaucher.services.mappers.AsientoContableMapper;
import uy.com.cvaucher.services.mappers.CajaMapper;
import uy.com.cvaucher.services.mappers.CuentasMapper;
import uy.com.cvaucher.services.mappers.FormasDePagosMapper;
import uy.com.cvaucher.services.mappers.TratamientoMapper;

@Service
@Transactional
public class AsientoContableService implements AsientoContableInt {
	
	@Autowired
	private AsientoContableMapper asientoContableMapper;
	
	@Autowired
	private CajaMapper cajaMapper;
	
	@Autowired
	private FormasDePagosService formasDePagosService;
	
	@Autowired
	private CuentasMapper cuentasMapper;
	
	@Autowired
	private TratamientoMapper tratamientoMapper;
	
	private BigDecimal 	total = new BigDecimal("00");
	
	@Override
	public ResultadoCuentaAsientoTotal cuentaAsientoTotal() {
		return this.asientoContableMapper.cuentaAsientoTotal();
	}

	@Override
	public List<ResultadoCuentaAsientoTotal> cuentasAsientoTotal() {

		return this.asientoContableMapper.cuentasAsientoTotal();
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
		
		MaxNumAsientoContable cantidadRegistros = this.asientoContableMapper.cantRegistros();
		System.out.println("cantidadRegistros ==>> "+cantidadRegistros.getMaxNum());
		return cantidadRegistros;
	}

	@Override
	public List<ResumenPorCuentas> resumenPorCuentas(int asConTipo) {
		
		return this.asientoContableMapper.resumenPorCuentas(asConTipo);
	}

	@Override
	@Transactional
	public void ingresarAsientoContable(Object formaDePago,TratamientoPaciente tratamientoPaciente, FormasDePagosDesc formasDePagoDesc) {
		Caja cajaActual  = this.cajaMapper.cargoCajaActual();
		int cuentaId = formasDePagoDesc.getFormasDePagoCuenta();
		MaxNumAsientoContable maxNumAsientoContable = this.asientoContableMapper.maxNumAsientoContable();
		if(formaDePago instanceof PagoEfectivo){
			
			DescCuentaFormaDePago desCuentaFormaDePago = this.formasDePagosService.cuentaFormaDePagoDesc(cuentaId);
			String pagoEfCuenta = desCuentaFormaDePago.getCuentaDesc();
			
			
			((PagoEfectivo) formaDePago).setPagoEfCajaId(cajaActual.getCajaId());
			((PagoEfectivo) formaDePago).setPagoEfCuenta(pagoEfCuenta);
			((PagoEfectivo) formaDePago).setPagoEfAsientoNro(maxNumAsientoContable.getMaxNum());
			this.formasDePagosService.insertTratamientoPagoEfectivo(tratamientoPaciente, (PagoEfectivo) formaDePago, formasDePagoDesc.getFormasDePagoCuenta());
		}
		if(formaDePago instanceof PagoTarjeta){
			DescCuentaFormaDePago desCuentaFormaDePago = this.formasDePagosService.cuentaFormaDePagoDesc(cuentaId);
			String pagoTarjCuenta = desCuentaFormaDePago.getCuentaDesc();

			((PagoTarjeta) formaDePago).setTarjetaCajaId(cajaActual.getCajaId());
			((PagoTarjeta) formaDePago).setTarjCuenta(pagoTarjCuenta);
			((PagoTarjeta) formaDePago).setTarjetaAsientoNro(maxNumAsientoContable.getMaxNum());
			this.formasDePagosService.insertTratamientoPagoTarjeta(tratamientoPaciente,(PagoTarjeta) formaDePago, formasDePagoDesc.getFormasDePagoCuenta());
		}
		ArrayList<AsientoContable> asientoContableList = new ArrayList<AsientoContable>();
		
		Caja caja = this.cajaMapper.cargoCajaActual();
		Cuentas asCuentaL1 = this.cuentasMapper.selectCuentaByCuentaId(formasDePagoDesc.getFormasDePagoCuenta());
		BigDecimal asCuentaDebeMontoL1 = new BigDecimal((double)tratamientoPaciente.getCostoTratSesion());
		BigDecimal asCuentaHaberMontoL1 = new BigDecimal((double)00);
		
		Tratamiento tratamiento = this.tratamientoMapper.findTratamientoById(tratamientoPaciente.getTratamId());
		Cuentas cuentaImp = this.cuentasMapper.selectCuentaByCuentaId(tratamiento.getImpuesto().getImpuestoCuenta().getCuentaId());
		
		Cuentas cuentaTratamiento = new Cuentas();
		cuentaTratamiento.setCuentaId(12);
		cuentaTratamiento.setCuentaDesc(tratamiento.getTratDescripcion());
		cuentaTratamiento.setCuentaTipo(CuentaTipo.TRATAMIENTO.getDescripcion());
	
		
		MaxNumAsientoContable asConNro = this.asientoContableMapper.maxNumAsientoContable();
		AsientoContable asientoContableL1 = new AsientoContable();
		AsientoContable asientoContableL2 = new AsientoContable();
		AsientoContable asientoContableL3 = new AsientoContable();
		
		asientoContableL1.setAsConNro(asConNro.getMaxNum());
		asientoContableL2.setAsConNro(asConNro.getMaxNum());
		asientoContableL3.setAsConNro(asConNro.getMaxNum());
		
		asientoContableL1.setCaja(caja);
		asientoContableL2.setCaja(caja);
		asientoContableL3.setCaja(caja);
		
		BigDecimal asImpDebeMonto = new BigDecimal("00");
		BigDecimal impuesto = tratamiento.getImpuesto().getImpuestoValor();
		BigDecimal aux = asCuentaDebeMontoL1.multiply(impuesto);
		BigDecimal divisor = new BigDecimal("100.00");
		BigDecimal resultado = aux.divide(divisor);
		BigDecimal asImpHaberMonto = new BigDecimal("00");
		this.total = asCuentaDebeMontoL1.subtract(resultado);
		asImpHaberMonto.add(resultado);

		asientoContableL1.setAsCuentaDebe(asCuentaL1);
		asientoContableL1.setAsCuentaHaber(asCuentaL1);
		asientoContableL1.setAsCuentaDebeMonto(asCuentaDebeMontoL1);
		asientoContableL1.setAsCuentaHaberMonto(asCuentaHaberMontoL1);
		asientoContableL1.setAsConDescripcion(asCuentaL1.getCuentaDesc());
		asientoContableL1.setAsCuentaTipo(asCuentaL1.getCuentaTipo());

		asientoContableL2.setAsCuentaDebe(cuentaImp);
		asientoContableL2.setAsCuentaHaber(cuentaImp);
		asientoContableL2.setAsCuentaDebeMonto(asImpDebeMonto);
		asientoContableL2.setAsCuentaHaberMonto(resultado);
		asientoContableL2.setAsConDescripcion(cuentaImp.getCuentaDesc());
		asientoContableL2.setAsCuentaTipo(cuentaImp.getCuentaTipo());

		asientoContableL3.setAsCuentaDebe(cuentaTratamiento);
		asientoContableL3.setAsCuentaHaber(cuentaTratamiento);
		asientoContableL3.setAsCuentaDebeMonto(asImpDebeMonto);
		asientoContableL3.setAsCuentaHaberMonto(total);
		asientoContableL3.setAsConDescripcion(cuentaTratamiento.getCuentaDesc());
		asientoContableL3.setAsCuentaTipo(cuentaTratamiento.getCuentaTipo());
	
		asientoContableList.add(asientoContableL1);
		asientoContableList.add(asientoContableL2);
		asientoContableList.add(asientoContableL3);
		
		Iterator<AsientoContable> it = asientoContableList.iterator();
		
		while(it.hasNext()){
			this.asientoContableMapper.ingresarAsientoContable(it.next());
		}	
	}

	@Override
	public List<ResumenPorCuentas> resumenPorCuentasTotalPorCaja(String cuentaTipo, int idCaja) {
		
		return this.asientoContableMapper.resumenPorCuentasTotalPorCaja(cuentaTipo, idCaja);
	}
}
