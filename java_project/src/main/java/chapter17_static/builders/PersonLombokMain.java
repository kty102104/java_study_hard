package chapter17_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder().build();
        System.out.println(person1);

        /*
            PersonLombok에 setter / getter를 정의하여
            김일 / 19 / 부산광역시 부산진구 를 적용하여
            sout을 사용하여 정보를 출력하시오.

            person2 - 김이 -> setter 이용 / 89 / 경상남도 양산시
            person3 - 김삼 / 21 -> setter 이용 / 광주광역시 북구
            person4 - 김사 / 39 / 서울특별시 마포구
         */

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();
        person2.setAge(89);
        person2.setAddress("경상남도 양산시");
        System.out.println(person2);

        PersonLombok person3 = PersonLombok.builder()
                .name("김삼")
                .age(21)
                .build();
        person3.setAddress("광주광역시 북구");
        System.out.println(person3);

        PersonLombok person4 = PersonLombok.builder()
                .name("김사")
                .age(39)
                .address("서울특별시 마포구")
                .build();
        System.out.println(person4);

    }
}
