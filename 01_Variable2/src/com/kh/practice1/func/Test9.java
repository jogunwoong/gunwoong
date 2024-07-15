package com.kh.practice1.func;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("실행항 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9.P/F");
		System.out.println("선택 :");
		
		int s = sc.nextInt();
		
		switch(s) {
		case 1:
			System.out.println("실습문제1 실행");
			break;
		case 2:
			System.out.println("실습문제2 실행");
			break;
		case 3:
			System.out.println("실습문제3 실행");
			break;
		case 4:
			System.out.println("실습문제4 실행");
			break;
		case 5:
			System.out.println("실습문제5 실행");
			break;
		case 6:
			System.out.println("실습문제6 실행");
			break;
		case 7:
			System.out.println("실습문제7 실행");
			break;
		case 8:
			System.out.println("실습문제8 실행");
			break;
		case 9:
			System.out.println("실습문제9 실행");
			break;
			
			
		}
		
	}

}
