package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;

import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		
		System.out.print("=====도형 프로그램=====");
		System.out.print("3.삼각형");
		System.out.print("4.사각형");
		System.out.print("9.프로그램종료");
		
		while(true) {
			int c = sc.nextInt();
			switch (c) {
			
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
			System.out.println("프로그램 종료");
			return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			
			}
			
			
			
		}
		
		
		
		
	}
	public void triangleMenu() {
		
	}
	public void squareMenu() {
		
	}
	public void inputSize(int type, int menuNum) {
		
	}
	public void printinformation(int type) {
		
	}
}

