package com.kh.practice1.func;

import java.util.Scanner;

public class Test34 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 (-포함) :"); 
		String id = sc.next();
		
		char[] idAr = new char[id.length()];
		for(int i = 0; i < id.length();i++) {
			idAr[i] = id.charAt(i);
		}
		char[] idArc = new char[idAr.length];
		for(int i = 0; i < idAr.length;i++) {
			idArc[i] = idAr[i];
			
		}
		for(int i = 8; i < idArc.length; i++) {
			idArc[i] = '*';
		}
		for(char c : idArc) {
			System.out.print(c);
		}
		
		
	
		
		
		
		
		
	}
	
}
