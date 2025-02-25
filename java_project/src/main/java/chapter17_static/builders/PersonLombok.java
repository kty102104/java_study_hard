package chapter17_static.builders;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Setter
public class PersonLombok {
    // 필드 선언
    private String name;
    private int age;
    private String address;
}
