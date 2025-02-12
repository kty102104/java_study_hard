package chapter07_methods;

import java.util.Scanner;

public class Method03Switch {
    /*
        Method02.java 파일에 별찍기 관련한 method를 구현했습니다.
        getStart() 메서드를 보면 내부에 if - else if - else 형태의 구문으로
        매개변수를 1~4까지 받아서 별을 출력하게끔 구현돼있습니다.

        하지만 if문을 사용하면 가독성이 떨어지기 때문에
        이를 switch문으로 교체하여 동일한 기능을 하게끔
        Refactoring(리팩토링) 과정을 거치고자 합니다.
     */

    public static String getStar(int totalLine, int menuSelect) {
        String result = "";
        // Method02.java의 if문 부분을 switch문으로 교체하여 코드를 작성하시오.
        switch (menuSelect) {
            case 1:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - 1 - i; j++) {
                        result += " ";      // 혹시 공백 깨져보이면 공백 하나 더 주세요.
                    }
                    // 별 찍기
                    for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                for (int i = 0; i < totalLine; i++) {
                    // 공백
                    for (int j = 0; j < i; j++) {
                        result += " ";
                    }
                    // 별찍기
                    for (int k = 0; k < totalLine - i; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                result = "잘못 입력하셨습니다. 다시 입력하세요. 😥";
                // Method02에서는 sout을 통해 구현했으나
                // result에 대입하여 main에서 출력하는 방식으로 수정
       }
        return result;
    }

    public static void main(String[] args) {
        // 그리고 메인 단계에서 메뉴명 등을 작성해서
        // Method02와 동일한 형태로 실행될 수 있도록 작성하시오.
        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice;
        String starResult;

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("메뉴를 숫자로 선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);
    }
}
