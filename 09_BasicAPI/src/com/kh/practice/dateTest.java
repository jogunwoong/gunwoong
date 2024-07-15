package com.kh.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dateTest {
	
	public static void main(String[] args) {
		//Date : 날짜,시간 관련 클래스
		Date date = new Date();
		System.out.println((date.getMonth()+1)//.getMonth는 0부터래서 +1 해줘야됨
							+"/" + date.getDate());
		
		
		//[객체생성]
		//현재 날짜 시간 기준으로 생성 : LocalDateTime.now()
	
		//생일츨략
		LocalDateTime birth = LocalDateTime.of(LocalDate.of(2005, 9, 23),
												LocalTime.of(16, 0));
		
		System.out.println(birth);
		
		
		//localDateTime
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date2.getMonth());
		System.out.println(date2.getMonthValue() + "/" + date2.getDayOfMonth());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));

		//1) LocalDateTime -> date 변경후 포맥 적용
		Date dateOfBirth = java.sql.Timestamp.valueOf(birth);
		System.out.println(sdf.format(dateOfBirth));
		
		//2) DateTimeFormatter 이용
		System.out.println(birth.format(DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss")));
		
		//--------------------------------------------------------
		
		//올해 며칠 남았는지?
		System.out.println(366-date2.getDayOfYear());
		
		
		//오늘 퇴근까지 몇시간 남았는지?
		
		System.out.println((18 - date2.getHour()) + ":" +(60 - date2.getMinute()) + ":" + (60 - date2.getSecond()));
		
		
		
		
		
	}

}
