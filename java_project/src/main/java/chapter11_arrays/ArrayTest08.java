package chapter11_arrays;
/*
    로또 번호 추첨기를 프로그래밍할 예정입니다.

    1. 1 - 45까지의 숫자를 임의로 생성한 후, lottoNumbers라는 배열에 저장할 예정
    2. 5번의 게임을 할 겁니다.
        - 로도 한 게임을 기준으로 할 때 6개의 번호를 뽑는 것을 5게임할 예정
    3. nextInt()를 통해서 번호를 뽑게 되면 중복 번호가 생길 수 있습니다.
        -> getter / setter와 같은 파트에서 중복 제거와 관련된 로직을 확인 가능
    4. 배열 완성 후 오름차순을 통해서 숫자들을 정렬하여 출력합니다.

    실행 예
    로또 번호 추첨기에 오신 것을 환영합니다.

    이번 로또 당첨 번호는 다음과 같습니다.
    [ 3, 12, 25, 13, 24, 21 ]
    [ 3, 25, 7, 4, 6, 8 ]
    [ 4, 15, 22, 30, 36, 41 ]
    [ 7, 8, 19,  21, 34, 42 ]
    [ 5, 6, 14, 18, 27, 33 ]
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08 {
    public boolean hasDuplicate(int[] arr, int n) {
        for (int element : arr) {
            if (n == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayTest08 test = new ArrayTest08();   // 객체 생성해야 hasDuplicate 사용 가능
        Random random = new Random();
        int totalGame = 5;
//        int a = random.nextInt(45);           // random.nextInt(한계값) -> 0 ~ (한계값-1)까지의 int값을 반환
//        System.out.println(a);  // 0 ~ 44까지 튀어나온다는 의미겠네요
//        int b = random.nextInt(46); // 이 경우 0번이 나올 수도 있겠네요

        // 중복 제거를 위한 변수 선언
        boolean duplicate;
        int[] lottoNumbers = new int[6];

        System.out.println("이번 로또 당첨 번호는 다음과 같습니다.");

        for (int i = 0; i < totalGame; i++) {
            for (int j = 0; j < 6; j++) {
                duplicate = false;
                int n = random.nextInt(45) + 1;
                for (int k = 0; k < j; k++) {
                    if (lottoNumbers[k] == n) {
                        duplicate = true;
                        break;
                    }
                }
                if(duplicate) {
                    j--;
                }
                else {
                    lottoNumbers[j] = n;
                }
//                if(test.hasDuplicate(lottoNumbers, n)) {
//                    j--;
//                }
//                else {
//                    lottoNumbers[j] = n;
//                }
            }
            System.out.println(Arrays.toString(lottoNumbers));
        }






    }
}
