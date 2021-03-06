/* 
 * 프로그램명: 제어구조-for문
 * 작성자 : 이민종
 * 작성일 : 20190220
 * 
 */

package com.test;

public class Program045 {

	public static void main(String[] args) {
		
		//반복문 : 유사한 문장을 반복 실행할 때 사용
		
		//문제) 1부터 100까지의 수 중에서 3의 배수만 출력
		//출력예)
		/*
		배수: 3
		3 6 9 12 .... 99
		*/

		int a = 3;
		
		for (int b = 1; b <= 100; ++b) {
			if (b % a == 0) {
				System.out.printf("%d ", b);
			}
		}
		System.out.println();
			
	}
}
