package com.kh.ch01_variable;

public class VariableRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * * 변수를 사용하는 이유 1)값에 의미를 부여하기 위해 사용(가독성이 높아짐) 2)한번 값을 기록하고 필요할 때마다 사용(재사용성이
		 * 높아짐) 3)유지보수를 보다 쉽게 할 수 있음) -------------------------------- * 변수의 선언:값을 기록하기
		 * 위한 변수를 메모리 공간에 확보(할당)하는 것
		 * 
		 * [표현법] 자료형 변수이름; * 자료형 : 변수의 크기와 모양을 지정하는 부분 * 변수이름 : 변수의 이름을 붙여주는 부분 -변수 선언시
		 * 주의할 점 1)변수의 이름은 소문자로 시작(낙타표기법을 지켜야 함.예약어 사용 불가) 2)같은 영역 안({}) 에서는 동일한 이름으로 선언
		 * 불가 변수명 중복x 3)해당 영역 한({}) 에 선언된 변수는 그 영역 안에서만 사용 가능
		 */
		// ---자료형 종류---
		// 1.논리형 (논리값 - true/false),1byte 크기,boolean
		boolean isTrue; // 변수 선언
		boolean isFalse = false; // 선언과 동시에 초기화

		isTrue = 1 + 3 > 0;// 어떤 연산의 결과가 true 또는 false인 경우 연산 결과 값을 저장할 수 있음

		// 2.정수형 (소숫점 x)
		byte bNum; // 1byte 크기 -128 ~ 127
		bNum = -128;

		short sNum = 1000; // 2byte 크기.

		int iNum = 10000; // 4byte 크기. 정수형 기본 자료형

		long lNum = 100000; // 8byte 크기.

		// 3.실수형
		float fNum = 0.0f; // 4byte 크기. 소숫점 7자리까지 표현 가능.
							// double형과 구분하기 위해 값 뒤에 f 붙여줌.
		double dNum = 0.0; // 8byte 크기. 소숫점 15 자리까지 표현 가능.
							// 실수형 기본 자료형.

		// 4.문자형 : 한 글자에 값만 저장할 수 있는 자료형. 작은 따옴표(' ') 로 값을 표현.
		char ch = 'a'; // 2byte 크기.
		char hong;
		hong = '홍';
		// => 컴퓨터는 바보다 각각의 문자들에 대한 고유헌 숫자를 가지고 있음 (asciicode/unicode)

		// 5.문자열 : 한글자,여러글자 다 저장가능. 큰 따옴표(" ")로 값을 표현.
		String str; // 참조 자료형
		str = "안녕?";

		// TODO: 저장된 값을 콘솔창에 출력해보자! "변수명 : 저장된 값" 형식으로 출력)

		System.out.println("isTrue : " + isTrue);
		System.out.println("iNum : " + iNum);
		System.out.println("dNum : " + dNum);
		System.out.println("hong : " + hong);
		System.out.println("str : " + str);

		// ---------------------
		/*
		 * 상수: 변하지 않는 수(값)
		 * 
		 * [표현법] final 자료형 상수이름;
		 */
		final int MAX_SIZE; // 대문자만 사용,단어사이는 언더바로 구분
		MAX_SIZE = 1024;
		// MAXSIZE = 1024 * 10; 한번 저장을 하면 변경이 불가능

		System.out.println("MAX_SIZE : " + MAX_SIZE);

		/*--------------------------------------
		 * 
		 * *형변환 : 값의 자료형을 바꾸는 것
		 * 
		 * *컴퓨터에서의 처리(연산) 규칙(-->형변환이 필요한 상황)
		 * 1)대입 연산자 기준 왼쪽과 오른쪽이 같은 자료형이여야 함;
		 * 	=>같은 자료형의 변수에 해당하는 값을 대입해야 함
		 * 	=>다른 자료형의 값을 대입하고자 한다면, 형변환이 필요함
		 * 
		 * 		자료형 변수명 = (자료형)값;
		 * 		int num = (int)3.14;
		 * 2)같은 자료형끼리만 연산 가능
		 * 		값 + 값 //두개의 값이 모두 같은 자료형 이어야 함!
		 * 
		 * *형변환의 종류
		 * 1)자동 형변환		=>자동으로 형변환이 진행됨
		 * 					=>값의 범위가 작은 자료형과 큰 자료형의 연산 시
		 * 						작은 자료형의 값이 큰 자료형으로 자동으로 변환된 후
		 * 						연산이 수행됨
		 * 
		 * 2)강제(명시적) 형변환	=>자동 형변환이 되지 않는 경우 직접 형변환 시켜줘야함
		 * 	(바꿀 자료형)값/변수;
		 */
		// int(4byte) --> double(8byte) : 자동형변환이 일어날 것!
		int i1 = 11;
		double d1 = i1; // 11.0
		System.out.println("d1 : " + d1);

		int i2 = 10;
		double d2 = 5.5;

		double r1 = i2 + d2;
		System.out.println("r1 : " + r1);
		
		//float(4byte) --> double(8byte) : 자동 형변환
		float f1 = 10.05f;
		double d3 = f1;
		System.out.println("d3 : " + d3);
		
		//long(8byte) --> float(4byte) : 자동 형변환
		//long 자료형이 크다고 볼수 있으나,
		//실수형인 float 자료형에 담을 수 있는 값의 범위가 더 크기 때문에
		//자동형변환이 진행됨
		long l1 = 1000000L;
		float f2 = l1;
		System.out.println("f2 : " + f2);
		// = > float 자료형에는 매우 큰 수나 작은 수의 경우 대략적으로 표현 될 수 있음!
		double d4 = l1;
		System.out.println("d4 : " + d4);
		
		// char (2byte) <--> int(4byte)
		int i3 = 95;
		char c1 = (char)i3;		//int -> char : 강제 형변환
		System.out.println("c1 : " + c1);
		
		int i4 = 'S';
		System.out.println("i4 : " + i4);
		//char 의 경우 음수갑 저장 x 가지고있는 수의 범위가 0~ 65535.
		//char c2 = 10 x
		char c2 = 12345;
		System.out.println("c2 : " + c2);
		
		System.out.println((int)'조' + " " + (int)'건' + " " + (int)'웅');
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
