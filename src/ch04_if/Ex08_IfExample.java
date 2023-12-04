package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		/**
		 * 서로 다른 정수 3개를 입력받아서 가장 큰 정수 출력하기
		 * (같은 숫자는 입력하지 않는다고 가정)
		 * 입력 예
		 * 첫번째 숫자 : 
		 * 두번째 숫자 : 
		 * 세번째 숫자 : 
		 * 
		 * 출력 예
		 * 가장큰 숫자는 00 입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num1 =0, num2 = 0, num3 = 0;
		System.out.print("첫번째숫자입력 : ");
		num1 = scanner.nextInt();
		System.out.print("두번째숫자입력 : ");
		num2 = scanner.nextInt();
		System.out.print("세번째숫자입력 : ");
		num3 = scanner.nextInt();
		
		int max = 0;
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("가장 큰 숫자는 "  + max + "입니다" );
	}
}
//		Scanner scanner = new Scanner(System.in);		
//		System.out.print("첫번째숫자입력 : ");
//		int num = scanner.nextInt();
//		System.out.print("두번째숫자입력 : ");
//		int num2 = scanner.nextInt();
//		System.out.print("세번째숫자입력 : ");
//		int num3 = scanner.nextInt();
//		
//		if(num > num2 && num > num3 ) {
//			System.out.println("가장 큰 숫자는 "  + num + "입니다" );
//		}else if(num2 > num && num2 > num3){
//			System.out.println("가장 큰 숫자는 "  + num2 + "입니다" );
//		}else if(num3 > num && num3 > num2){
//			System.out.println("가장 큰 숫자는 "  + num3 + "입니다" );
//		}
//	}
//
//}
