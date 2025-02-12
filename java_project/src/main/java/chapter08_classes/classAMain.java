package chapter08_classes;

import java.util.Scanner;

public class classAMain {
    public static void main(String[] args) {

        // ClassA import -> Scanner와 유사
        // 객체 생성 방식
        ClassA classA1 = new ClassA();
    // 클래스명 객체명 = new 클래스명();       -> 클래스명다음에 왜 ()있는지는 추후 설명 예정.

        Scanner scanner = new Scanner(System.in);
        // Scanner 클래스의 instance인 scanner 생성

        Scanner sc = new Scanner(System.in);

//        System.out.print("이름을 입력하세요 >>> ");
//        // classA1 객체의 name이라는 속성에 값을 대입
//        classA1.name = scanner.nextLine();
//
//        System.out.print("나이를 입력하세요 >>> ");
//        // classA1 객체의 name이라는 속성에 값을 대입
//        classA1.num = sc.nextInt();
//
//        System.out.println("이름 : " + classA1.name);
//        System.out.println("나이 : " + classA1.num);

        // 이상의 코드에서 확인할 수 있는 부분 :
        // 특정 객체[의 속성을 참조하기 위해서는
        // '객체명.속성명'으로 할 수 있습니다.

        // 메서드 호출 방법
//        classA1.name = "안근수";       // Scanner 사용하지 않고 속성에 값을 대입할 수도 있음
//        classA1.callName();

        /*
            ClassA의 인스턴스인 classA2를 생성하고,
            name에 여러분 이름
            num에 여러분 나이
            score = 4.5를 입력하는데, scanner 객체를 사용해서 작성

            실행 예

            classA2의 이름은 여러분이름이고 나이는 여러분나이입니다. 이번 학기 점수는 4.5점입니다.

            그리고 메서드를 호출하여

            여러분 이름을(를) 부릅니다.
         */

        ClassA classA2 = new ClassA();

        System.out.print("이름을 입력하세요 >>> ");
        classA2.name = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        classA2.num = scanner.nextInt();
        System.out.print("점수를 입력하세요 >>> ");
        classA2.score = scanner.nextDouble();

        System.out.println("classA2의 이름은 " + classA2.name + "이고 나이는 " + classA2.num + "입니다. " +
                "이번 학기 점수는 " + classA2.score + "점 입니다.");

        // 메서드 호출
        classA2.callName();
    }
}
