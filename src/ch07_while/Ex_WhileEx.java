package ch07_while;

public class Ex_WhileEx {
    public static void main(String[] args) {
        /**
         * while 문으로 1부터 10까지의 합계 출력
         * 출력
         * 1+2+3+4+5+6+7+9+10=55
         */

//        int sum = 0;
//        int a = 1;
//        while(a< 11){
//            sum += a;
//            if (a < 10) {
//                System.out.print(a + "+");
//            } else {
//                System.out.print(a + "=" );
//            }
//            a++;
//        }
//        System.out.print(sum);
        int i = 1, sum = 0;
        while (i <= 10) {
            System.out.print(i);
            sum+= i;
            if (i < 10) {
                System.out.print("+");
            } else{
                System.out.print("=");
            }
            i++;
        }
        System.out.println(sum);
        }
    }
