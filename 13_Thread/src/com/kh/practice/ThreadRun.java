package com.kh.practice;

public class ThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Thread : 프로세스(실행중인 프로그램)내에서 가지고 있는 최소 작업 단위
		 *  
		 *  
		 */
		//task1 객체생성
		Task1 t1 = new Task1();
		Task2 task = new Task2();
		
		Thread t2 = new Thread(task); 
		
		t1.start();		//Thread 실행 : start()
		t2.start();
		
		System.out.println("=====" + Thread.currentThread().getName() + "=====");

	}

}
