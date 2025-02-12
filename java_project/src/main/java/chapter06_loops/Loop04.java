package chapter06_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            별찍기를 통한 for 문 구조 학습
            *
            **
            ***
            ****
            *****
            i의 값이 바뀔 때 마다 enter(개행)이 이루어져야 함.
         */

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            숫자를 입력 받아 그 줄 수 만큼의 별찍기가 이루어질 수 있도록 작성하시오.

            실행 예
            숫자를 입력하세요 >>> 3
            *
            **
            ***
         */
        Scanner scanner = new Scanner(System.in);
//        int row;
//        System.out.print("숫자를 입력하세요 >>> ");
//        row = scanner.nextInt();

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            *****
            ****
            ***
            **
            *
         */
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("🎈");
//            }
//            System.out.println();
//        }
        /*
                    *
                   **
                  ***
         */


        for (int i = 0; i < 3; i++) {
            // 공백을 위한 반복문
            // #1. j++ 사용
//            for (int j = 0; j < 2 - i; j++) {
//                System.out.print(" ");
//            }

            // #2. j-- 사용
            for (int j = 3; j > i + 1; j--) {
                System.out.print(" ");
            }

            // 별을 찍는 반복문
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
