package com.kh.practice.test2;

import com.kh.practice.udp.Task1;

public class ThreadRun {

	public static void main(String[] args) {

		Task1 t1 = new Task1();
		Task2 t2 = new Task2();

		t1.start();
		t2.start();
	}
}
