package com.kh.practice1.func;

import java.util.Scanner;

public class Test7 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력");
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력");
		int num2 = sc.nextInt();
		
		if(num1 <= 0 || num2 <= 0) {
			System.out.println("정수로 입력하세요.");
			sc.close();
			return;
		
		}
		
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		String str = sc.next();
		char c = str.charAt(0);
		
		switch(c) {
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			break;
		case '/':
			if(num2 != 0) {
				System.out.printf("%d / %d = %.6f\n", num1, num2, (double)num1/num2);
			}else {
				System.out.println("0으로 나눌수 없습니다.");
			}
			break;
		case '%':
			System.out.println(num1 + "%" + num2 + "%" + (num1%num2));
		default :
			System.out.println("잘못 입력하셨습니다.프로그램을 종료합니다.");
			return;
		}
		sc.close();
		
		
		
		
		
		
	}

}
