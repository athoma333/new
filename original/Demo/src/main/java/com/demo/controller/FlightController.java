package com.demo.controller;


import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.flightEntity.FlightEntity;
import com.demo.service.FlightServiceImpl;

@RestController
public class FlightController {

	@Autowired
	FlightServiceImpl flightService;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello, this is my world";
	}
	
	@PostMapping("/addflight")
	public Integer createFlight(@Valid @RequestBody FlightEntity flightEntity) {
		Integer id = flightService.saveFlight(flightEntity);
		System.out.println(id);
		return id;
	}
	@DeleteMapping("/deleteById")
	public void deleteById(@RequestParam("id") Integer id) {
		flightService.deleteByIdVar(id);
	}
	
	@PutMapping("/updateflight")
	public FlightEntity updateFlight(@Valid @RequestBody FlightEntity flightEntity) {
		flightService.updateFlights(flightEntity);
		return flightEntity;
	}
	
	//error and exception handling
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleException(MethodArgumentNotValidException exception) {
		Map<String, String> messages = new HashMap<>();
		exception.getAllErrors().forEach(error ->{
			String fieldName = ((FieldError)error).getField();
			String errorMessage = ((FieldError)error).getDefaultMessage();
			messages.put(fieldName, errorMessage);
		});
		return messages;
	}
	@GetMapping("/setflightprice")
	public FlightEntity setFlightPrice(@RequestParam("id") Integer id) {

		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity=new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Double> price= restTemplate.exchange("http://localhost:8090/getPrice", HttpMethod.GET,entity,Double.class);
		FlightEntity flightEntity = flightService.findbyid(id);
		if(price.hasBody()) {
			flightEntity.setPrice(price.getBody());
			flightService.saveFlight(flightEntity);
			return flightEntity;
		}
		return flightEntity;
	}
}
