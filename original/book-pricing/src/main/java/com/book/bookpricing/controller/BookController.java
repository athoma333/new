package com.book.bookpricing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookpricing.entity.Book;
import com.book.bookpricing.repository.BookRepository;
import com.book.bookpricing.service.BookServiceImpl;


@RestController
public class BookController {

	@Autowired
	BookServiceImpl bookservice;
	
	@Autowired
	BookRepository bookrepository;
	
	@PostMapping("/addbook")
	public Book createbook(@RequestBody Book book) {
		return bookservice.addBook(book);
	}
	
	@DeleteMapping("/deletebook/{id}")
	public String removeFlight(@PathVariable("id") Integer bookNumber) {
		bookservice.deleteBook(bookNumber);;
		return "Book with Book number: "+bookNumber+" removed";
	}
	
	@PutMapping("/updatebook")
	public Book updateFlight(@RequestBody Book book) {
		return bookservice.updateBook(book);
	}
	
	@GetMapping("/viewbyprice/{id}")
	public Iterable<Book> viewByPrice(@PathVariable("id") Double price){
		return bookrepository.findBookByPrice(price);
	}
	
	@GetMapping("/getbook/{id}")
	public Book findBookById(@PathVariable("id") Integer bookNumber) {
		return bookservice.findById(bookNumber);
	}
}
