package com.kh.practice1.func;

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("숫자 : ");
			int num = sc.nextInt();
			int count = 0;

			if (num > 1) {
				for (int i = 1; i <= num; i++) {

					int a = (num % i);

					if (a == 0) {
						count++;

					}

				}
				if (count < 3) {
					System.out.println("소수입니다.");
					break;
				} else {
					System.out.println("소수아닙니다.");
					break;
				}

			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;

			}
		}
	}

}
