package com.booking.flightApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.flightApp.Dao.FlightDao;
import com.booking.flightApp.entity.Flight;
import com.booking.flightApp.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	FlightDao flightdao;
	
	@Override
	public Flight addFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	@Override
	public void removeFlight(Integer flightNumber) {
		flightRepository.deleteById(flightNumber);
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	@Override
	public Iterable<Flight> viewAllFlights() {
		return flightdao.findAll();
	}

	@Override
	public Flight updateFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	@Override
	public Flight getFlightById(Integer id) {
		return flightRepository.findById(id).get();
	}

}
