package ch03_scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		/**
		 * 정수 2개를 각각 스캐너로 num1, num2에 입력받아서 입력받은 수의 합을 출력하세요.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = scanner.nextInt();
		int num3 = (num1 + num2);
		System.out.println(num1 + "과" + num2 + "의 합계는 " + num3 + "입니다.");
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println("총합 : " + num3);
	}

}
