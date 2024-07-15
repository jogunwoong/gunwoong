package com.kh.practice.run;

import java.util.Scanner;

import com.kh.practice.model.vo.AniBook;
import com.kh.practice.model.vo.CookBook;

public class Run {
	
	public static void main(String [] args) {
		
		AniBook[] aList = {
				
				new AniBook("애니북1", "작가1","korea",12),
				new AniBook("애니북2", "작가2","korea",12),
				new AniBook("애니북3", "작가3","korea",12),
				new AniBook("애니북4", "작가4","korea",12),
				new AniBook("애니북5", "작가5","korea",12)
		};
		
		
		
		
		
		
		CookBook[] cList = {
				new CookBook("쿡북1", "작가1", "tvn", true),
				new CookBook("쿡북2", "작가2", "tvn", true),
				new CookBook("쿡북3", "작가3", "tvn", true),
				new CookBook("쿡북4", "작가4", "tvn", true),
				new CookBook("쿡북5", "작가5", "tvn", true)
				
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회하고자하는 책 입력");
		String title = sc.nextLine();
		
		boolean found = false;
		for(int i = 0; i <aList.length; i++) {
			
		}
		
		
	}

}
