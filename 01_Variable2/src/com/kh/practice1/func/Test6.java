package com.kh.practice1.func;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("키(m)를 입력해 주세요 : ");
		Double tall = sc.nextDouble();
		System.out.println("몸무게(kg)을 입력해 주세요 : ");
		Double kg = sc.nextDouble();

		Double bmi = kg / (tall * tall);

		System.out.println("BMI지수 : " + bmi);

		if (18.5 > bmi) {
			System.out.println("저체중");
		} else if (23 > bmi) {
			System.out.println("정상체중");
		} else if (25 > bmi) {
			System.out.println("과체중");
		} else if (30 > bmi) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");

		}
		sc.close();
	}

}
