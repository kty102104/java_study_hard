package chapter04_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 입력 : ");
        int x = scanner.nextInt();

        System.out.print("y 입력 : ");
        int y = scanner.nextInt();

        System.out.println("x + y = " + x + y);
        // 맨 처음 시작이 String이기 때문에 x, y에 해당하는 값도 String으로 처리됨.
        System.out.println("x + y = " + (x + y));
        // 그 문제를 해결하기 위해 연산 우선수위를 만들어주고자 x + y를 소괄호로 묶음.
    }
}
