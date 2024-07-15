package com.kh.practice1.func;

import java.util.Scanner;

public class Test5 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원등급 : ");
		String a = sc.next();
		
		if(a.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
			
		}else if(a.equals("회원")) {
			System.out.println("게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
		}else {
			System.out.println("게시글 조회");
		}
		
	}

}
