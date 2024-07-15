package com.kh.practice1.func;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String pw = sc.next();

		if (id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("로그인 성공.");
		} else {
			System.out.println("로그인 실패.");
		}

	}

}
