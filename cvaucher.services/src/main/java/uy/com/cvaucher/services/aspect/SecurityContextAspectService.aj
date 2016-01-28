package uy.com.cvaucher.services.aspect;

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
public aspect SecurityContextAspectService {
	
	@Pointcut(
			"execution(* uy.com.cvaucher.services.interfaces.TipoTratamientoInt.createTipoTratamiento(..))")
	public void ejecutarSecurityContextAspect(){
		
	}
	
	
	@Before("ejecutarSecurityContextAspect()")
	public void ejecutoSecurityContext(){
		
		UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
				getPrincipal();
		
		System.out.println("user.getUsername() =>> "+user.getUsername());
		System.out.println("user.getAuthorities() =>> "+user.getAuthorities());
		System.out.println("user.getPassword() =>> "+user.getPassword());
	}
	
	
}
