package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;

public class Run {
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		System.out.println(d.information());
				
		Desktop d2 = new Desktop("삼성","ss-01","삼성 데스크탑",200,true);
		
		System.out.println(d2.information());
		
	}

}
