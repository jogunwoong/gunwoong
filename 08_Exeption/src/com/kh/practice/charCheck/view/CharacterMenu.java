package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		try {
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		int count = cc.countAlpha(str);
		System.out.printf("'%s'에 포함된 영문자 개수: %d\n" , str , count);
		
		}catch(CharCheckException e) {
			
			e.printStackTrace();
			
			
		}
		
		
	}
	

}
