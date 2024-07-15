package com.kh.practice1.func;

import java.util.Scanner;

public class test3 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("국어점수 : ");
		int g = sc.nextInt();
		System.out.println("수학점수 : ");
		int s = sc.nextInt();
		System.out.println("영어점수 : ");
		int y = sc.nextInt();
		
		int all = g + s + y;
		int avg = all / 3;
		
		System.out.println("합계 : " + all);
		System.out.print("평균 : " + avg);
		if (g >= 40 && s >= 40 && y >= 40 && avg >= 60) {
			System.out.println("축하합니다,합격입니다!");
			
		}else {
			System.out.println("불합격 입니다.");
		}
		
	}
	

}
