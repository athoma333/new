package com.booking.flightApp.service;

import com.booking.flightApp.entity.Flight;

public interface FlightService {

	public Flight addFlight(Flight flight);
	public void removeFlight(Integer flightNumber);
	public Flight modifyFlight(Flight flight);
	public Iterable<Flight> viewAllFlights();
	public Flight updateFlight(Flight flight);
	public Flight getFlightById(Integer id);
}
