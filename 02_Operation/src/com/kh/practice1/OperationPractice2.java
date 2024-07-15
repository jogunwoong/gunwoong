package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		
		double d1 = sc.nextDouble();
		
		System.out.print("세로 : ");
		
		double d2 = sc.nextDouble();
		
		System.out.println("면적 : " + (d1*d2));
		
		System.out.print("둘레 : " + ((d1+d2)*2));
		
				
				
		
		
	}

}
