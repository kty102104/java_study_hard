package chapter05_condition;
/*
        음수면 잘못 입력되었습니다.가 출력될 것
        18 초과면 정상체중
        23 초과면 과체중
        25 초과면 비만

        실행 예
        당신의 bmi 지수는 23이고, 정상체중입니다.
 */
import java.util.Scanner;
public class Condition04BmiUpgraded {
    public static void main(String[] args) {
        double bmi;
        String result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() / 100;
        System.out.print("당신의 몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        bmi = weight / (height*height);

        if (bmi < 0) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            if (bmi > 25) {
                result = "비만";
            } else if (bmi > 23) {
                result = "과체중";
            } else if (bmi > 19) {
                result = "정상체중";
            } else {
                result = "저체중";
            }
            System.out.println("당신의 bmi 지수는 " + (int) bmi + "이고, " + result + "입니다.");
        }
    }
}
