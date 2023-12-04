package ch04_if;

import java.util.Scanner;

public class EX05_ifExample {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력 받아서 양수 , 음수 , 0 인지를 출력
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int sca = scanner.nextInt();
		
		if(sca > 0) {
			System.out.println("양수");
		}else if(sca < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}
}