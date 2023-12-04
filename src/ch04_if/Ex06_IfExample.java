package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력받아서
		 * 3의 배수인지, 의 배수인지 또는 3과5의 공배수인지, 아무것도아닌지 출력
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = scanner.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("공배수");
		}else if(num % 3 == 0) {
			System.out.println("3의배수");
			}else if(num % 5 == 0) {
				System.out.println("5의배수");
			}else{
				System.out.println("아무것도해당안됨");
			}
		}

	}


