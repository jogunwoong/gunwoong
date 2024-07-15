package com.kh.practice1.func;

class Solution {
	public static void main(String[] args) {

		int n;
		int answer = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) {
				answer += i ;
				System.out.println(answer);
			}
		}

	}
}
