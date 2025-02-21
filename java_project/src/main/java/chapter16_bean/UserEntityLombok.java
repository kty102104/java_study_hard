package chapter16_bean;

import lombok.Getter;
import lombok.Setter;
/*
    ctrl + alt + s / 상단에 메뉴바(햄버거) file - settings 들어갑니다

    Lombok 설치 과정
    좌측 부분 스크콜링해서 하단으로 내려가면 plugin에서 lombok ->
    설치 -> enabled되게끔 합니다 (disabled가 보이면 현재 활성화상태)

    chrome mvn 검색 Maven Repository가 나오게 되는데
    거기 검색창에서 lombok 검색합니다.
    build system에 맞게 버전 선택하고 의존성을 추가하면 되는데,
    저희는 애초에 만들때 gradle로 만들었기 때문에 build.gradle에 있습니다.

    build.gradle에 의존성 부분에 추가를 하고 나서
    maven 경우에는 pom.xml에 dependencies에 추가하고 나서
    -> 코끼리 새로고침 해야합니다.

    20250224 수업 예정 내용 -> 그래서 롬복은 어디다가 / 왜 쓰는거고 / 어떤 기능이 있는지


 */

@Getter
@Setter
public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;
}
