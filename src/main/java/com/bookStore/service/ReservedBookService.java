package com.bookStore.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookStore.entity.ReservedBooks;
import com.bookStore.repository.ReservedBookRepository;

@Service
public class ReservedBookService {


	@Autowired
	private ReservedBookRepository resBookRepo;
	
	public void saveBook(ReservedBooks aBook) {
		resBookRepo.save(aBook);
	}

	public List<ReservedBooks> getAllBooks() {
		return resBookRepo.findAll();
	}
	
	public void deleteById(int id) {
		resBookRepo.deleteById(id);
	}

	public ReservedBooks getBookbyID(int id) {
		return resBookRepo.findById(id).get();
	}

	
}
