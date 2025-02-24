package chapter16_bean.persons;

import lombok.*;

@RequiredArgsConstructor
@Data
@AllArgsConstructor     // Data와 AllArgsConstructor 같이 사용할 경우 생성자 오류 주의

public class PersonLombok {
    private final String name;
    private int age;

    /*
        Lombok 애너테이션을 사용하여 생성자 / getter / setter를 만들어줍니다.
        PersonMain으로 가서
        PersonLombok의 객체 person2를 생성하시고(name만 가지고 생성), 이름 - 여러분이름, 나이 - 여러분나이
        toString() 메서드를 정의하여
        실행 예
        이름 : 여러분이름
        나이 : 여러분나이

        로 출력될 수 있도록 하시오.

        person4를 AllArgsConstructor를 활용하여 김사 19로 생성하고
        객체 이름만으로 필드 정보를 출력하시오.
     */

    @Override
    public String toString() {
        return "이름 : " + name + "\n나이 : " + age + '\n';
    }

    /*
        @Data를 정의했을 경우
        @ToString이 포함돼있긴 하지만
        여러분들이 코드 하단에 toString()을 Override받아 재정의했을 경우
        재정의한 toString()이 우선적으로 사용됩니다.
     */
}
