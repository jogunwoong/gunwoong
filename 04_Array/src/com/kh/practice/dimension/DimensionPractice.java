package com.kh.practice.dimension;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {

		int[][] numbers = new int[4][4];
		int count = 1;
		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {

				numbers[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4];
		Random random = new Random();
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				arr[row][col] = random.nextInt(10) + 1;

			}
		}
		int a = arr[0][0];
		int b = arr[0][1];
		int c = arr[0][2];

		int d = arr[1][0];
		int e = arr[1][1];
		int f = arr[1][2];

		int g = arr[2][0];
		int h = arr[2][1];
		int i = arr[2][2];

		int j = (a + b + c);
		int k = (d + e + f);
		int l = (g + h + i);

		int m = (a + d + g);
		int n = (b + e + h);
		int o = (c + f + i);

		int p = (j + k + l + m + n + o);

		System.out.println(String.format("%d %d %d %d", a, b, c, j));
		System.out.println(String.format("%d %d %d %d", d, e, f, k));
		System.out.println(String.format("%d %d %d %d", g, h, i, l));
		System.out.println(String.format("%d %d %d %d", m, n, o, p));

	}

	public void practice5() {
		// 1. 사용자에게 행과 열 크기 입력 받기 (1~10 범위 제한)
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int row, col;

		System.out.print("행 크기: ");
		row = scanner.nextInt();
		while (row < 1 || row > 10) { // while 문으로 입력 범위 제한
			System.out.print("행 크기: ");
			row = scanner.nextInt();
		}

		System.out.print("열 크기: ");
		col = scanner.nextInt();
		while (col < 1 || col > 10) {
			System.out.print("열 크기: ");
			col = scanner.nextInt();
		}

		// 2. 2차원 배열 생성 및 영어 대문자 랜덤 저장
		char[][] array = new char[row][col];
		for (int row1 = 0; row1 < array.length; row1++) {
			for (int col1 = 0; col1 < array[row1].length; col1++) {
				array[row1][col1] = (char) (random.nextInt(26) + 65); // A~Z 랜덤 영어 대문자
			}
		}

		// 3. 2차원 배열 출력
		System.out.println(" ");
		for (int row1 = 0; row1 < array.length; row1++) {
			for (int col1 = 0; col1 < array[row1].length; col1++) {
				System.out.print(array[row1][col1] + " ");
			}
			System.out.println();
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 :");
		int row = sc.nextInt();
		
		char[][]arr = new char[row][];
		for (int i =0; i < row; i++) {
			System.out.print(i + 1 + "행의 열 크기");
			int col = sc.nextInt();
			arr[i] = new char[col];
			
			int index = 0;
			for (int i1 = 0; i1 <row; i1++) {
				
			}
		}
	}

}

		
		
	

			
		
			
			

		
	


	
	
	
		


