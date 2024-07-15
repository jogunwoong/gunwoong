package com.kh.practice.point.model.vo;

public class Circle extends Point {// extend point =>point
	// 클래스로부터 상속받는다 x,y변수를 멤버로 가지게 된다
	// Circle클래스는 총 3개의 변수를 가지게 됨
	private int radius;

	public Circle() {

	}

	public Circle(int x, int y, int radius) {
		super(x, y);// Point 의 매개변수가 2개인 생성자 호출
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override

	public String toString() {

		return super.toString() + ", " + radius;
	}

}
