package com.kh.practice1.func;

import java.util.Scanner;

public class Test42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("행의크기 : ");
		int row = sc.nextInt();

		char cu = 'a';

		char[][] ar = new char[row][];

		for (int i = 0; i < row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int col = sc.nextInt();
			ar[i] = new char[col];

			for (int j = 0; j < col; j++) {
				ar[i][j] = cu;
				cu++;
				if (cu > 'z') {
					cu = 'a';

				}

			}
		}
		for(int i = 0; i< row; i++) {
			for(int j = 0; j <ar[i].length;j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}
