package com.kh.practice1.func;

public class Test39 {

	public static void main(String []args) {
		int[][] ar = new int [4][4];
		int value = 1;
		for (int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = value ++;
				System.out.print(ar[i][j] + " ");
				
			}
			System.out.println();
		}
	}
}
