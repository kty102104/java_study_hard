package chapter11_arrays;

import java.util.Arrays;

public class ArrayTest07 {
    public static void main(String[] args) {
        // 빈 배열을 하나 선언
        int[][] numbers = new int[5][5];
        int num = 0;

        // 1부터 25까지의 숫자를 numbers 배열에 순서대로 값을 넣고 출력하시오.

        for(int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = ++num;          // num의 초기값이 0이기 때문에 1 더하고 대입
            }
        }

        System.out.println(Arrays.deepToString(numbers));

        /*
            향상된 for문의 주의할 점:
                향상된 for문은 기본적으로 배열의 요소를 '읽기'만 할 수 있고,
                '배열의 인덱스 접근 및 수정'에서는 사용이 어렵습니다.

            특히 이상의 과제의 경우에는
            직접적으로 인덱스 넘버를 사용해서 정해진 위치에 값을 대입해야 하기 때문에
            인덱스를 명시할 수 없는 향상된 for문의 사용이 까다롭습니다.

            그럼에도 불구하고 강제로 구현할 경우에는 다음과 같습니다.
         */

        for( int[] element : numbers) {
            for( int number : element ) {
                number = ++num;
                System.out.println(number + " ");
            }
        }

    }
}
