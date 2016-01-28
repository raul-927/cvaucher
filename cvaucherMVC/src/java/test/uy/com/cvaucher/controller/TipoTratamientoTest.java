package uy.com.cvaucher.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uy.com.cvaucher.services.domain.TipoTratamiento;
import uy.com.cvaucher.services.interfaces.TipoTratamientoInt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="root-Context.xml")
public class TipoTratamientoTest {
	
	@Autowired
	TipoTratamientoInt tipTratamientoService;
	
	
	@Test
	public void insetTipoTratamientoRemoting(){
		
		//UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
		//		getPrincipal();
		
		Authentication request = new UsernamePasswordAuthenticationToken("admin","admin");
		
		//System.out.println("user.getUsername() = "+user.getUsername() +", user.getPassword() = "+ user.getPassword() + ",  user.getAuthorities() = "+user.getAuthorities());
		System.out.println("request.getName() = "+request.getName()+", request.getCredentials() = "+request.getCredentials() + ", request.getAuthorities() = "+request.getAuthorities());
		
		SecurityContextHolder.getContext().setAuthentication(request);
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("root-context.xml");
		TipoTratamiento tipoTratamiento = new TipoTratamiento();
		tipoTratamiento.setTipTratDesc("TipoTratamientoPruebaDesdeTest4");
		this.tipTratamientoService = (TipoTratamientoInt) contexto.getBean("tipoTratamientoService");
		this.tipTratamientoService.createTipoTratamiento(tipoTratamiento);
		List<TipoTratamiento> tipTrat = this.tipTratamientoService.findAllTipoTratamiento();
		for(TipoTratamiento tt: tipTrat){
			System.out.println("tt.getTipTratDesc() = "+tt.getTipTratDesc());
		}
		System.out.println("tipTrat.size() = "+tipTrat.size());
	}
}
