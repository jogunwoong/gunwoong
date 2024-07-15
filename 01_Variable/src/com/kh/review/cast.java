package com.kh.review;

public class cast {
	/*
	 * *형변환 : 자료형을 바꾸는 것.
	 * 
	 * *컴푸터에서의 값 처리 규칙(형변환이 필요한 상황)
	 * 1) 대입 연산자 : 왼쪽과 오른쪽이 같은 자료형 이어야 함.
	 * 	=>다른 자료형의 값을 대입 하고자 한다면 형변환이 필수!
	 * 
	 * 		자료형의 변수명 = (자료형)값;
	 * 
	 * 2) 같은 자료형 끼리만 연산이 가능
	 * 			
	 * 		값1 +값2 => 값1,값2 모두 같은 자료형 이어야 함.
	 * 					결과값도 같은 자료형 이어야 함.
	 */
	public static void main(String[] args) {
		//toCasting();
		
		forceCasting();
	}
	
	public static void autoCasting() {
		/*
		 * *자동 현변환
		 * 	- 값의 범위 작은 자료형에서 큰 자료형으로 자동 형변환
		 * 
		 */
		
		int i1 = 12;
		double d1 = i1;		// int (4byte) => double (8bute)
							//12=> 12.0
		
		int i2 = 15;
		double d2 = 3.3;
		
		double result = i2 + d2;  // i2 => int -> double
								  //		15 ->  15.0
		
	}
	
	public static void forceCasting() {
		
		//강제 형변환
		double d1 = 4.0;
		int i1 = 50;
		
		int result = (int) (i1 + d1);
		// 강제형변환 시 데이터 손실이 발생할 수 있음!
		int iNum = 290;
		byte bNum = (byte)iNum;		//byte 범위 - 128 ~ 127
		
		System.out.println("bNum의 값은 : " + bNum); // 출력값 : 34
		
		
		
	}

}
