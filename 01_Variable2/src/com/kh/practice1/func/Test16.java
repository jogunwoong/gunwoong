package com.kh.practice1.func;

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print('*');

			}
			System.out.println();
		}
	}
}
