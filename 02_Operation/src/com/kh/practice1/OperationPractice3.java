package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어:  ");
		
		double 국어 = sc.nextDouble();
		
		System.out.print("영어:  ");
		
		double 영어 = sc.nextDouble();
		
		System.out.print("수학:  ");
		
		double 수학 = sc.nextDouble();
		
		System.out.println("총점: "+(국어 + 영어 + 수학));
		
		System.out.print("평균: "+(국어 + 영어 + 수학)/3);
	
		
		
		
				
		
				
		
	}

}
