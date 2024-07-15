package com.kh.practice;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		String data = "name:Hong,phone:010-1234-5678,address:gangnam,email:hong@Gmailcom"

		;
		String[] dArr = new String[10];

		StringTokenizer st = new StringTokenizer(data, ", ");
		while (st.hasMoreTokens()) {
			String keyValue = st.nextToken();

			int index = 0;
			int count = 0;
			StringTokenizer st2 = new StringTokenizer(keyValue, ":");
			while (st2.hasMoreTokens()) {
				if (count % 2 != 0) {
					dArr[index++] = st.nextToken();
				} else {
					st2.nextToken();
					count++;
				}

			}
		}

		System.out.printf("이름은%s이고, 연락처는%s이고, 즈소는%s이고, 이메일은%s입니다.\n", dArr[1], dArr[3], dArr[5], dArr[7]);

	}

	public static void text1() {

		// StringTokenizer : 문자열 내에 특정 구분자로 나눠주는 클래스(토큰화)

		String msg = "안녕하세요|나는 조건웅입니다|반갑습니다";

		String[] arr = new String[3];

		StringTokenizer st = new StringTokenizer(msg, "|");

		int index = 0;

		// 토큰화 가능 여부 체크: 변수명.hasMoreTokens()
		while (st.hasMoreTokens()) {
			// 기준 문자열로 분리하여 데이터를 가져오고자 할 대 : 변수명.nextToken():String

			arr[index++] = st.nextToken();

			System.out.println(arr[index]);

			index++;

		}

	}
}