package com.bookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="reservedBooks")
public class ReservedBooks {

	@Id
	private int ID;
	private int ISBN;
	private String Name;
	private String Author;
	private int Price;
	public ReservedBooks(int iD, int iSBN, String name, String author, int price) {
		super();
		ID = iD;
		ISBN = iSBN;
		Name = name;
		Author = author;
		Price = price;
	}
	
	public ReservedBooks() {
		super();
		
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
}
