package chapter07_methods;

import java.util.Scanner;

/*
    Method란? : Java에서는 함수의 개념과 동일함

    Method : 일련의 동작을 묶어서 정의한 것. 입력값과 출력값이 존재(optional)

    함수(function)와 메서드(method)가 동일한 개념이라면 왜 용어를 분리하는가?
        : 클래스 내부에 함수를 정의하게 되면 이를 메서드라고 함.
            Java의 경우는 모든 함수들이 특정 클래스에 종속돼있기 대문에 전부 다 메서드에 해당합니다.
            즉 다른 언어( ex)python )를 배우게 된다면 함수의 호출 방식과 메서드의 호출 방식 상에서의
            차이가 있기 대문에 해당 수업에서는 method로 용어를 통일할겁니다.
            혹시 Java 수업 중에 제가 함수라고 이야기하면 그냥 메서드라고 알아들으시면 되겠습니다.

    호출 형식 :
    1. 클래스명.메서드명()
    2. 객체명.메서드명()   -> scanner.nextInt() : 즉, 저희는 이미 method를 사용하고 있었습니다.
    3. 메서드명()       -> 이거 python 배우신 분들은 그래서 이게 함수 아니냐고 의문 가질 수 있습니다.

    method 정의 : 특정한 메서드를 클래스 내에 만드는 것
    method 호출(call) : main method나 혹은 클래스의 method 내에서 클래스명.메서드명() 혹은,
        객체명.메서드명 혹은 메서드명()으로 호출 가능 -> 즉 호출을 실행으로 보셔도 무방합니다.

    Java에서의 메서드
        1) method : 특정 작업을 수행하는 코드 블럭을 정의하는 방법

            예를 들어, '사진을 찍는다' 라는 행위에 대해서 생각해보면
            (1) 주머니에서 폰을 꺼내고,
            (2) 잠금 화면을 풀고,
            (3) 카메라를 켜고,
            (4) 사진을 찍고자 하는 대상에 폰을 조준하고,
            (5) 셔터를 누른다.

            컴퓨터는 시키는 대로만 하기 때문에 사진을 찍기 위해서는 (1) - (5)까지의 명령어를 입력해줘야 합니다.
            하지만 매번 그렇게 하기는 번거로우니까 '사진을 찍는다'라는 메서드 내에 (1) - (5)까지의 명령어를 미리 입력해두고,
            (메서드 정의에 해당), '사진을 찍는다'라는 명령어를 실행(메서드 호출)시키면 자동으로
            (1) - (5)까지의 명령을 순서대로 수행함.
                -> 즉, 메서드란 순차적으로 이루어지는 명령어들을 모아둔 것.

        2) 메서드 관련 용어 정리
            (1) 메서드 정의(define) : 사용자가 메서드를 새로 만드는 것을 의미.
            (2) 인수(argument) : 사용자가 메서드에 전달할 입력(input)
            (3) 매개변수(parameter) : 인수를 받아서 저장하는 변수명
            (4) 반환값/출력값/리턴값(return) : 메서드의 출력(return)
            (5) 메서드 호출(call) : 만들어진(혹은 미리 만들어진) 메서드를 실제로 사용하는 것

 */
public class Method01 {
    // 메서드 정의를 여기다가 할 예정입니다. 앞으로는 종종 main 메서드가 아래에 있거나 없는 경우가 발생합니다.

    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    // 2. [ o | x ]
    public static void call2(String strExample) {   // 정의 단계에서 ()내에 있는 것이 매개변수(파라미터)
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 : " + strExample);
    }

    // 3. [ x | o ]
    public static String call3() {  // return되는 자료형이 String임을 명시해줌.
        System.out.println("[ x | o ]");

        String result = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                result += "🎈";
            }
            result += "\n";                     // result라는 String(문자열)에 데이터들을 저장만 했을 뿐이지
            // 출력하라고 한 적이 없음.
        }
        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int date, String day) {
        System.out.println("[ o | o ]");

        return year + "년 " + month + "월 " + date + "일 " + day + "요일입니다.";
    }

    /*
        함수형 프로그래밍(functional programming) :
            메서드1의 return값이 메서드2의 argument가 되고, 메서드2의 return값이
            메서드3의 argument가 되는 방식으로,

            첫번째 메서드부터 마지막 메서드까지의 흐름을 통해
            플고ㅡ램이 이어지는 방식을 의미함
     */

    // 함수형 프로그래밍의 간단한 예시
    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n내년에 " + (age+1) + "살입니다.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myName;
        int myAge;

        System.out.print("이름을 입력하세요 >>> ");
        myName = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        myAge = scanner.nextInt();
        // 이상의 코드는 scanner의 메서드 nextLine() nextInt()를 사용해서 그 결과값을 각각
        // myName, myAge라는 변수에 저장한 부분입니다.

        System.out.println(introduce(myName, myAge));
        // 이상의 코드는 107-110라인까지의 결과값들을 새로운 메서드인 introduce()의 name, age 매개변수에
        // 각각 myName 및 myAge를 argument로 집어넣어서, introduce() 메서드 내에서
        // 데이터들을 재가공하는 결과를 거칩니다.



//        call1();
//        call2("웹 수업 잘하기...😥");      // 호출 단계에서 ()내에 있는 것이 argument
//        call3();    // 이렇게 작성했을 때, 우리가 위에서 작성한 for 반복문의 결과값이 나오지 않습니다.
//
////        System.out.println(call3());
//
//        String starWritten = call3();       // 메서드의 결과값을 변수에 대입하여,
//        System.out.println(starWritten);    // 출력하는 방식
//
//        System.out.println(call4(2025, 2, 5, "수"));
//
//        String finalDate = call4(2025, 2, 5, "수");
//        System.out.println(finalDate);
    }
}
