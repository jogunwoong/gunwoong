package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO04_DataOutputStream {
	
	public static void main(String []args) {
	
	//츨력파일 객체생성
	File f = new File("./resources", "DataSample.txt");
	
	//데이터 출력 스트림선언
	
	DataOutputStream dos = null;
	try {
	
	dos = new DataOutputStream(
			new BufferedOutputStream(
					new FileOutputStream(f)));
	
	dos.write(83);
	dos.writeBoolean(true);
	dos.writeChar('J');
	dos.writeDouble(3.141592);
	dos.writeInt(369);
	
	dos.flush();
	}catch(FileNotFoundException e) {
		System.out.println("[errer] 파일을 찾을 수 없습니다. 오타를 확인하세요!!");
	}catch(IOException e) {
		System.out.println("[errer] 입출력 오류 발생!...관리자 호출!");
	}finally {
		try {
			dos.close();
			
		}catch(IOException e){
			System.out.println("[error] 자원반납 실패!");
		}
	}
		
		
	
}
}