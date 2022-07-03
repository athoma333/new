package com.flipkart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.flipkart.dummyEntities.Book;


@Entity
public class FlipkartEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String orderName;
	private Book book;
	public FlipkartEntity(String orderName) {
		super();
		this.orderName = orderName;
	}
	
	public FlipkartEntity(Integer id, String orderName, Book book) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.book = book;
	}

	public FlipkartEntity() {
		super();
	}

	public FlipkartEntity(String orderName, Book book) {
		super();
		this.orderName = orderName;
		this.book = book;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public FlipkartEntity(Integer id) {
		super();
		this.id = id;
	}

	
}
