package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;
/*
    강사버전 참조하셔서 가장 상위의 for문을 while형태로 바꿔쓰고 정상적으로
    작동하는지 확인하시오.
 */
public class ArrayTest08While {
    public static void main(String[] args) {
        Random random = new Random();
        int totalGame = 5;
        int[] lottoNumbers = new int[6];
        // 중복 제거를 위한 변수 선언
        boolean duplicate;
        // 배열에 집어넣기 전에 중복인지 확인하는 변수 선언
        int number;

        System.out.println("이번 로또 당첨 번호는 다음과 같습니다.");

        while (totalGame > 0) {
            for (int i = 0; i < 6; i++) {
                duplicate = false;
                number = random.nextInt(45) + 1;
                for (int k = 0; k < i; k++) {
                    if (lottoNumbers[k] == number) {
                        duplicate = true;
                    }
                }
                if (!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
            totalGame--;
        }
    }
}
