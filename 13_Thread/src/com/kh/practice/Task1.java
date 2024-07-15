package com.kh.practice;

//Thread 정의 방법 1 ) Thread 클래스 상속
public class Task1 extends Thread {

	// 2) 이 Thread에서 실행시킬 작업을 run메소드에 정의
	@Override
	public void run() {
		String hello = "Hello, World!";
		String name = Thread.currentThread().getName();
		
		System.out.println(name + ":" + hello);
		
		super.run();
	}

}
