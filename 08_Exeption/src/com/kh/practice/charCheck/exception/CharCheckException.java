package com.kh.practice.charCheck.exception;

//예외클래스: 특정 조간에서 예외(오류)클 발생시킬때ㅔ 사용할 목적
public class CharCheckException extends Exception {
	
	public CharCheckException() {
		
	}
	public CharCheckException(String msg) {
		super(msg);
	}
}
