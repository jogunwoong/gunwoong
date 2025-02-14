package com.kh.ch07_inheritance;

public class Fruit {
	private String name;//이름
	private int price;//가격
	
	//기본생성자 / 모든 필드를 매개변수로 가지는 생성자
	public Fruit() {}
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//private필드의 getter/setter 메소드
	@Override
	public String toString() {
		//상속을 받았어도 멤버 접근제한자 private인 경우는 직접 접근 불가!
		return "이름 : " + name + " 가격 : " + price;
		
	}

}
