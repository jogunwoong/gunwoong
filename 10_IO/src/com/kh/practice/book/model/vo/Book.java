package com.kh.practice.book.model.vo;

public class Book {
	
	private String title;
	private String author;
	private int price;
	private Calender date;
	private double discount;
	
	public Book() {
		
	}
	public Book(String title, String author, int price, Calender date, double discount) {
		
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calender getDate() {
		return date;
	}
	public void setDate(Calender date) {
		this.date = date;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String toString() {
		
	}
}
