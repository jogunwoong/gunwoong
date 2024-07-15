package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("이름을 입력하세요 : ");
		
		String name = sc.next();
		
		System.out.println("성별을 입력하세요.(남/여) : ");
		
		String sex = sc.next();
		
		System.out.println("나이를 입력하세요. : ");
		
		int num = sc.nextInt();
		
		System.out.println("키를 입력하세요 : ");
		
		double tall = sc.nextDouble();
		
		System.out.println("키" + tall + "cm인" + num + "살"
				+ sex + "자" + name + "님 반갑습니다.^^");
	}

}
