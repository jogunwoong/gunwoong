package com.kh;

public class VariablePractice0 {
	
	public static void main(String[] args) {
		/*
		 *예제1) 변수를 사용하여 아래 코드를 이해하기 쉽도록 변경해보기
		 * - 연도에 해당하는 값을 정수형(int) 타입의 year 이름의 변수로 선언
		 * -현재 연도를 year 변수에 대입
		 * 
		 *-나이에 해당하는 값을 정수형(int) 타입의 age이름의 변수로 선언 및 대입
		 */
		//변수를 사용하지 않은경우
	System.out.println("[1]현재 2024년이고, 올해 20살 입니다.");
	
	//변수 선언및 대입
	int year;		//정수형 변수 year이라는 이름으로 선언
	year = 2024;	//year 변수에 2024라는 값을 대입
	
	int age = 20;	//정수형 변수 age라는 이름으로 선언 및 20이라는 값을 대입
	
	//변수를 사용하여 화면에 출력 (println / printf 사용)
	System.out.println("[2] 현재 " + year + "년이고, 올해 " + age +"살입니다.");
	System.out.printf("[3] 현재 %d년이고, 올해 %d살입니다.\n", year, age);
	
	final int Limit_weight = 80;
	System.out.println("몸무게가" + Limit_weight + "kg 이상인 경우 탑승을 못 합니다.");
	
	
	/*형변환: 연슨을 할 떄 자료형의 종류가 다른 경우 형변환이 발생한다
	 * -자동형변환 규칙
	 * [1] 값의 범위가 작은 범위에서 큰 범위로 형변환 발생
	 * [2]정수형과 실수형의 연산 시에는 정수형에서 실수형으로 형변환 발생
	 * 
	 */
	int num1 = 10;
	double dNum1 = 5.5;
	
	// num1 변수가 자동형변환이 발생(int-> double)
	
	System.out.println(num1 + dNum1);
	
	System.out.println(num1 + (int)dNum1);
	
	// char <--> int
	char ch = 'A';
	System.out.println(ch);
	
	System.out.println((int)ch);
	
	System.out.println(ch + 3);
	
	System.out.println((char)(ch + 3));
	
}

}
