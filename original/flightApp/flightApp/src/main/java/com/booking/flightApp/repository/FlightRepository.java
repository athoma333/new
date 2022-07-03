package com.booking.flightApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.flightApp.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
