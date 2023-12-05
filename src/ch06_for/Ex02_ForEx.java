package ch06_for;

public class Ex02_ForEx {

    public static void main(String[] args) {
        // 1~ 10 까지 순서대로 출력
        int i = 0;
        for(i = 1; i <= 10; i++ ){
            System.out.println(" i = " + i);
        }

        // 2 4 6 8 10 출력
        int j = 0;
        for(j = 2; j <= 10; j++){
            if(j % 2 == 0){
                System.out.println(" j = " + j);
            }
        }
        int f = 0;
        for (f = 2; f <= 10; f+=2) {
            System.out.println("f = " + f);
        }

        // 5 4 3 2 1 출력

        int a = 1;
        for(a = 5; a >= 1; a--){
            System.out.println(" a = " + a);
        }

        // 10 8 6 4 2  출력
        int n = 0;
        for(n = 10; n >=2; n-=2){
            System.out.println(+ n);

        // 21 17 14 ~출력
        int h = 0;
        for(h = 21; h >=3; h-=3){
            System.out.println(+ h);
        }
        }
    }
}
