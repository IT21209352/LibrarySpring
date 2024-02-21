package com.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Book;
import com.bookStore.entity.ReservedBooks;
import com.bookStore.service.BookService;
import com.bookStore.service.ReservedBookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bService;
	
	@Autowired
	private ReservedBookService resBService;
	
	@GetMapping("/home")
	public String  homePage() {
		return "home";
	}
	
	@GetMapping("/add_new_book")
	public String  addnewBook() {
		return "addNewBook";
	}
	
	@GetMapping("/book_list")
	public ModelAndView  bookList() {
		List<Book> list = bService.getAllBooks();
		return new ModelAndView("bookList","book",list);
	}
	
	@GetMapping("/reservedBooks")
	public ModelAndView  resdBookList() {
		List<ReservedBooks> list = resBService.getAllBooks();
		return new ModelAndView("reservedBooks","resBook",list);
	}
	
	
	@GetMapping("/search")
	public String  search() {
		return "search";
	}
	
	
	@PostMapping("/save")
	public String saveBook(@ModelAttribute Book aBook) {
		bService.saveBook(aBook);
		return "redirect:/book_list";
	}
	
	
	
	@RequestMapping("/reservedBooks/{ID}")
	public String getReservedBooks(@PathVariable("ID") int id) {
		Book b = bService.getBookbyID(id);
		ReservedBooks rb = new ReservedBooks(b.getID(),b.getISBN(),b.getName(),b.getAuthor(),b.getPrice());
		resBService.saveBook(rb);
		return "redirect:/reservedBooks";
		
	}
	


	
	@RequestMapping("/removeFromList/{ID}")
	public String removeReservedBooks(@PathVariable("ID") int id) {
		resBService.deleteById(id);

		return "redirect:/reservedBooks";
		
	}

}