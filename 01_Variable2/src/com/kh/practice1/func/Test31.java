package com.kh.practice1.func;

import java.util.Scanner;

public class Test31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();
		int ar[] = new int[num];

		/* ============================================== */
		for (int i = 0; i <= num - 1; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			ar[i] = sc.nextInt();

			/* ============================================== */

		}
		int total = 0;
		for (int i = 0; i < num; i++) {
			System.out.print(ar[i] + " ");
			total += ar[i]; // total = total + ar[i];
		}
		System.out.println();
		System.out.print("총합 : "+total);
		/*
		int total = 0;
		for(int i = 0; i <=10; i++) {
			total += (i+1);
			
		}
		*/
		
	}

}
