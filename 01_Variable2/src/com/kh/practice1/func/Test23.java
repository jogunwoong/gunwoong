package com.kh.practice1.func;

import java.util.Scanner;

public class Test23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println("");

		for (int i = 0; i < num - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < num - 2; j++) {
				System.out.print(" ");
			}

			System.out.print("*");
			System.out.println("");

		}
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}

}
