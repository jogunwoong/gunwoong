package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO05_DataInputStream {
	public static void main(String[] args) {

		File f = new File("./resources", "DataSample.txt");

		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));

			int data1 = dis.read();
			boolean data2 = dis.readBoolean();
			char data3 = dis.readChar();
			double data4 = dis.readDouble();
			int data5 = dis.readInt();

			System.out.println("[1]" + data1);
			System.out.println("[2]" + data2);
			System.out.println("[3]" + data3);
			System.out.println("[4]" + data4);
			System.out.println("[5]" + data5);

		} catch (FileNotFoundException e) {
			System.out.println("[errer] 파일을 못찾음 에러확인");
		} catch (IOException e) {
			System.out.println("[errer] 입출력 오류 벌샹");

		} finally {
			try {
				dis.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
