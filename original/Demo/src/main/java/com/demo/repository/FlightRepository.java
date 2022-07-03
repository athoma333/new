package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.flightEntity.FlightEntity;

public interface FlightRepository extends JpaRepository<FlightEntity, Integer>{

}
