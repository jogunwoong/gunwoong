package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String [] args) {
		
		Book b = new Book();
		b.inform();
		
		Book b2 = new Book("제목1","출판사1","조건웅");
		b2.inform();
		
		
	}
	

}
