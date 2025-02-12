package chapter08_classes.score_calc;

import java.util.Scanner;

public class ScoreCalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreCalc scoreCalc = new ScoreCalc();

        boolean endOfCalc = false;
        double score1, totalScore = 0, avgScore = 0;
        int totalSubs = 1;

        /*
            chapter07의 ScoreCalc와 동일하게 기능하도록 작성하시오.
         */

        while(!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            if (score1 == -1) {
                break;
            }
            totalScore = scoreCalc.addScores(totalScore, score1);

            avgScore = scoreCalc.calculateAvg(totalScore, totalSubs);
            System.out.println("----- 점수 입력 시 마다 나오는 합계와 평균 -----");
            System.out.println("입력한 점수의 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

            totalSubs++;
        }

        System.out.println("----- 최종 합계와 평균 -----");
        System.out.println("입력한 점수의 합계 : " + totalScore);
        System.out.println("입력한 점수의 평균 : " + avgScore);
    }
}