package com.kh.example.practice4.model.vo;

public class Student {
	
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
			grade = 1;
			classroom = 7;
			name = "조건웅";
			height = 176.5;
			gender = '남';
	}
	
	public Student() {
		
	}
	
	
	
	
	public void information() {
		System.out.println("학년: " + grade + "반: " + classroom + "이름: " + name + "키: " + height + "성별: " + gender);
	}
	public int getgrade() {
		return grade;
	}
	public void setgrade() {
		this.grade = grade;
	}
	public int classroom() {
		return classroom;
	}
	public void setclassroom() {
		this.classroom = classroom;
	}
	public String getname() {
		return name;
	}
	public void setname() {
		this.name = name;
	}
	public double getheight() {
		return height;
	}
	public void setheight() {
		this.height = height;
	}
	public char getgender() {
		return gender;
	}
	public void setgender() {
		this.gender = gender;
	}
		

}
