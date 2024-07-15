package com.kh.practice1.func;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("연산자(+, -, *, /, % ) : ");
			String str = sc.next();
			if (str.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			char c = str.charAt(0);
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			switch (c) {
			case '+':
				System.out.print(num1 + " + " + num2 + "=" + (num1 + num2));
				System.out.println(" ");
				break;
			case '-':
				System.out.print(num1 + " - " + num2 + "=" + (num1 - num2));
				System.out.println(" ");
				break;
			case '*':
				System.out.print(num1 + " * " + num2 + "=" + (num1 * num2));
				System.out.println(" ");
				break;
			case '/':
				if (num2 != 0) {
					System.out.printf("%d / %d = %d\n" + num1, num2, (num1 / num2));
					System.out.println(" ");
				} else {
					System.out.print("0으로 나눌수 없습니다. 다시 입력해주세요.");
					System.out.println(" ");
					break;
				}
			case '%':
				System.out.print(num1 + " % " + num2 + "=" + (num1 % num2));
				System.out.println(" ");
				break;
			default:
				System.out.print("없는 연산자 입니다.다시 입력해주세요.");
				System.out.println(" ");
				return;
			}
		}
	}
}
