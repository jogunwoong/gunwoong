package com.kh.practice1.func;

import java.util.Scanner;

public class Test27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int [] ar = new int [num];
		
		for (int i = 0; i < ar.length; i++) {
		
		ar[i] = i+1;
		
		System.out.print(ar[i] + " ");
		
		}
	}

}
