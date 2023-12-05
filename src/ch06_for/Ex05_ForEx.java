package ch06_for;

import java.util.Scanner;

public class Ex05_ForEx {
    public static void main(String[] args) {
        /**
         * 두 개의 정수를 입력받아서 시작값부터 끝값까지의 합계 출력
         * 입력 예
         * 시작값 : 110
         * 끝값 : 555
         * 출력 예
         * 110 부터 555까지의 합은 000입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작값 : ");
        int start = scanner.nextInt();
        System.out.print("끝값: ");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++){
            sum += i;
            if (i < end ) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        System.out.println(sum);
        System.out.println(start + "부터" + end + "까지의 합은" + sum + "입니다.");
//
//
//
//
//
//
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("시작값을 입력해주세요");
//        int num1 = scanner.nextInt();
//        System.out.println("끝값을 입력해주세요");
//        int num2 = scanner.nextInt();
//        int num3 = (num1 + num2);
//        for(int i = 110; i <= 555; i++){
//            num1 += num2;
//        }
//        System.out.println("시작값 :" + num1 );
//        System.out.println("끝값 :" + num2);
//        System.out.println("총합 : " + num3);
            }
        }
