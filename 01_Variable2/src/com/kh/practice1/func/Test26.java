package com.kh.practice1.func;

public class Test26 {
	
	public static void main(String []args) {
		
		int [] ar = new int[10];
		
		for (int i = 0; i < ar.length; i++) {
			
			ar[i] = ar.length - i;
			
			System.out.print(ar[i] );
			System.out.print(" ");
		}
		
	}

}
