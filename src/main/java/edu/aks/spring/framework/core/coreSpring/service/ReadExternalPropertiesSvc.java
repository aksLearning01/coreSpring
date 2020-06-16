/**
 * 
 */
package edu.aks.spring.framework.core.coreSpring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Akanksha
 *
 */
@Component
public class ReadExternalPropertiesSvc {
	
	@Value("${external.service.url}")
	private String url;
	
	public String getExternalUrl() {
		return url;
	}

}
