package com.kh.practice1.func;

import java.util.Random;

public class Test35 {
	public static void main(String []args) {
		
		
		//	(int) Math.random()*10+1
		int [] ar = new int [10];
		
		Random rd = new Random();
		
		for(int i = 0; i <ar.length ; i++) {
			ar[i] = rd.nextInt(10) + 1;
			System.out.print(ar[i] + " ");
			
		}
		
	}
}
