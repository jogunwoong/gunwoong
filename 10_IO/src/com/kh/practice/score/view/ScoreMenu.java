package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		
		System.out.println("1. 성적 저장");
		System.out.println("2. 성적 출력");
		System.out.println("9. 끝내기");
		int m = sc.nextInt();
		switch (m) {
		case 1:
			saveScore();
			break;
		case 2:
			readScore();
			break;
		case 9:
			System.out.println("끝내기");
		default:
			System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
		}
		
		
	}
	public void saveScore() {
		int num = 0;
		
		System.out.println("N번 째 학생 정보 기록");
		System.out.println("이름 : ");
		System.out.println("국어 점수 : ");
		System.out.println("영어 점수 : ");
		System.out.println("수학 점수 : ");
	}
	public void readScore() {
		
	}

}
