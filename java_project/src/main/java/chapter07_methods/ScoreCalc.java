package chapter07_methods;

import java.util.Scanner;

/*
    점수들을 입력 받아서 총합 및 평균 점수를 내는 프로그램을 구현
    여태까지는 main 단계에서 전체를 작성해왔습니다.

    하지만 이제부터는 method 부분과 실행 부분(main메서드가 적용된 부분)을 나누는
    과정을 거치도록 하겠습니다.
 */
public class ScoreCalc {
//    // 1. 총합을 내는 메서드 : call4()
    public static double addScores(double totalscore, double addedScore) {
        return totalscore + addedScore;
    }

    // 2. addScores() 메서드를 오버로딩하여 매개 변수가 3, 4, 5, 6인 메서드들을 만드세요.
//    public static double addScores(double score1, double score2, double score3) {
//        return score1 + score2 + score3;
//    }
//
//    public static double addScores(double score1, double score2,
//                                   double score3, double score4) {
//        return score1 + score2 + score3 + score4;
//    }
//
//    public static double addScores(double score1, double score2, double score3,
//                                   double score4, double score5) {
//        return score1 + score2 + score3 + score4 + score5;
//    }
//
//    public static double addScores(double score1, double score2, double score3,
//                                   double score4, double score5, double score6) {
//        return score1 + score2 + score3 + score4 + score5 + score6;
//    }
//
    // 평균을 내는 메서드를 정의 : call4()
    public static double calculateAvg(double totalscore, int numOfSubjects) {
        return totalscore / numOfSubjects;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 목록
//        double score1, score2, totalScore, avgScore;
//        int totalSubjects;

//        System.out.print("1과목의 점수를 입력하세요 >>> ");
//        score1 = scanner.nextDouble();
//        System.out.print("2과목의 점수를 입력하세요 >>> ");
//        score2 = scanner.nextDouble();
//        totalScore = score1 + score2;
//        totalSubjects = 2;
//        avgScore = totalScore / totalSubjects;
//        System.out.println("당신의 총점은 : " + totalScore);
//        System.out.println("당신의 평균은 : " + avgScore);

//        System.out.println(addScores(100, 78));
//        System.out.println(addScores(100, 30));

        // 변수를 여러 개 선언할 필요 없이 평균을 구하는 방식
//        System.out.println(calculateAvg(addScores(100, 80), 2));

        // 이상의 코드는 오버로딩이 항상 만능은 아니라는 점이고,
        // 기존에 있는 메서드를 main 단계에서 어떻게 잘 활용하면 무분별하게 오버로딩을
        // 하지 않아도 되는지를 보여드리기 위함입니다.

        // 사용할 변수 목록
        boolean endOfCalc = false;
        double score1, totalScore = 0, avgScore = 0;
        int totalSubs = 1;  // 과목 수

        // 점수 입력을 반복하기 위한 while문 작성
        while(!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            if (score1 == -1) { // 굳이 '종료'나 'x'가 아닌 -1을 입력했을 때
                break;              // 종료되게끔 코드를 작성해야만 하는가? -> nextDouble로 받기 때문
            }
            // 합을 계산
            totalScore = addScores(totalScore, score1); // 반복문을 처음 돌 때는 addScores(0, score1)

            // 평균을 계산
            avgScore = calculateAvg(totalScore, totalSubs);
            System.out.println("----- 점수 입력 시 마다 나오는 합계와 평균 -----");
            System.out.println("입력한 점수의 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

            // 과목 수 추가
            totalSubs++;
        }

        System.out.println("----- 최종 합계와 평균 -----");
        System.out.println("입력한 점수의 합계 : " + totalScore);
        System.out.println("입력한 점수의 평균 : " + avgScore);
    }
}
