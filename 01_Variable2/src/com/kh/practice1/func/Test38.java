package com.kh.practice1.func;

public class Test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][]arr = new String [3][3];

		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length;j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

}
