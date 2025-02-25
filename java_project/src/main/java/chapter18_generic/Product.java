package chapter18_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
    1. Product 클래스를 정의하고, 제네릭 타입 T를 사용하여 상품 정보를 저장할 수 있도록 작성하시오.
    2. ProductController 클래스를 만들어 다양한 타입의 상품 정보를 저장하고 출력하는 코드를 작성하시오.
    3. 각 상품에 대해 이름과 정보를 저장하고 출력하시오.

 */
@AllArgsConstructor
@Data
public class Product<T> {
    private String productName;
    private T productInfo;
}