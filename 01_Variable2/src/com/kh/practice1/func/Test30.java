package com.kh.practice1.func;

import java.util.Scanner;

public class Test30 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		

		String ar [] = { "월", "화", "수", "목", "금", "토", "일" };

		
		
			if(0<=num || 6>=num ) { ;
				System.out.print(ar[num]+"요일");
				
			}else {
				System.out.print("잘못 입력하셨습니다.");
			}
		
	}
}
