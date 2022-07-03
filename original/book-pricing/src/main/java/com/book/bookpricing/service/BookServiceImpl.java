package com.book.bookpricing.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bookpricing.entity.Book;
import com.book.bookpricing.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookrepository;
	
	@Override
	public Book findById(Integer id) {
		return bookrepository.findById(id).get();
	}

	@Override
	public Book addBook(Book book) {
		return bookrepository.save(book);
	}

	@Override
	public void deleteBook(Integer id) {
		bookrepository.deleteById(id);
	}

	@Override
	public Book updateBook(Book book) {
		return bookrepository.save(book);
	}

}
