package ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
		/**
		 * 성적 출력 예제 응용
		 * 입력값: 학년(year), 점수(score)
		 * 처리
		 * - 1~3학년은 60점 이상이면 합격
		 * - 4학년은 70점 이상이면 합격
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("학년입력 : ");
		int num = scanner.nextInt();
		System.out.print("점수입력 : ");
		int num1 = scanner.nextInt();
		
		if(num <=3 && num1 >=60) {
			System.out.println("합격");
		}else if(num >= 4&& num1 >= 70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	
	}

}
