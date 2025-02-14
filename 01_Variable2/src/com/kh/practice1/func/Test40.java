package com.kh.practice1.func;

import java.util.Random;

public class Test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = new int [4][4];
		
		Random rd = new Random();
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = rd.nextInt(10) + 1; // 1~10까지의 난수 생성
            }
        }

        // 배열의 값 출력 및 각 행의 합 계산
        int[] rowSums = new int[3];
        int[] colSums = new int[3];
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += arr[i][j];
                colSums[j] += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            rowSums[i] = rowSum;
            System.out.println(rowSum);
        }

        // 마지막 행의 합, 열의 합 및 전체 합 계산
        int totalSum = 0;
        for (int i = 0; i < 3; i++) {
            totalSum += colSums[i] + rowSums[i];
        }

        // 최종 출력
        for (int colSum : colSums) {
            System.out.print(colSum + " ");
        }
        System.out.print(totalSum + " ");
        System.out.println();
	}
}
