package com.kh.practice.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPserver {
	public static void main(String[] args) {
		// 1. IP(PC에 지정되어 있음)
		int port = 8090;

		// 이서버는 8090포트를 사용하여 요청받을 준비
		try (DatagramSocket ds = new DatagramSocket(port)) {

			byte[] data = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data, data.length);

			while (true) {
				try {
					ds.receive(dp);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(dp.getAddress());
				String message = new String(dp.getData());
				System.out.println(message);

				dp.getAddress();
			}

		} catch (SocketException e) {

			e.printStackTrace();

		}
	}

}