package com.kh.practice1.func;

import java.util.Scanner;

public class Test10 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비밀번호 입력(1000~9999)");
		int pw = sc.nextInt();
		
		if (pw < 1000 || pw > 9999) {
			System.out.println("자리수 안 맞음");
			return;
		}
		
		int d1 = pw / 1000;
		int d2 = (pw / 100) % 10;
		int d3 = (pw / 10) % 10;
		int d4 = pw % 10;
		
		if(d1 < 1 || d1 > 9) {
			System.out.println("제일 앞자리 수의 값은 1~9 사이 정수여야 합니다.");
			return;
		}
		if ( d1 == d2 || d1 == d3 || d1 == d4||
			 d2 == d3 || d2 == d3 ||
			 d3 == d4) {
			System.out.println("중복값 있음");
		}else {
			System.out.println("생성 성공");
		}
		
		
		
		
	}

}
