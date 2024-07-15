package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		
		// 면적 : PI * 반지름 * 반지름
		c = new Circle(x,y,radius);
		double area = Math.PI * c.getRadius() * c.getRadius();
		return "면적 : " + x + ", " + y + ", " + radius + " / " + area;
		
	}
	public String calCircum(int x, int y, int radius) {
		// 둘레 : PI * 반지름 * 2
		c= new Circle(x,y,radius);
		double Circum = Math.PI * c.getRadius() * 2;
		return " 둘레 : " + c.toString() + " / " + (Math.PI * radius * 2);

		
	}
		
	

}
