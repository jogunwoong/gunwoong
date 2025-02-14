package com.kh.ch09_interface;

public class InterfaceRun {
	/*
	 * * 인터페이스 = 상수필드 + 추상메소드
	 * 	 - 추상메소드를 가지고 있기 때문에 객체를 직접 생성할 수 없음
	 * 	 - 참조변수의 타입으로는 사용 가능
	 * 
	 * 	 - 추상메소드 : 미완성된 메소드
	 * 			     몸통부({})가 없는 메소드(구현되지 않음!)
	 * 				 무조건 오버라이딩 후 메소드 호출이 가능
	 * 
	 * 	[public abstract] 반환타입 메소드명([매개변수]);
	 * 
	 * * 추상클래스 = [추상메소드] + 일반필드 + 일반메소드
	 * 		- 미완성된 클래스
	 * 		- 객체 생성 불가
	 * 		- 참조변수의 타입으로 사용 가능
	 * 		- 추상메소드는 가질 수도 있고, 가지지 않을 수도 있음
	 * 		=> 추상메소드가 있는경우 반드시 추상클래스로 명시해야 함
	 * 
	 * 			접근제한자 abstract class 클래스명 {}
	 * 
	 * 		-> 자식 클래스에서 강제로 오버라이딩하여 동일한 형식의
	 * 			메소드를 정의하고자 할 때
	 * 		-> 자식클래스 마다 구현내용은 다르지만 동일한 형식을 적용
	 * 			(메소드 통일성/ 표준화된 틀 제공)
	 * 			
	 * 		=> 추상메소드가 없는 경우도 추상클래스로 만들 수 있음
	 * 			-> 어떤 경우 ? - 해당 클래스가 미완성된 클래스라고
	 * 						  부여하고자 할 때
	 * 						- 객체생성을 불가능하게 하고자 할 때
	 * 
	 * * 상속(구현) 관계
	 * 	- 클래스에서 클래스를 상속받을 때 : 자식클래스 extends 부모클래스
	 * 							(단일상속만 가능): 화살표 실선
	 * 	- 클래스에서 인터페이스를 구현할 때 :
	 * 	클래스 implements 인터페이스, 인터페이스, ...(다중상속 가능):화살표 점선
	 * 	- 인터페이스에서 인터페이스를 상속 받을 때:
	 * 	인터페이스 extends 인터페이스, 인터페이스...(다중상속 가능) : 화살표 실선
	 */
	public static void main(String[] args) {
		Plant monstera = new Monstera("카스테라");
		Plant lavender = new Lavender("소고기");
		
		System.out.println(monstera);
		System.out.println(lavender);
		
		monstera.sprinkleWater();
		monstera.baskSun();
		
		lavender.sprinkleWater();
		lavender.baskSun();
		
		System.out.println("----1회----");
		
		System.out.println(monstera);
		System.out.println(lavender);
		
		lavender.sprinkleWater();
		lavender.baskSun();
		
		System.out.println("----2회----");
		
		System.out.println(monstera);
		System.out.println(lavender);
		
	}


}
