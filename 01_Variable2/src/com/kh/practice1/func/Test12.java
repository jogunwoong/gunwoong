package com.kh.practice1.func;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;
		while (true) {
			System.out.println("1 이상의 숫자를 입력하세요. : ");
			num = sc.nextInt();
			
			if(num >=1) {
				
				for(int i = 1; i <= num ; i++) {
					System.out.println(i + " ");
					
				}
				System.out.println();
				break;
			}else {
				
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
			
		}
	}

}
