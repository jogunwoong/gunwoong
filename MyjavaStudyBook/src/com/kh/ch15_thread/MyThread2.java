package com.kh.ch15_thread;

import java.util.Date;

/*
 * 스레드 정의방법 2. Runnable 인터페이스 구현
 *  = 클래스간에는 단일상속만 가능하므로, 다른 클래스의 상속을 받아야할 경우
 *  		이 방법으로 스레드를 구성할 수 있음
 */
public class MyThread2 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i = 0; i<10;i++) {
			System.out.println(name + " : " + new Date().getTime());
			//3초간 재우기..Thread.sleep(millis)
			try {
				Thread.sleep(1*1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(name + "------End------");
		
	}

}
