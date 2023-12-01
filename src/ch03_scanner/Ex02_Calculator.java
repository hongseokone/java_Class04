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
		int num4 = (num2 + num3);
		int num5 = (num3 + num4);

		System.out.println(num1 + "과" + num2 + "의 합계는 " + num3 + "입니다.");
		System.out.println(num2 + "+" + num3 + "=" + num4);
		System.out.println(num3 + "더하기" + num4 + "총합 : " + num5);

		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		System.out.println(name);

		scanner.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address = scanner.nextLine(); // 넥스트를 썻다가 넥스트라인을 쓰면 오류가 발생할수있음
		System.out.println(address);
		
	}

}
