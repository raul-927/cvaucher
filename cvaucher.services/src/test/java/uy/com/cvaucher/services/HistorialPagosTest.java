package uy.com.cvaucher.services;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.HistorialPagos;
import uy.com.cvaucher.services.interfaces.HistorialPagosInt;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/test-Context.xml"})
public class HistorialPagosTest 
{
	@Autowired
	HistorialPagosInt historialPagosService;
	
	@Test
	public void selectAllHistorialPagos()
	{
		//HistorialPagos historialPagos = new HistorialPagos();
		int histTratPacId = 41;
		
		List<HistorialPagos> historialPagos = this.historialPagosService.findHistorialPagoByHistTratPacId(histTratPacId);

		for(HistorialPagos hp: historialPagos)
		{
			System.out.println("Id: "+hp.getHistPagosId());
			System.out.println("HistTratPacId: " +hp.getHistTratPacId());
			System.out.println("Fecha: "+hp.getHistPagosFechaPago());
			System.out.println("Monto: "+hp.getHistPagosMonto());
			assertNotNull(hp);
		}

	}
	//@Test
	public void insertHistorialPagos()
	{
		HistorialPagos histP = new HistorialPagos();
		histP.setHistPagosFechaPago("2017-11-19");
		histP.setHistPagosMonto(300);
		histP.setHistTratPacId(41);
		this.historialPagosService.insertHistorialPago(histP);
	}
}
