package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.*;


public class PointMenu {
		
	
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	
	public void mainMenu() {
		System.out.println("=====메뉴=====");
		System.out.println("1.원");
		System.out.println("2.사각형");
		System.out.println("9.끝내기");
		System.out.println("메뉴번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			circleMenu();
			break;
		case 2:
			rectangleMenu();
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		default :
			System.out.println("다시 입력해주세요.");
			
		}
	
		
	}
	public void circleMenu() {
		System.out.println("=====메뉴=====");
		System.out.println("1.원 둘레");
		System.out.println("2.원 넓이");
		System.out.println("9.메인으로");
		System.out.println("메뉴번호 : ");
		int menu = sc.nextInt();
		
		
		
		if(menu == 1) {
			calcCircum();
		}else if (menu == 2) {
			calcCircleArea();
		}else if (menu == 9) {
			System.out.println("메인메뉴로 돌아갑니다.");
			//return; 굳이
		}else {
			System.out.println("잘못 입력했습니다. 메인메뉴로 돌아갑니다.");
			//return;
		}
	}
	public void rectangleMenu() {
		System.out.println("=====메뉴=====");
		System.out.println("1.사각형 둘레 : ");
		System.out.println("2.사각형 넓이 : ");
		System.out.println("9.메인으로 : ");
		System.out.println("메뉴번호 : ");
		
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		}
	}
	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calCircum(x,y,r));
		
		
	}
	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, r));
		
	}
	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("높이 : ");
		int h = sc.nextInt();
		System.out.println("너비 : ");
		int w = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, h, w));
	}
	public void calcRectArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("높이 : ");
		int h = sc.nextInt();
		System.out.println("너비 : ");
		int w = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, h, w));
		
	}
	

}
