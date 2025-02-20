package com.kh.practice1.func;

import java.util.Scanner;

public class Test43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] firstGroup = new String[3][2];
		String[][] secondGroup = new String[3][2];

		for (int i = 0; i < students.length; i++) {
			if (i < 6) {
				firstGroup[i / 2][i % 2] = students[i];
			} else {
				secondGroup[(i - 6) / 2][(i - 6) % 2] = students[i];

			}
		}
		System.out.println("===1분단===");
		for (int i = 0; i < firstGroup.length; i++) {
			for (int j = 0; j < firstGroup[i].length; j++) {
				System.out.print(firstGroup[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===2분단===");
		for (int i = 0; i < secondGroup.length; i++) {
			for (int j = 0; j < secondGroup[i].length; j++) {
				System.out.print(secondGroup[i][j] + " ");
			}
			System.out.println();

		}
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();

		boolean found = false;

		for (int i = 0; i < firstGroup.length; i++) {
			for (int j = 0; j < firstGroup[i].length; j++) {
				if (firstGroup[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다.%n", name, i + 1, j == 0 ? "왼쪽" : "오른쪽");
					found = true;
					break;
				}

			}
			if (found)
				break;
		}
		for (int i = 0; i < secondGroup.length; i++) {
			for (int j = 0; j < secondGroup[i].length; j++) {
				if (secondGroup[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 %s에 있습니다.%n", name, i + 1, j == 0 ? "왼쪽" : "오른쪽");
					found = true;
					break;
				}

			}
			if (found)
				break;

		}
		if (!found) {
			System.out.println("해당 학생을 찾을 수 없습니다.");
		}
	}
}