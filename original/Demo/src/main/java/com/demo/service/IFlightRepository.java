package com.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.flightEntity.FlightEntity;

public interface IFlightRepository extends JpaRepository<FlightEntity, Integer> {

}
