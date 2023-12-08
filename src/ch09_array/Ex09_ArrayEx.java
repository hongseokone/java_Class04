package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {
        boolean run = true;
        int a = 0; // 학생수
        int b = 0; // 1번 학생점수
        int c = 0; // 2번 학생점수
        int d = 0; // 3번 학생점수
        int b1 = 0; // 1번 학생점수 확인
        int c1 = 0; // 2번 학생점수 확인
        int d1 = 0; // 3번 학생점수 확인
        int max = 0; // 최고점수
        double f = 0; // 평균점수
        int select = 0; // 선택
        Scanner scanner = new Scanner(System.in); // Scanner 클래스타입의 변수 scanner

        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.학생수입력 | 2. 점수 입력 | 3. 점수 목록 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------------");

            System.out.print("선택 > ");
            select = scanner.nextInt();
            if (select == 1) {
                // 학생수
                System.out.print("학생수 > ");
                a = scanner.nextInt();
            } else if (select == 2) {
                // 점수 입력
                System.out.print("1번 학생 점수 : ");
                b = scanner.nextInt();
                b += b1;
                System.out.print("2번 학생 점수 : ");
                c = scanner.nextInt();
                c += c1;
                System.out.print("3번 학생 점수 : ");
                d = scanner.nextInt();
                d += d1;
                if (b > c) {
                    if (b > d) {
                        max = b;
                    } else {
                        max = d;
                    }
                } else {
                    if (c > d) {
                        max = c;
                    } else {
                        max = d;
                    }
                }

            } else if (select == 3) {
                // 점수 목록
                System.out.println("1번 학생 점수 : " + b + "");
                System.out.println("2번 학생 점수 : " + c + "");
                System.out.println("3번 학생 점수 : " + d + "");
            } else if (select == 4) {
                // 점수 분석

                System.out.println("최고 점수 : " + max + "");
                        System.out.println("평균 점수 : " + (b + c + d + f) / 3 + "");
                        System.out.println("1번 학생 점수 : " + b + "");
                        System.out.println("2번 학생 점수 : " + c + "");
                        System.out.println("3번 학생 점수 : " + d + "");
                    } else if (select == 5) {
                        //종료
                        run = false;
                        System.out.println("점수입력 및 점수확인 시스템을 종료합니다.");
                    }
                }
            }
        }