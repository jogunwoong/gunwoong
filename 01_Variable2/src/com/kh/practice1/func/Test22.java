package com.kh.practice1.func;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = i ; j < num; j++ ) {
				
				
			System.out.print(" ");
			}for(int j = 0 ; j < i * 2 + 1; j++) {
				
			System.out.print("*");
			}
			System.out.println("");
		}
	
			
			}
		
		
	
}
