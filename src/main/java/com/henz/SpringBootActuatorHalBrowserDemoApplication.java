package com.henz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 
 * access actuator via HAL browser on localhost:8080/application
 * 
 * in the HAL browser you see all URLs / APIs which are used in the actuator
 * 
 * you can see 
 * 	metrics -> turn off auth in application.properties
 * 	
 * 
 * */

@SpringBootApplication
public class SpringBootActuatorHalBrowserDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorHalBrowserDemoApplication.class, args);
	}

}
