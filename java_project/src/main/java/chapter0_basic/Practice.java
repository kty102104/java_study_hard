package chapter0_basic;
/*
    생성자, setter, getter 자동 생성 : alt + insert
    여러 개 선택 : shift + 아래화살표


 */



import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = 10;

        // 기본형 타입의 클래스 정보를 출력
        System.out.println("Type of num: " + ((Object) num).getClass().getName());  // Error 발생

        System.out.println("Type of int: " + Integer.TYPE.getName());





    }

}
