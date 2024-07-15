package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String []args) {
		Employee e = new Employee();
		e.setempNo(100);
		System.out.println(e.getempNo());
		e.setempName("조건웅");
		System.out.println(e.getempName());
		e.setdept("영업부");
		System.out.println(e.getdept());
	}

}
