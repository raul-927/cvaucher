package uy.com.cvaucher.services.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.InitializingBean;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.security.access.prepost.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.access.intercept.aspectj.AspectJCallback;
//import org.springframework.security.access.intercept.aspectj.AspectJMethodSecurityInterceptor;


@Aspect
public aspect TipoTratamientoAspect implements InitializingBean{
	
	@Pointcut(
			"execution(* uy.com.cvaucher.services.interfaces.TipoTratamientoInt.createTipoTratamiento(..))")
	public void tipoTratamientoAspectInicio(){
		
	}
	
	@Before("tipoTratamientoAspectInicio()")
	public void beforeTipoTratamientoService(){
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		
		System.out.println("user.getUsername() =>> "+user.getUsername());
		System.out.println("user.getAuthorities() =>> "+user.getAuthorities());
		System.out.println("user.getPassword() =>> "+user.getPassword());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
