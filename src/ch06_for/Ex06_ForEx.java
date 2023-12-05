package ch06_for;

public class Ex06_ForEx {
    public static void main(String[] args) {
        /**
         * 1부터 100까지의 숫자 중에서 3의 배수만 출력하고 합계도 구하기
         */
        int f = 0;
        int sum = 0;
        for (f = 3; f <= 100; f+=3) {
            System.out.println("f = " + f);
        sum += f;
        }
        System.out.println(sum);

    }
}

