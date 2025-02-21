package chapter15_objects.students;
/*
    1. 해당 클래스에 학생 이름(name), 학번(studentId)를 String, int로 저장하는 필드 작성하시오.
    2. toString()을 Override 받고, 재정의하여 다음과 같이 콘솔에 찍히도록 작성하시오.
        실행 예
        해당 학생의 학번은 20250001이고, 이름은 김일입니다.

    3. 해당 지시 사항을 만족하시오.
        1) Student 클래스는 name과 studentId를 private 접근 지정자로 가지고 있어야 함.
        2) AllArgsConstructor 생성자를 만들어야 함.
            student1 = "안근수" 20250001
            student2 = "여러분이름" 20250002
    4. 각 필드 별로 setter / getter를 생성하시오.

 */
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("안근수", 20250001);
        Student student2 = new Student("김이", 20250002);

        System.out.println(student1);
        System.out.println(student2);
    }
}
