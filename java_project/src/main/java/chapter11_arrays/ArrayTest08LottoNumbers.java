package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08LottoNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int totalGame = 5;
        int[] lottoNumbers = new int[6];
        // 중복 제거를 위한 변수 선언
        boolean duplicate;
        // 배열에 집어넣기 전에 중복인지 확인하는 변수 선언
        int number;

        System.out.println("이번 로또 당첨 번호는 다음과 같습니다.");

        for (int j = 0; j < totalGame; j++) {
            for (int i = 0; i < 6; i++) {
                duplicate = false;  // 여기서 초기화했습니다. -> 예를 들어 직접 반복에서 true가 떴다고 가정했을 때 계속해서 true가 뜸
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
        }
    }
}
