package com.kh.ch07_inheritance;

public class InheritRun {
	public static void main(String []args) {
	/*
	 * 상속 : 부모타입에서 가지고 있는 멤버를 자식클래스에서
	 * 			직접 만들지 않고 상속받아 자신의 멤버처럼 사용할 수 있는 기능
	 * 
	 * [표현법] *extends*	
	 * 		[접근제한자][예약어] class 클래스명 extends 부모클래스{}
	 * 
	 * *장점
	 * 		- 중복된 코드를 하나로 관리할 수 있기 때문에 추가 /수정이 용이함	
	 * 		- 적은 양의 코드로 새로운 클래스 작성 가능
	 * 
	 * *특징
	 * 		- 클래스 간의 상속은 단일상속만 가능 (하나의 부모타입만 상속받을 수 있음 !)
	 * 		- private 멤버 (변수/메소드)는 접근 불가
	 * 		- 자식 객체에서 부모클래스에 정의되어 있는 메소드를 내것처럼 호출하여 사용 가능
	 * 		- 명시되어 있지 않지만 모든 클래스 (자바에서 제공되는 클래스, 직접 만든 클래스)는
	 * 			Object 클래스의 상속을 받음
	 * 		
	 * *오버라이딩 : 부모타입에 있는 메소드를 자식 클래스에서 재정의 하는 것
	 * 	- 부모타입에 정의된 메소드명, 반환타입, 매개변수(개수/타입/순서)는 모두 동일해야 함
	 *  - 접근제한자는 같은 범위이거나 큰 범위여야 함
	 *    ex) 부모타입에 메소드 접근제한자 : public --> 재정의 가능한 접근제한자 : public
	 *    					default --> default / protected / public
	 *    -예외처리 : 같은 클래스거나 그 클래스의 자식클래스만 가능 
	 */
		Fruit f = new Fruit("수박", 15000);
		MyFruit mf = new MyFruit("딸기", 8000);
		System.out.println(f);
		System.out.println(mf);
		
	
	}
}
