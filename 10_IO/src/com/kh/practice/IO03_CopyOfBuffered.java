package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO03_CopyOfBuffered {
	
	public static void main(String[]args) {
		//파일객체
		File src = new File("./resources/src.txt");
		File dst = new File("./resources/dst.txt");
		
		//TODO: 입출력 스트림 객체선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		//TODO: 입출력 데이터 관련 변수선언
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;
		
		try {
			//TODO: 파일 입출력 스트림 생성
			bis = new BufferedInputStream( new FileInputStream(src) );
			bos = new BufferedOutputStream( new FileOutputStream(dst) );
			//TODO: 파일 입력 및 출력(파일복사)
			while( (len = bis.read(buf))!=-1) {
				bos.write(buf, 0, len);
				bos.flush();
				
				total +=len;
			}
			
		}catch(FileNotFoundException e){
			System.out.println("[error");
			e.printStackTrace();
			
		}catch(IOException e) {
			System.out.println("[errer]");
			e.printStackTrace();
			
		}finally {
			try {
				if(bis !=null)bis.close();
				if(bos !=null)bos.close();
				
			}catch(IOException e) {
				System.out.println("ss");
				e.printStackTrace();
			}
		}
		
		//TODO: 복사된 총 파일 길이
		System.out.println("복사완료: 총 길이=" + total);
	}

}
