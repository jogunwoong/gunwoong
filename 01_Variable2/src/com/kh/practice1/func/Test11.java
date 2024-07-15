package com.kh.practice1.func;

import java.util.Scanner;

public class Test11 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력하세요.");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for (int i = 1; i <= num; i++) {
				
			System.out.println(i +" ");
			}
		}else{
			System.out.println("1이상의 숫자를 입력해주세요.");
			
		}
		
		
	}

}
