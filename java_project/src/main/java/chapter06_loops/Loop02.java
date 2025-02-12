package chapter06_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
        n에 숫자를 입력하여 몇 번 반복할 지 결정하고
        1부터 n까지 표시하는 반복문을 설정하시오.

        실행 예
        1 2 3 4 5 ... n
     */
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("1부터 얼마까지 숫자를 표기하시겠습니까? >>> ");
        n = scanner.nextInt();

        for (int i = 0 ; i < n ; i++) {
            System.out.print(i+1 + " ");
            sum += i+1;
        }
        System.out.println();
        System.out.println("1부터 n까지의 합 : " + sum);
    }
}
