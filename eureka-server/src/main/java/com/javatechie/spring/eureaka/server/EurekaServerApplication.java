package com.javatechie.spring.eureaka.server;
 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.SpringVersion;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
        System.out.println("version: " + SpringVersion.getVersion());

		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
