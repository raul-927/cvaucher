package uy.com.cvaucher.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@Aspect
public aspect SecurityContextAspect {
	
	@Pointcut(
			"execution(* uy.com.cvaucher.services.interfaces.TipoTratamientoInt.createTipoTratamiento(..))")
	public void ejecutarSecurityContextAspect(){
		
	}
	
	
	@Before("ejecutarSecurityContextAspect()")
	public void ejecutoSecurityContext(){
		String xml = "classPath:root-context.xml";
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		System.out.println("user.getUsername() = "+user.getUsername() +", user.getPassword() = "+ user.getPassword());
		Authentication request = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword().toString());
		System.out.println("request.getName() = "+request.getName() +", request.getCredentials() = "+ request.getCredentials());
		SecurityContextHolder.getContext().setAuthentication(request);
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(xml);
		System.out.println("Se está ejecutando el aspecto correctamente");
	}
	
	
}
