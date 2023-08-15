package com.spring.emlpoyeeprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.employee.controller")
public class EmployeeProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProviderApplication.class, args);
	}

}
