package com.kh.practice;

import java.util.Scanner;

public class ControlPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		String idNum = sc.nextLine();
		
		if(idNum.length() != 14) {
			System.out.println("잘못 입력되었습니다.");
		} else {
			
			char genNum = idNum.charAt(7);
			if (genNum == '1' || genNum =='3') {
				System.out.println("남자 입니다.");
			}else if (genNum == '2' || genNum=='4') {
				System.out.println("여자입니다,");
			}
		}
		
		System.out.print("월을 입력해주세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("마지막 날은 31일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		
			System.out.println("마지막 날은 30일 입니다.");
			break;
			
		case 2:
			System.out.println("마지막 날은 29일 입니다.");
			break;
			
			default :
				
				System.out.println("잘못 입력 되었습니다");
				
			
		}
		
	}
	
	
}


