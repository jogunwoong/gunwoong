package com.kh.practice1.func;

import java.util.Scanner;

public class Test32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();
		int ar[] = new int[num];

		if (num > 3 && num % 2 == 1) {

			for (int i = 0; i <= num / 2; i++) {
				ar[i] = i + 1;

			}
			for (int i = num / 2 + 1; i < num; i++) {
				ar[i] = num - i;

			}
			for(int i = 0; i< num; i++) {
				if ( i == num - 1) {
					System.out.print(ar[i]);
				}else {
					System.out.print(ar[i]  + ", ");
				}
			}

		} else {
			System.out.print("다시 입력하세요.");
			return;
		}
	}
}
