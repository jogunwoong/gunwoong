package com.kh.practice1.func;

import java.util.Random;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = new int [10];
		
		Random rd = new Random();
		
		int max = ar[0];
		int min = ar[0];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = rd.nextInt(10+1);
			System.out.print(ar[i] + " ");
			if(ar[i] > max) {
				max = ar[i];
			}
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println();
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
	}

}
