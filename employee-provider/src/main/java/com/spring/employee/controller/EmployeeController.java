package com.spring.employee.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-service")
public class EmployeeController {
	
	
	@GetMapping("/getAllEmployessList")
	public List<String> getAllEmployess(){
		return Stream.of("srikanth","sekhar","anil","anji").collect(Collectors.toList());
	}

}
