package com.kh.practice1.func;

import java.util.Random;
import java.util.Scanner;

public class Test41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int num1, num2;

		while (true) {
			System.out.print("행 크기 : ");
			num1 = sc.nextInt();
			System.out.print("열 크기 : ");
			num2 = sc.nextInt();

			if (1 <= num1 && num1 <= 10 && 1 <= num2 && num2 <= 10) {
				break;
			} else {
				System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다");
				System.out.println();

			}
		}
		char ar[][] = new char[num1][num2];

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				ar[i][j] = (char) (rd.nextInt(26) + 65);

				System.out.print(ar[i][j] + " ");

			}
			System.out.println();

		}

	}
}
