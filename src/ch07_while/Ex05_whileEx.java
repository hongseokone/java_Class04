package ch07_while;

import java.util.Scanner;

public class Ex05_whileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */

        Scanner scanner = new Scanner(System.in);
        int input = 0, count = 0;
        boolean run = true;
        System.out.println("up&down");
        int answer = (int) (Math.random() * 100) + 1;
        while (run) {
            int count2 =0;
            System.out.println("숫자를 입력 : ");
            input = scanner.nextInt();
            count++;
            count2++;
            System.out.println(answer);
            if (input > answer) {
                System.out.println("더작은수를 입력");
            } else if (input < answer) {
                System.out.println("더큰수를 입력");
            } else {
                System.out.println("맞았습니다!");
                System.out.println("시도횟수는" + count + "회 입니다.");
            }
        }
//        boolean run = true;
//        int a = 0;
//        int num = (int) (Math.random() * 100) + 1;
//        System.out.println(num);
//        while (run) { // 와일문 안에있는걸 계속 실행해줌
//            System.out.print(" 1부터 100까지 숫자를 입력하세요: ");
//            int st = scanner.nextInt();
//            a++;
//            if (st == num) {
//                System.out.println("정답!");
//                System.out.println("시도횟수는" + a + "번입니다.");
//            } else if (st >= num) {
//                System.out.println("숫자를 더 작은수를 입력해주세요");
//            } else if (st <= num) {
//                System.out.println("숫자를 더 큰수를 입력 해주세요");
//            } else {
//                if (st == a) {
//                    run = false;
//                }
//            }
//        }
    }
}

