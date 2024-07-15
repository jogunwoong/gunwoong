package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		
		System.out.print("1. 사원추가");
		System.out.print("2. 사원수정");
		System.out.print("3. 사원삭제");
		System.out.print("4. 사원출력");
		System.out.print("9. 프로그램 종료");
		
		
		int menu = sc.nextInt();
		
	}
	public void insertEmp() {
		
		System.out.print("사원번호 : ");
		int no = sc.nextInt();
		
		System.out.print("사원이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print(" 추가 정보를 입력하시겠습니까?");
		String yn = sc.next();
		
		if (yn.toUpperCase().equals("Y")) {
			System.out.print("사원부서: ");
			String dept = sc.next();
			
			System.out.print("사원연봉: ");
			int salary = sc.nextInt();
			
			System.out.print("보너스: ");
			double bonus = sc.nextDouble();
			
			ec.add(no,name,gender,phone,dept,salary,bonus);
		}else {
			ec.add(no,name,gender,phone);
		}
		
			
			
			
			
		}
		
		
	
	public void updateEmp() {
		System.out.println("가장 최신의 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원연봉");
		System.out.println("3. 보너스");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 고르세요 : ");
		
		int menu = sc.nextInt();
		String message = "수정할";
		switch(menu) {
		case 1:
			message +="전화번호 : ";
		case 2:
			message +="사원연봉 : ";
		case 3 :
			message +="보너스 : ";
		case 9 :
			System.out.print("잘못 입력하셨습니다.");
			return;
			
			
		
		}
		System.out.print(message);
		if (menu == 1 ) {
			String newPhone = sc.next();
			ec.modify(newPhone);
		}else if (menu == 2) {
			int newsal = sc.nextInt();
			ec.modify(newsal);
		}else if (menu == 3) {
			double newBonus = sc.nextDouble();
			ec.modify(newBonus);
		}
			
		
		
		
		
		
		
	}
	public void deleteEmp() {
		System.out.println("정말 삭제하시겠습니까? (y/n) :");
		char yn = sc.next().charAt(0);
		if (yn =='y' || yn == 'y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공하셨습니다.");
		}else {
			System.out.println("데이터 삭제에 실패하였습니다");
		}
			
		
		
		
	}
	public void printEmp() {
		String info = ec.inform();
	
		if(ec.inform() == null) {
			System.out.println("저장된 사원 정보가 없습니다.");
		}else {
			
		
		System.out.println(ec.inform());
		}
	}
	
	

}
