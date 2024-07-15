package com.kh.practice.chap02;

public class Practice {

	public void method1() {

		for (int i = 1; i < 11; i++) {
			System.out.print(i);
			if (i != 10) {
				System.out.println("  ");

			}
		}
		System.out.println("\n------------");

		for (int i = 10; i > 0; i--) {
			System.out.print(i);
			if (i != 1) {
				System.out.print(" ");
			}
		}
	}

	public void method2() {

		int total = 0;
		for (int i = 1; i < 10; i++) {

			total += i;
		}
		System.out.print("1부터 10까지 총 합 : " + total);

	}

	// (int)math.random() * 10+1
	public void method3() {
			int random = (int)(Math.random()*10 + 1);
			System.out.println("랜덤값은 " +random + "입니다" );
			
			int total=0;
			for(int i=1; i<=random; i++) {
				total += i;
			}
	}
	public void method4() {
		
		while(true) {
		int random = (int)(Math.random()*100 + 1);
		if (random % 2 == 0) {
			System.out.println("ㅋ" + random);
			break;
		}else {
			System.out.println(random);
		}
		}
		
		
		
	}
	public void method5() {
		
		
	}
			
			
			
		}



