package com.kh.practice.test2;

public class Task2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		// 1~30까지 홀수만 출력
		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

			// 0.1초 재우기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
