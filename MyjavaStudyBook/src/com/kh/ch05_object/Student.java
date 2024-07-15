package com.kh.ch05_object;

public class Student {
	//필드부 : 접근제한자 예약어 자료형 필드명
	// public + > protected(#) > [default]~ > private-
	String name;
	int age;
	double height;
	String phone;
	String address;
	
	//생성자부 : 접근제한자 클래스명([매개변수])
	public Student(){
		
	}
	//메소드부 : [접근제한자] [예약어] 반환타입 메소드명([매개변수]){}
	public Student(String name, int age, double height, String phone, String address){
		this.name = name;
		this.age = age;
		this.height = height;
		this.phone=phone;
		this.address = address;
		
	}
	public String toString() {
		//반환타입이 void가 아닐때는 반드시 return 값; 부분이 있어야함.
		//		=>void : 반환값이 없음을 의미
		return"이름 : " + name + " 나이 : " + age + " 키 : " + height + " 연락처 : " + phone + " 주소 : " + address;
	}

}
