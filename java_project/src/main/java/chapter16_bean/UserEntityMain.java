package chapter16_bean;

import lombok.Lombok;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity userEntity1 = new UserEntity();
        userEntity1.setUsername(1);
        userEntity1.setPassword(9876);
        userEntity1.setEmail("a@test.com");
        userEntity1.setName("김일");

        System.out.println(userEntity1);

        // 롬복 적용한 부분을 처리하겠습니다.
        UserEntityLombok userEntity2 = new UserEntityLombok();
        userEntity2.setUsername(2);
        userEntity2.setPassword(1234);
        userEntity2.setEmail("b@test.com");
        userEntity2.setName("김이");

        userEntity2.getUsername();
        userEntity2.getPassword();
        userEntity2.getEmail();
        userEntity2.getName();

        System.out.println(userEntity2);










    }
}
