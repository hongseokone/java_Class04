package ch06_for;

public class Ex06_ForEx {
    public static void main(String[] args) {
        /**
         * 1부터 100까지의 숫자 중에서 3의 배수만 출력하고 합계도 구하기
         */
        int i = 0;
        int sum = 0;
        for (i = 3; i <= 100; i+=3) {
            System.out.println("3의배수 = " + i);
        sum += i;
        }
        System.out.println("3의배수 합계 = " + sum);
//        int sum = 0;
//        for (int i = 1; i <= 100; i+=3) {
//            if (i% 3 == 0) {
//                System.out.println("i = " + i);
//                sum += i;
//            }
//        }
//        System.out.println("sum = " + sum);

    }
}