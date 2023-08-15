package com.spring.getemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/getemployee-service")
@RefreshScope
public class GetEmployeeController {

	@Autowired
	@Lazy
	RestTemplate restTemplate;
	
	@Value("${employee.provider.uri}")
	private String uri;
	
	
	@Value("${limit.service.minimum}")
	private String minimumSal;
	
	
	@Value("${limit.service.maximum}")
	private String maximumSal;
	
	@GetMapping("/getEmployeeList")
	public List<String> getAllEmployess(){
		System.out.println(uri+"@@@@@@@@@@@@@@@@@@@");
		System.out.println("minimum::"+minimumSal);
		System.out.println("maximum::"+maximumSal);
		return restTemplate.getForObject(uri,List.class);
	}
}
