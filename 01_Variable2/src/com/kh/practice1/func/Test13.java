package com.kh.practice1.func;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		while (true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();

			if (num >= 1) {
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}
		for (int i = num; i >= 1; i--) {
			System.out.println(i + " ");
		}

		System.out.println();
	}

}
