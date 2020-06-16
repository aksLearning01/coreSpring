package edu.aks.spring.framework.core.coreSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.aks.spring.framework.core.coreSpring.service.CalculationService;
import edu.aks.spring.framework.core.coreSpring.service.ReadExternalPropertiesSvc;

@SpringBootApplication
public class CoreSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CoreSpringApplication.class, args);
		CalculationService svc = (CalculationService) context.getBean(CalculationService.class);

		System.out.println(svc.add(20, 30));
		
		
		
		ReadExternalPropertiesSvc externalSvc = (ReadExternalPropertiesSvc) context.getBean(ReadExternalPropertiesSvc.class);
		
		System.out.println(" "+externalSvc.getExternalUrl());
		
	}
}
