package com.kh.practice1.func;

import java.util.Scanner;

public class Test24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				System.out.print("박");
				
			} else if (i % 2 == 1) {
				
				System.out.print("수");

			} else {
				System.out.println("양수가 아닙니다.");
			}
		}
	}
}
