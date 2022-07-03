package com.book.bookpricing.service;


import org.springframework.stereotype.Service;

import com.book.bookpricing.entity.Book;

@Service
public interface BookService {
	public Book findById(Integer id);
	
	public Book addBook(Book book);
	
	public void deleteBook(Integer id);
	
	public Book updateBook(Book book);
}

