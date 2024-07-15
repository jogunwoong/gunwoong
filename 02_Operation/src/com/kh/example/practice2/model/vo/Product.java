package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int Price;
	private String brand;
	public Product() {
		
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.println("pName=" + pName + ", Price" + Price + ", brand" + brand);
	}
		
	
	

}
