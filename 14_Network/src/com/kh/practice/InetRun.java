package com.kh.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
	/*
	 * 네트워크(Network) : 여러대의 컴퓨토들이 연결되어 있는 통신망
	 * 					=>네트워크를 통해 서로 데이터를 주고받을 수 있음
	 * 
	 * *IP 주소     : 네트워크 상에 각 컴퓨터들을 식별해주는 번호
	 * * 포트(port) : 한 컴퓨터 내에 프로그램들을 식별해주는 번호
	 * 
	 * * 서버     : 클라이언트(고객)에게 서비스를 제공해주는 프로그램
	 * 			-> 클라이언트에게 요청을 받아 처리 후 응답
	 * * 클라이언트 : 서비스를 제공받는 고객
	 *            -> 서버에 요청을 보내는 프로그램 
	 */
	public static void main (String []args) {
		// java.net.InetAddress : 네트워크 정보를 확인할 수 있는 기본 클래스 java.net
		try {
		InetAddress iNet = InetAddress.getLocalHost(); 
		// -> getLocalHost() : 현재 PC에 대한 네트워크 정보를 확인할 수 있음
		System.out.println(iNet);		//pc정보 호스트/IP출력
		
		System.out.println(iNet.getHostName());			//내pc정보 xxxx
		System.out.println(iNet.getHostAddress());								//ip주소
		
		System.out.println("-----------------------------------------");
		
		InetAddress iNet2 = InetAddress.getByName("www.naver.com");
		// =>getByName (도메인) : 도메인을 통해서 해당 호스트에 대한 정보를 반환
		
		System.out.println(iNet2.getHostName());
		System.out.println(iNet.getHostAddress());
		
		System.out.println("------------------------------------------");
		//도메인을 통해 서버 관련 정보를 배열로 받아 확인
		InetAddress[] iNet3 = InetAddress.getAllByName("encar.com");
		
		System.out.println("네이버 호스트 개수 :" + iNet3.length);
		for(InetAddress n : iNet3) {
			System.out.println("네이버 호스트명(서버명) :" + n.getHostName());
			System.out.println("네이버 IP주소 : " + n.getHostAddress());
		}
		
	} catch(UnknownHostException e) {
		e.printStackTrace();
	}
	
	}
	
}
