package ch03_variables;

import java.util.Scanner;

public class Ex03_Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = scanner.nextInt();

	
		String num1 = "";
		if (score < 100 && score > 0) {
		
		if(score >= 90){
			num1 = "A";	
		}else if(score>= 80) {
			num1 = "B";
		}else if(score>= 70) {
			num1 = "C";
		}else if(score>= 60) {
			num1 = "D";
		}else {
			num1 = "F";
		}
	} else {
		System.out.println("입력범위를 초과하였습니다.");
	}
	
	System.out.println("학점은 : " + num1 + "입니다");

}
}

