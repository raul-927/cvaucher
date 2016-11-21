package uy.com.cvaucher.services.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class CronContable {
	
	//@Scheduled(cron ="0/10 * * * * ?")
	public void mensaje(){
		System.out.println("Esto es una prueba de CRON!!");
	}
}
