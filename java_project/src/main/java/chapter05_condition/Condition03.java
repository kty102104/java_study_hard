package chapter05_condition;

import java.util.Scanner;

/*
    사용자에게 score을 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

    score가 0보다 작거나 100보다 크면 grade는 x
    score -> 90 ~ 100, grade = A
    score -> 80 ~ 89, grade = B
    score -> 70 ~ 79, grade = C
    score -> 60 ~ 69, grade = D
    score -> 0 ~ 59, grade = F

    실행 예
    점수를 입력하세요 >>> 100
    입력한 점수는 100 점이며, 학점은 A 학점입니다.
 */
public class Condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        char grade;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        if (score < 0 || score > 100) {
            grade = 'x';
        } else if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("입력한 점수는 " + score + " 점이며, 학점은 " + grade + " 학점입니다.");
    }
}
