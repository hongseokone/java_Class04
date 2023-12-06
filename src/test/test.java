package test;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a, b;
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);
        for(int i = 1; i <= 5; i++){
            for(int e = 1; e <= i; e++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}