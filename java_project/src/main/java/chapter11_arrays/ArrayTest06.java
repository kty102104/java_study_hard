package chapter11_arrays;
/*
    다차원 배열(Multi Dimensional Array) 중 2차원 배열

    : 다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 환경 상
    2차원 배열 이상을 사용하는 경우 극히 드물기 때문에 2차원 배열을 기준으로
    강의합니다

    형식 :

    int[][] arr01  = new int[크기][크기];          - 선언 방식 1
    int[][] arr02 = new int[크기][];              - 선언 방식 2
    int[][] arr03 = {{1, 2}, {3, 4}, {5, 6}};

    2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 함.
        -> 2번 방식을 참조
     1열 2열
      ↓  ↓
    { 1, 2 }, → 1행
    { 3, 4 }, → 2행
    { 5, 6 }  → 3행
 */
import java.util.Arrays;

public class ArrayTest06 {
    public static void main(String[] args) {
        int[][] arr03 = {{1, 2}, {3, 4}, {5, 6}};
//        System.out.println(arr03);
//        System.out.println(Arrays.toString(arr03));

        // 1차배열의 element를 뽑아내는 방법 -> for 반복문
        // 향상된 for문 예시
        for (int[] element : arr03) {
//            System.out.println(element);
            for (int number : element) {
                System.out.println(number);
                System.out.println("1씩 더해볼까요 : " + (number + 1));
            }
        }

//        for (int i = 0; i < arr03.length; i++) {
//            System.out.println(arr03[i]);
//            for (int j = 0; j < arr03[i].length; j++) {
//                System.out.println(arr03[i][j]);
//            }
//        }
        // 컴퓨터가 코드를 작성하고 출력하는 방식이 사람들에게 항상 가독성이 있는 것은 아닙니다.
        // 사람들이 보기 좋게 출력하는 방식 -> prettyPrinting / prettyWriting이라고 하는데
        int[][] arr02 = {               // 해당 배열의 크기는 [3][3]
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };          // 변수 선언 및 초기화니까 {}; 세미콜론이 붙었습니다.

        // 보통 이상과 같이 작성해둬서 다른 동료 개발자들이 2차 배열을 해석하기 좋게
        // 해주는 편입니다.


    }
}
