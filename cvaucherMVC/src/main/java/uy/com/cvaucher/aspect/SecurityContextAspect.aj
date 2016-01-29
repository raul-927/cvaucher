package uy.com.cvaucher.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@Aspect
public aspect SecurityContextAspect {
	@Autowired
	private UserDetails userDet;
	@Pointcut(
			"execution(* uy.com.cvaucher.services.interfaces.TipoTratamientoInt.createTipoTratamiento(..))")
	public void ejecutarSecurityContextAspect(){
		
	}
	
	
	@Before("ejecutarSecurityContextAspect()")
	public void ejecutoSecurityContext(){
		String xml = "classPath:root-context.xml";
		this.userDet = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		System.out.println("user.getUsername() = "+this.userDet.getUsername() +", user.getPassword() = "+ this.userDet.getPassword());
		Authentication request = new UsernamePasswordAuthenticationToken(userDet.getUsername(), userDet.getPassword().toString());
		System.out.println("request.getName() = "+request.getName() +", request.getCredentials() = "+ request.getCredentials());
		SecurityContextHolder.getContext().setAuthentication(request);
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(xml);
		System.out.println("Se está ejecutando el aspecto correctamente");
	}
	
	
}
