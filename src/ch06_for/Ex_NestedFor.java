package ch06_for;

public class Ex_NestedFor {
    public static void main(String[] args) {
        /**
         * 증첩 for문
         */
//        System.out.println("바깥 for문 시작");
//        for (int i = 1; i <= 2; i++) {
//            System.out.println("안쪽 for문 시작");
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("j = " + j);
//                System.out.println("i = " + i);
//            }
//            System.out.println("안쪽 for문 종료");
//            System.out.println("안쪽 for문 종료");
//        }
//        System.out.println("바깥 for문 종료");
        System.out.println("바깥 for 문 ");
        for (int i = 1; i < 2; i++) {
            System.out.println("안쪽for문");
            for (int j = 0; j <= 3; j++) {
                System.out.println("j = " +j);
                System.out.println("i = " +i);
            }
            System.out.println("안쪽for문 종");
            System.out.println("바깥for문 종");

        }
    }
}
