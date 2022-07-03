package com.booking.flightApp.Dao;

import org.springframework.data.repository.CrudRepository;

import com.booking.flightApp.entity.Flight;

public interface FlightDao extends CrudRepository<Flight, Integer> {

}
