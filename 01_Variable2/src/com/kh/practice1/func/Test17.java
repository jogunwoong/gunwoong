package com.kh.practice1.func;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {

				System.out.print('*');

			}
			System.out.println(" ");
		}

	}
}
