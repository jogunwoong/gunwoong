package com.kh.ch07_inheritance;

//Fruid 클래스의 상속을 받는다 -->extends Fruit
public class MyFruit extends Fruit {
	//이름과 가격정보를 받아 초기화 해주는 생성자
	// --매개변수가2개인 생성자 필요!
	public MyFruit(String name, int price) {
		//super : 부모클래스 멤버에 접근할 때
		// 부모클래스의 생성자 호출 : super ()
		// 부모클래스의 멤버(변수/메소드) 접근 : super.멤버이름
		super(name,price);
		
		}	
	
	//toString() 오버라이딩
	@Override
	public String toString() {
		return " 내가 좋아하는 과일은 " + super.getName() + " 이다.";
	}

}
