package com.bookStore.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	public void saveBook(Book aBook) {
		bookRepo.save(aBook);
	}
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	public Book getBookbyID(int id) {
		return bookRepo.findById(id).get();
	}
	
}
 