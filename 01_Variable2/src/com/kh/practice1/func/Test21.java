package com.kh.practice1.func;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println(" ");
		}
		for (int i = num-1; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print('*');
			}
			System.out.println("");
		}

	}

}
