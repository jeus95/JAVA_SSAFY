package com.off.dat2;
//VO (value Object) 값을 저장한는것이 목적인

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int Price;
	private String desc;
	

	
	public Book() {
	
	}

	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		Price = price;
		this.desc = desc;
	}

	public String getIsbn() {
		return isbn;
	
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", Price=" + Price + ", desc=" + desc + "]";
	}
}	
	
	