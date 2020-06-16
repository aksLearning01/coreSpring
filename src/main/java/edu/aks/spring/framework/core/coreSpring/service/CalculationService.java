/**
 * 
 */
package edu.aks.spring.framework.core.coreSpring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

/**
 * @author Akanksha
 *
 */
@Service
public class CalculationService {

	@PostConstruct
	public void postCreationMethod() {
		System.out.println("After creation of the bean");
	}

	public int add(int a, int b) {
		return a + b;
	}

	@PreDestroy
	public void beforeDestroyMethod() {
		System.out.println("before destruction of the bean");
	}

}
