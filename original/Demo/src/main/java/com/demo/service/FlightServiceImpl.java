package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.flightEntity.FlightEntity;

@Service
public class FlightServiceImpl {
	
	@Autowired
	IFlightRepository iFlightRepository;

	public Integer saveFlight(FlightEntity flightEntity) {
		FlightEntity flightEntity2 = iFlightRepository.save(flightEntity);
		return flightEntity2.getId();
	}

	public void deleteByIdVar(Integer id) {
		iFlightRepository.deleteById(id);
	}
	
	public void updateFlights(FlightEntity flightEntity) {
		iFlightRepository.save(flightEntity);
	}
	public FlightEntity findbyid(Integer id) {
		return iFlightRepository.findById(id).get();
	}
}
