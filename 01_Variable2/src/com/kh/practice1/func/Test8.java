package com.kh.practice1.func;

import java.util.Scanner;

public class Test8 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("중간 고사 점수 : ");
		int num1 = sc.nextInt();
		System.out.println("기말 고사 점수 : ");
		int num2 = sc.nextInt();
		System.out.println("과제 점수 : ");
		int num3 = sc.nextInt();
		System.out.println("출석 회수 : ");
		int num4 = sc.nextInt();
		
		Double aNum1 = num1*0.2;
		Double aNum2 = num2*0.3;
		Double aNum3 = num3*0.3;
		Double cNum1 = aNum1 + aNum2 + aNum3 + num4;
		Double cNum4 = (double) num4; 
		
		
		
		System.out.println("======결과======");
		System.out.println("중간 고사 점수 (20) : " + aNum1);
		System.out.println("기말 고사 점수 (30) : " + aNum2);
		System.out.println("과제 점수 (30)" + aNum3);
		System.out.println("출석 점수 (20): " + cNum4);
		System.out.println("총점 : " + cNum1);
		
		if(14>cNum4) {
			System.out.println("FAIL[출석 회수 부족 (" + cNum4 + "/20]");
		}else if(70<=cNum1) {
			System.out.println("PASS");
		}else if(70>cNum1){
			System.out.println("FAIL[점수미달]");
		}else {
			return;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
