package com.javatechie.spring.eureaka.client.api.controller;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Lazy;


@RestController
@RequestMapping("/k8data")
@EnableDiscoveryClient
public class ShoppingController {
	@Autowired
	private RestTemplate template;


	@GetMapping("/getMessage")
	public ResponseEntity<Object> getMessageData() {
		List list=Stream.of("laptop", "dell", "sony", "mac").collect(Collectors.toList());
		return new ResponseEntity<Object>(list, HttpStatus.OK);
		
	}

	/**
           instead of give microservice name registed in eureka server it wont work in docker container,
	   use inplace of microservice name with docker container name
	**/
	@GetMapping("/amazon-payment/{price}")
	public String invokePaymentService(@PathVariable int price) {
		String url = "http://payment-service:8888/payment-provider/payNow/" + price;
		return template.getForObject(url, String.class);
	}

}
