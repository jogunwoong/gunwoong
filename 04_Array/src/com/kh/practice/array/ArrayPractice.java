package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// 1. 길이가 10인 배열 선언 (1부터 10까지의 값을 저장 =>int)
		int[] arr = new int[10];

		// 2. 반복문을 사용하여 배열 인덱스에 그 값을 저장
		for (int i = 1; i <= 10; i++) {
			// 인덱스 시작번호 : 0
			arr[i - 1] = i; // i-1 위치에 i 값을 저장
		}

		for (int i = 0; i < 10; i++) {

			arr[i] = i + 1;
		}

		// 3. 반복문을 사용허여 각 인덱스의 값을 출력
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]);
			if (i != 10) {
				System.out.print(" ");
			}
		}
	}

	public void practice2() {
		int[] arr = new int[10];

		// 값을 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			// System.out.printf("i=%d) arr[i]=%d\n"), i, arr[i);
		}

		// 출력
		// 배열명.length : 배열의 길이
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print("  ");

			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력하세요 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = i + 1;

		}

		for (int i = 0; i < num; i++) {
			System.out.print(arr[i]);

			if (i != num - 1) {
				System.out.print("  ");

			}
		}
	}

	public void practice4() {

		String[] ar = new String[5];
		ar[0] = "사과";
		ar[1] = "귤";
		ar[2] = "포도";
		ar[3] = "복숭아";
		ar[4] = "참외";

		System.out.print(ar[1]);

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		char[] arrch = new char[str.length()];
		for (int i = 0; i < arrch.length; i++) {
			arrch[i] = str.charAt(i);

		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) :", str, ch);
		int cnt = 0;
		for (int i = 0; i < arrch.length; i++) {
			if (arrch[i] == ch) {
				cnt++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(ch + "의 개수" + cnt);

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };
		if (num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(arr[num] + "요일");
		}

	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int ar[] = new int[num];
		for (int i = 0; i < ar.length; i++) {

			System.out.print("배열" + i + "번째 인덱스에 넣을 값 :");
			ar[i] = sc.nextInt();
		}
		int total = 0;
		for (int i = 0; i < ar.length; i++) {
			total += ar[i];

			System.out.print(ar[i] + " ");
		}
		System.out.print("\n총합: " + total);
	}

	
	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

	
		for (;;) {
			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력 하세요.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			} else {
				break;
			}
		}
		int ar[] = new int[num];
		for (int i = 0; i < num; i++) {
			if (num / 2 >= i) {
				ar[i] = i + 1;
			} else {
				ar[i] = ar[i - 1] - 1;

			}

		}
		for (int i = 0; i < num; i++) {
			System.out.print(ar[i] + " ");
		}
	}
	 

	public void practice() {
		Scanner sc = new Scanner(System.in);

		// 3 이상의 홀수 입력 받기
		int num = 0;
		while (num <= 2 || num % 2 == 0) {
			System.out.print("3 이상의 홀수를 입력하세요: ");
			num = sc.nextInt();

			if (num <= 2 || num % 2 == 0) {
				System.out.println("다시 입력하세요.");
			}
		}

		// 배열 생성 및 초기화
		int[] arr = new int[num];
		int mid = num / 2;

		// 오름차순으로 값 넣기
		for (int i = 0; i < mid; i++) {
			arr[i] = i + 1;
		}

		// 내림차순으로 값 넣기
		for (int i = mid; i < num; i++) {
			arr[i] = num - i;
		}

		// 배열 출력
		System.out.print("배열 내용: ");
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름 : ");
		String name = sc.next();

		String[] ar = { "양념", "간장", "후라이드" };
		for (int i = 0; i < ar.length; i++) {

			if (ar[i].equals(name)) {
				System.out.printf("%s치킨 배달 가능", name);
			} else {
				System.out.printf("%s치킨은 없는 메뉴입니다.", name);
			}
			break;
		}
	}
	public void practice13() {
		
		int[]ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int)(Math.random() * 10 + 1);
			
			}
		for(int i = 0; i < ar.length; i++) {
			System.out
		}
		
		
	}
}
	

				
			
				
			
		
		
		
			
	

	




