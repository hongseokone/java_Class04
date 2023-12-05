package ch06_for;

import java.util.Scanner;

public class Ex10_ForEx {

    public static void main(String[] args) {
        /**
         * 정수를하나 입력 받고
         * 1부터 입력받은 정수까지의 정수 중에서
         * 2의배수, 3의배수를 제외한 수의 총 합 출력
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요.");
        int sc = scanner.nextInt();
        int a = 0;
        for (int i = 1; i <= sc; i++){
            if(i % 2 != 0 && i % 3 != 0){
                a += i;
            }
        }
            System.out.println(a);
        }
    }
