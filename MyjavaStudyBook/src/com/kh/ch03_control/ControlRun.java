package com.kh.ch03_control;

import java.util.Scanner;

public class ControlRun {

	public static void main(String[] args) {
		/*
		 * *프로그램의 진행은 순차넉으로 진행됨 (위에서 아래로, 왼쪽에서 오른쪽의로) 이 흐름을 바꾸고자 할 때 제어문을 통해 직접 제어 가능
		 * 
		 * - 선택적으로 실행시키고자 할 때 => 조건문 - 반복적으로 실행시키고자 할 때 => 반복문 - 그 외의 흐름 제어 => 분기문
		 * 
		 * * 조건문 : 조건식을 통해 참/거짓에 따라 코드를 실행 -종류 [1]if문 [2]switch문
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.print("숫자입력 : "); int num = sc.nextInt();
		 * 
		 * // 입력된 값이 양수인지 양수가 아닌지 판별 if (num > 0) {//조건식의 결과가 참인경우 if 중괄호 안의 코드 실행
		 * System.out.println(num + "의 값은 양수다."); }else {//조건식의 결과가 거짓인 경우 else중괄호 안의 코드
		 * 실행 System.out.println(num + "의 값은 양수 아니다.");
		 * 
		 * }
		 * 
		 *
		 * System.out.print("나이 입력 : "); int age = sc.nextInt(); if (age > 0) { if (age
		 * <= 13) { System.out.println("어린이"); } else if (age <= 19) {
		 * System.out.println("청소년"); } else { System.out.println("성인"); } } else {
		 * System.out.println("잘못 입력하셨습니다."); }
		 */

		/*
		 * 사용자에게 구매할 과일을 입력받아, 가격을 출력하기 - 수박 : 15000 - 참외 : 5000 - 복숭아 : 10000
		 * 
		 *
		System.out.print("구매할 과일을 입력 (수박/참외/복숭아) : ");
		String fruit = sc.next();
		
		switch(fruit) {
		
		case "수박":
			System.out.println("수박 15000원");
			break;
		case "참외":
			System.out.println("참외 5000원");
			break;
		case "복숭아":
			System.out.println("복숭아 10000원");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		
		*/
		/*
		 * *반복문 : 어떤 코드를 반복적으로 실행
		 * -종류
		 * 	[1]for 문
		 * 	[2]while 문
		 * 
		 * 
		 * 	for (초기식;조건식;증감식;){//반복횟수 설정
		 * 		//반복적으로 실행할 코드 작성
		 * }
		 * 
		 * 		-초기식 : 처음 한번만 실행
		 * 				=>반복문 안에서 사용될 변수를 선언 및 초기화
		 * 		-조건식 : 반복문이 수행 될 도건
		 * 				=>조건식의 결과가 참일 때 코드 실행
		 * 				  조건식의 결과가 거짓일 때 반복문 종료
		 * 				=>보통 초기식에 선언된 변수로 조건식을 작성
		 * 		-증감식 : 반복문을 제어하는 변수의 값을 증가,감소
		 * 				=>보통 초기식에 선언된 변수로 증감연산자(++, --)를 사용
		 * 
		 */
		//2 ~ 9 사이의 랜덤값을 뽑아 X단 출력하기
		int dan = (int)(Math.random()*(9-2+1)+2);
		/*for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n",dan,i,(dan*i));
			
		}*/
		//랜덤값을 기준으로 아래와 같이 출력해보기. (ex dan ==4
		//1***
		//*2**
		//**3*
		//***4
		/*for(int i = 0; i <= dan; i++) {
			for(int j = 0; j <= dan; j++) {
				if (i == j)System.out.print(i+1);
				else System.out.print('*');
			}System.out.println();
		}
		*/
		//---------------------------
		/*
		 * 		while(조건식){
		 * 			반복실행할 코드
		 * 			[증감식]
		 * 		}
		 */
		//위의 랜덤 구구단 while로 출력
		int i = 1;
		while(i<10) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			i++;
			
		}
		/*
		 * do {		//무조건 1회 실행한 후 조건식의 결과를 확인하여 반복 수행
		 * 반복 실행할 코드
		 * }while(조건식);
		 */
		/*int num2 = 1;
		do {
			System.out.println(num2);
		*}while(num2 == 0);
		// ----------------------------------------------------
		/*
		 * 분기문
		 * 		continue; : 코드 실행하다가 이 분기문을 만나면 다음 분기로 넘김
		 * 
		 * 		break; 	  : 반복문을 강제로 탈출 (종료)
		 * 				   switch문 안의 break는 switch만 빠져나감!
		 * 
		 */
		//1~10 사이의 홀수만 출력 ==> continue;
		for(int k = 1; k<=10; k++) {
			if(k%2 == 0) {
				continue;
			}	System.out.println(k);
		}
		//반복적으로 랜덤값을 추출 후 출력 단 3의 배수인 경우 반복문 종료
		for(int t = 0; t > 0;t++) {
			if(dan%3 == 0) {
				
				System.out.println(dan);
				break;
			}
				
		}
				
				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
