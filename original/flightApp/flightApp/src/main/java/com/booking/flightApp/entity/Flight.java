package com.booking.flightApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer flightNo;
	private String carrierName;
	private String flightModel;
	private Integer seatCapacity;
	public Integer getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public Integer getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(Integer seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public Flight(String carrierName, String flightModel, Integer seatCapacity) {
		super();
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
	}
	public Flight() {
		super();
	}
	public Flight(Integer flightNo, String carrierName, String flightModel, Integer seatCapacity) {
		super();
		this.flightNo = flightNo;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
	}
	
	
}
