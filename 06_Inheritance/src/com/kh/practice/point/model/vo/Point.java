package com.kh.practice.point.model.vo;

public class Point {
	// 필드부
	private int x;
	private int y;

	// 생성자부
	public Point() {

	}

	// 기본생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	// 매개변수가 두개인 (모든필드를 매개변수로 하는 생성자
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override

	public String toString() {
		return x + ", " + y;

	}

}
