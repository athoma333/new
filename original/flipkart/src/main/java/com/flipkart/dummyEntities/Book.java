package com.flipkart.dummyEntities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Book implements Serializable{


	private Integer id;
	private String title;
	private Double price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return title;
	}
	public void setName(String name) {
		this.title = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Book(String name, Double price) {
		super();
		this.title = name;
		this.price = price;
	}
	public Book() {
		super();
	}
	
	
}
