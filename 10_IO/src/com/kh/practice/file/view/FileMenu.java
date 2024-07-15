package com.kh.practice.file.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {

		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9.끝내기");
			System.out.print("메뉴번호");
			int m = sc.nextInt();
			sc.nextInt();
			switch (m) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}

		}

	}
	

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.println("내용 : ");
			String content = sc.nextLine();

			if (content.equals("ex끝it")) {

				sb.append(content);
			} else {
				break;
			}
		}

		while (true) {
			// 사용자 입력이 끝난 후(ex끝it 입력 후)
			System.out.println("저장할 파일 명을 입력해주세요(ex.myFile.txt) :");
			String fileName = sc.nextLine();

			if (fc.checkName(fileName)) {
				System.out.println("이미 존재하는 파일입니다. 덮어 쓰시겠습니까?(y/n) : ");
				char yn = sc.next().charAt(0);

				if (yn == 'y' || yn == 'Y') {
					fc.fileSave(fileName, sb);
					return;
				} else { // 파일이 존쟈하지 않을경우
					fc.fileSave(fileName, sb);
					return;
				}
			}
		}
	}

	public void fileOpen() {
		System.out.print("열 파일 명 :");
		String fileName = sc.nextLine();

		if (fc.checkName(fileName)) {
			// 파일이 존재하는경우(true)메소드의 매개변수로 넘겨 반환 값 출력
			System.out.println(fc.fileOpen(fileName));
		} else {
			// 파일이 존재ㅐ하지 않을 경우(false) 없는 파일 입니다 출력 후
			// mainMenu로 돌아가기
			System.out.println("없는 파일입니다.");
			return;
		}

	}

	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.nextLine();

		// 해당 파일이 존재하는지 확인

		if (fc.checkName(fileName)) {
			StringBuilder sb = new StringBuilder();
			while (true) {
				// 반환값이 true일 경우(파일o)
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it라고 입력하면 종료 됩니다.");
				System.out.println("내용 : ");
				String content = sc.nextLine();
				if (!content.equals("ex끝it")) 
					sb.append(content);
				 else {
					fc.fileEdit(fileName, sb);
				}
			}

		} else {
			// 반환값이false일 경우(파일x)
			System.out.println("없는 파일 입니다.");
			return;
		}

	}

}
