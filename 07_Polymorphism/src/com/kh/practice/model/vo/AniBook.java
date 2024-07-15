package com.kh.practice.model.vo;

public class AniBook {
	
	private String title;
	private String author;
	private String publisher;
	private int accessAge;
	
	public AniBook() {}
	public AniBook(String title, String auther, String publisher, int accessAge, String author) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	
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
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
		
	
}


