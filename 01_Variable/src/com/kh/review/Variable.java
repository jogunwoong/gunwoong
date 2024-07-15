package com.kh.review;

public class Variable {
	
	public static void main (String[] args ) {
		
		printVariable();
		
	}
	
	public static void printVariable() {
		
	}
	
		
	public static void declareVariable() {
		
		/*변수의 선언 :값을 기록하기 위한 변수를 메모리 공간에 할당 확보
		 * 
		 * [표현법]
		 * 			자료형 변수명;
		 * 
		 * - 자료형 : 변수의 크키 및 모양을 지정하는 부분
		 * - 변수명 : 변수의 이름을 부여하는 부분 ( 의미부여 !)
		 * 
		 * 	명명규칙
		 * 		[1] 카멜케이스 : 소문자로 시작하고, 다른 담ㄴ어가 붙을땐 대문자로 시작
		 * 			=>클래스명의 경우 : 대문자로 시작하도록 지어줌.
		 * 		[2] 대소문자를 구분함
		 * 		[3] 숫자로 시작하면 안 됨,예약어 사용 불가
		 * 		[4]특수문자는 '$'또는 '_'만 가능
		 * 
		 * 	주의사항
		 * 		-같은 영역 안({}) 에서는 동일한 변수명으로 선언 불가(중복불가)
		 * 		- 해당역역 안({}) 에서 선언된 변수는 그 영역 안에서만 사용 가능
		 * 			=>다른 영역에서는 사용불가!
		 */
		 
		 // 1.논리형 (boolean).논리값 ( true/false) 1byte
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("isFalse의 값 : " + isFalse);
		
		isTrue = 1 + 3 > 1;
		isFalse = 2 * 3 < 0;
		//---------------------------------------------------
		//2.숫자형 (정수/실수)
		//2-1. 정수형 (소숫점 x . 딱 떨어지는 수)
		//			byte (1B) / short(2B) / int (4B) / long (8B)
		byte bNum;		//1byte (-128 ~ 127)
		bNum = -128;
		
		//bNum = 1000;	//범위를 벗어나면 오류 발생! (byte현) = (int형)
		
		//2-2. 실수형 (소숫점 o)
		//	float (4ㅠ) / double (8B)
		
		
		float fNum = 0.0f;//0.0값을 저장
						  //소숫점 7자리 까지 표현 가능
						  //값 자체 ( 리터럴) 를 지정할 때 닶 뒤에 f를 붙여줌
		double dNum = 0;  //소수점 15자리까지 표현 가능. 실수형의 기본 자료형
		
		//-----------------------------------------------------
		//3.문자형(char / String)
		//3-1. answk
		char ch = 'a';			//2B(byte)
		char kim;
		kim = '김';
			
		//3-2. 문자열
		String str;				//참조형( 잠초자료형)
		str = "aaa";
	
		
		//---------------------------------------------------
		//상수 : 변하지 않는 값을 저장하는 공간
		// [표현봅] final 자료형 상수명;
		final int AGE;		//명명규착 : 대문자만 사용, 단어 사이는 '_' 구분
		AGE = 10;
		// AGE=20; 			//값이 한 번 저장된 이후에, 변경이 불가능;
		
		System.out.println("Math,PI의 값 : " + Math.PI);
		//참고
		int temp = 999_999_999; //가독성을 위해 3자리마다 _언더바 표시 가능
		
		
		
	}
	
	public void method1() {
		int num = 100;
	}
	

}
