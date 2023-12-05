package ch06_for;

public class Ex08_NewstdFor {
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 구구단 출력하기
         */
        /*
        주석을 표현 하는 방법
         */
        for (int i = 2; i <= 9; i++) { // 몇단
            System.out.println("\n  " + i + "단");
            for (int j = 1; j <= 9; j++) { // 곱하는 수 (1~9)
                System.out.print("  " + i + "x" + j + "=" + (i * j));
//                System.out.println("\t");
            }
                System.out.println();
            }



//        for (int i = 2; i <= 9; i++){
//            System.out.println(" \n " + i + "단");
//            for (int j = 1; j <= 9; j++){
//                System.out.print("  " + i + "x" + j + "=" + i*j);
//            }
//        }
    }
}

