package com.kh.practice1.func;

import java.util.Random;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = new int[10];

		Random rd = new Random();

		for (int i = 0; i < ar.length; i++) {
			if(ar[i] != ar[i]) {
			ar[i] = rd.nextInt();
			}
			System.out.println(ar[i]);
		}

	}

}
