package chapter09_setter_getter.univ_student;
/*
    1. 클래스 설계
        field 설게 : name / grade / score(double) -> 그리고 전부 private

    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 생성자
        4) 이름과 학년을 받는 생성자
        5) 이름, 학년, 점수를 받는 생성자

    3. Setter / Getter 메서드 정의 - > 얘도 alt + insert 가능
        각각의 필드에 대한 Setter / Getter 만듭니다. Setter 3개 / Getter 3개
        1) setGrade의 범위 1 ~ 4학년
        2) setScore의 범위 0.0 ~ 4.5

    4. UnivStudentMain.java를 생성하시고
        student01 -> 기본 생정자 이용 김일 / 1 / 3.3
        student02 -> 이름만 받는 생성자 김이 / 2 / 4.0
        student03 -> 학년만 받는 생정자 김삼 / 3 / 2.7
        student04 -> 이름과 학년을 받는 생정자 김삼 / 4 / 3.8
        student05 -> 이름 학년 점수를 받는 생정자 김오 / 1 / 1.0

    5. 콘솔창에
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
    으로 출력될 수 있도록 showInfo() 메서드를 call1() 유형으로 작성하여 UnivStudent.java에 추가
    UnivStudentMain에서 student01.showInfo()로 호출할 수 있도록 하시오.
 */
public class UnivStudent {
    // 1. 필드 선언
    private String name;
    private int grade;
    private double score;

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 4) {
            return;
        }
        this.grade = grade;
    }

    public void setScore(double score) {
        if (score < 0.0 || score > 4.5) {
            return;
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("학점 : " + score);
        System.out.println("----------");
    }
}
