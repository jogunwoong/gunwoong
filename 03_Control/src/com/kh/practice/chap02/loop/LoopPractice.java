package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 :" );
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력해주세요 :");
		}else {
			for(int i=1; i<num; i++) {
				System.out.print(i);
				if(i !=num) {
					System.out.print("  ");
					
				}
			}
			
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int Num = sc.nextInt();
			
			if (Num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}else {
				for (int i=1; i<=Num; i++) {
					System.out.print(i);
					if(i !=Num);
						System.out.print("   ");
						
					}
				}
				break;
			}
			
		}
		
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("첫 번째 숫자: ");
			int Num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자: ");
			int Num2 = sc.nextInt();
			if (Num1<1||Num2<1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}else {
				int min = Num1 < Num2 ? Num1: Num2;
				int max = Num1 < Num2 ? Num2: Num1;
				
				for (int i =min; i<=max; i++) {
					System.out.print(i);
					if(i != max) {
						System.out.print("  ");
						
					}
									}
			
					
					
					
				
			}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		System.out.println("====="+num+"단=====");
		
		for (int i=1; i<10 ; i++) {
		System.out.println(num+" * "+i+" = "+(num*i) );
		}
		
		
		
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("공차: ");
		int num2 = sc.nextInt();
		
			// i += num2 => i = i + num2
		for(int i=1;i<11;i++) {
		System.out.print(num1+(i-1)*num2);	
		if(i!=10) {
			System.out.print(" ");
		}
		}
		}
		
		
		
		
	
			
		
			
			
			
			
			
			
			
			
		
			
			
		}
			
			
		
	
	

	


