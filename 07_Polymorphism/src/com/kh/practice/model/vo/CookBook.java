package com.kh.practice.model.vo;

public class CookBook {
	private String title;
	private String auther;
	private String publisher;
	private boolean coupon;
	
	public CookBook() {
		
	}
	public CookBook(String title, String auther, String publisher, boolean coupon) {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	

}
