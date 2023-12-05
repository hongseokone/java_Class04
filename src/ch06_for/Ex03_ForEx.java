package ch06_for;

public class Ex03_ForEx {
    public static void main(String[] args) {
        /**
         *  1부터 10까지의 합계를 출력
         //         */
//        int a = 0;
//        for (int b = 0; b <= 10; b++){
//            a += b;
//        }
//        System.out.println(a);
//        int sum = 0;
//        sum = 1;
//        sum = sum +2;
//        sum = sum +3;
//        sum = sum +4;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
//            sum = 10;
            sum = sum + i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }
        System.out.println("for 문 종료후 sum = " + sum);
    }
    }

