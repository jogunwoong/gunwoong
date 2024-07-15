package com.kh.example.practice7.model.vo;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bounsPoint;
	private String phone;
	private String address;
	
	public Employee() {
		
	}
	public Employee(int empNO, String empName) {
		
	}
	public Employee(int empNo, String empName, String dept,
		   String job, int age, char gender, int salary,
		   double bounsPoint, String phone, String address) {
		
	}
	public int getempNo() {
		return empNo;
	}
	public void setempNo(int empNo) {
		this.empNo = empNo;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public String getdept() {
		return dept;
	}
	public void setdept(String dept) {
		this.dept = dept;
	}
	public String getjob() {
		return job;
	}
	public void setjob(String job) {
		this.job = job;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public char getgender() {
		return gender;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public double getbounsPoint() {
		return bounsPoint;
	}
	public void setbounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
}