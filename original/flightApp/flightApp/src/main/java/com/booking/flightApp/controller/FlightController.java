package com.booking.flightApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.booking.flightApp.entity.Flight;
import com.booking.flightApp.service.FlightServiceImpl;

@RestController
@RequestMapping("/api/v1.0/flight")
public class FlightController {

	@Autowired
	FlightServiceImpl flightservice;
	
	@PostMapping("/addflight")
	public Flight createFlight(@RequestBody Flight flightEntity) {
		return flightservice.addFlight(flightEntity);
	}
	
	@DeleteMapping("/deleteflight/{id}")
	public String removeFlight(@PathVariable("id") Integer flightNumber) {
		flightservice.removeFlight(flightNumber);
		return "Flight with flight number: "+flightNumber+" removed";
	}
	
	@PutMapping("/updateflight")
	public Flight updateFlight(@RequestBody Flight flight) {
		return flightservice.updateFlight(flight);
	}
	
	@GetMapping("/viewallflights")
	public Iterable<Flight> viewAllFlights(){
		return flightservice.viewAllFlights();
	}
	
	@GetMapping("/getflight/{id}")
	public Flight findFlightById(@PathVariable("id") Integer flightNumber) {
		return flightservice.getFlightById(flightNumber);
	}
	
}
