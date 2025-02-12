package chapter08_classes.score_calc;

public class ScoreCalc {
    boolean endOfCalc = false;
    double score1, totalScore = 0, avgScore = 0;
    int totalSubs = 1;  // 과목 수

    public static double addScores(double totalscore, double addedScore) {
        return totalscore + addedScore;
    }

    public static double calculateAvg(double totalscore, int numOfSubjects) {
        return totalscore / numOfSubjects;
    }
}

