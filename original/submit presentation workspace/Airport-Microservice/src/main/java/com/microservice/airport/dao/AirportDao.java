package com.microservice.airport.dao;

import java.beans.JavaBean;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.airport.model.Airport;

@JavaBean
@Repository
public interface AirportDao extends CrudRepository<Airport, String> {

}
