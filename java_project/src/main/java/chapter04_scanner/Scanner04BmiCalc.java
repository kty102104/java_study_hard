package chapter04_scanner;
/*
    Bmi 계산기를 작성합니다.

    1. 키를 cm로 입력 받습니다.
    2. 몸무게를 kg로 입력 받습니다.
    3. bmi를 계산하는 방법 : 몸무게(kg) / (키(m)의 제곱)
    4. 콘솔창에 "당신의 bmi지수는 xx입니다."

실행 예
    당신의 키(cm)를 입력하세요 >>> 172.3
    당신의 몸무게(kg)를 입력하세요 >>> 70
    당신의 bmi 지수는 xx입니다.
 */

import java.util.Scanner;

public class Scanner04BmiCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() / 100;
        System.out.print("당신의 몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        int bmi = (int) (weight / (height*height));
        System.out.println("당신의 bmi 지수는 " + bmi + "입니다.");
    }
}
