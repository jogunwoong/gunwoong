package com.kh.practicetoken.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	private int choice;

	public void mainMenu() {

	    do {
	        System.out.println("=== 메뉴 ===");
	        System.out.println("1. 지정 문자열 토큰화");
	        System.out.println("2. 입력 문자열 토큰화");
	        System.out.println("3. 프로그램 종료");
	        System.out.print("선택: ");

	        try {
	            choice = sc.nextInt();
	        } catch (InputMismatchException e) {
	            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
	            sc.next();
	            choice = -1;
	        }

	        switch (choice) {
	            case 1:
	                tokenMenu();
	                break;
	            case 2:
	                inputMenu();
	                break;
	            case 3:
	                System.out.println("프로그램을 종료합니다.");
	                return;
	            default:
	                System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
	        }
	    } while (choice != 3);
	}


	public void tokenMenu() {
		String str = " J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String after = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + after);
		System.out.println("토큰 처리 후 글자 : " + after.length());
		System.out.println("모두 대문자로 변환 : " + after.toUpperCase());

	}

	public void inputMenu() {
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.next();
		String result = tc.firstCap(str);

		System.out.println("찾을 문자를 하나 입력하세요 : ");
		char findCh = sc.next().charAt(0);
		int count = tc.findChar(result, findCh);

	}

}
