package chapter11_arrays;

import java.util.Scanner;
/*
    String[] names 배열을 선언하고
    출석부에 이름을 입력하여 names 배열에 집어넣는 프로그램을 작성합니다.

    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 10
    1번 학생 이름 : 김일
    2번 학생 이름 : 김이
    3번 학생 이름 : 김삼
    4번 학생 이름 : 김사
    5번 학생 이름 : 김오
    6번 학생 이름 : 김육
    7번 학생 이름 : 김칠
    8번 학생 이름 : 김팔
    9번 학생 이름 : 김구
    10번 학생 이름 : 김십

    [ 출력 결과 ]
    1. 김일
    2. 김이
    3. 김삼
    4. 김사
    5. 김오
    6. 김육
    7. 김칠
    8. 김팔
    9. 김구
    10. 김십
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] strArray01 = {"이런", "식으로", "적을 수", "있습니다"};

        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int n = scanner.nextInt();
        scanner.nextLine();             // enter키 한 번 막아주는 배리어 역할

        // 위에 String[]을 선언하면 비어있기 때문에 index 넘버가 없음

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "번 학생 이름 : ");
            names[i] = scanner.nextLine();
        }

        System.out.println("[ 출력 결과 ]");

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + ". " + names[i]);
        }






    }
}
