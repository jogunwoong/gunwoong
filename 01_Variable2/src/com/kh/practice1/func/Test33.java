package com.kh.practice1.func;

import java.util.Scanner;

public class Test33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.next();

		String ar[] = { "양념", "간장", "후라이드" };

		switch (chicken) {

		case "양념":
			System.out.print(chicken + "치킨 배달 가능");
			break;
		case "간장":
			System.out.print(chicken + "치킨 배달 가능");
			break;
		case "후라이드":
			System.out.print(chicken + "치킨 배달 가능");
			break;
		default:
			System.out.print(chicken + "치킨은 없는 메뉴 입니다.");
			return;

		}

	}

}
