package com.kh.practice.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {
	public static void main(String[] args) {

		// 사용자에게 메시지 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("전송메시지 입력 : ");
		// while(true) {
		String message = "하이";
		// ------
		// 서버의 IP주소,포트번호(8090)
		try (DatagramSocket ds = new DatagramSocket()) {

			InetAddress iNet = InetAddress
					.getByName("  192.168.10.1" + "  192.168.10.5" + "  192.168.10.7" + "  192.168.10.9"

							+ "  192.168.10.12 " + "  192.168.10.13" + "  192.168.10.14" + "  192.168.10.15"
							+ "  192.168.10.16" + "  192.168.10.17         " + "  192.168.10.18         "
							+ "  192.168.10.19         " + "  192.168.10.20" + "  192.168.10.23" + "  192.168.10.24"
							+ "  192.168.10.26" + "  192.168.10.27" + "  192.168.10.28" + "  192.168.10.255");

			int port = 8090;

			DatagramPacket dp = new DatagramPacket(message.getBytes(), message.getBytes().length, iNet, port);
			ds.send(dp);

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
