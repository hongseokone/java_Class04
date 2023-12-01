package ch04_if;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		/**
		 * 스캐너로 점수(score) 를 하나 입력받아서
		 * 90점 이상이면 A
		 * 80점 이상이면 B
		 * 70점 이상이면 C
		 * 60점 이상이면 D
		 * 60점 보다 적은 점수면 F
		 * 를 출력
		 */
		int javaScore = 100;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		javaScore = scanner.nextInt();
		if (javaScore >= 90) {
			System.out.println("A 학점");
		} else if (javaScore >= 80) {
			System.out.println("B 학점");
		} else if (javaScore >= 70) {
			System.out.println("C 학점");
		} else if (javaScore >= 60) {
			System.out.println("D 학점");
		} else {
			System.out.println("F 학점");
		}

	}

}