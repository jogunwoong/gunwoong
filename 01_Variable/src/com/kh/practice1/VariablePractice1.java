package com.kh.practice1;


import java.util.Scanner;

public class VariablePractice1 {
	
	// Q. 이름,성별,나이, 키를 사용자에게 입력받아
	//    각각의 값을 변수에 담고 출력하세요
	public static void main(String[] args ) {
		//Scanner 객체생성
		Scanner sc = new Scanner(System.in);
		
		//"이름을 입력하세요: " 값을 출력
		System.out.print("이름을 입력하세요: ");
		// * 줄바꿈 처리하지 않기 위해 print 메소드 사용
		String name = sc.nextLine();
		
		//"이름은 xxx입니다." 출력
		System.out.print("성별을 입력하세요(남/여):");
		String sex = sc.nextLine();
		
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm):");
		float tall = sc.nextFloat();
		
		
		System.out.println( "키 " + tall + "cm인 " + age +"살 "+ sex + "자 " + name + "님 반갑습니다^^ㅎㅎ");
	
		
		System.out.printf("키 %fcm인 %d살 %자 %s님 반갑습니다^^",
								tall, age, sex, name);
		
		
	}

}


