package chapter12_inheritance.products;

public class Product extends Item {
    // 자식 클래스 만의 field를 선언
    private int price;
    private int stock;

    public Product(String name, String category, int price, int stock) {
        super(name, category);  // 부모의 field들을 가지고 오는 super() 키워드
        this.price = price;     // 자식 클래스의 필드 생성자 만들 때 쓰던 거 그대로
        this.stock = stock;
    }

    // 부모 필드에 관한 setter / getter
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    // 자식 필드에 관한 setter / getter를 생성하시오.
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // 고유 메서드 추가하겠습니다
    public void displayInfo() {
        System.out.println("제품명 : " + this.getName());
        System.out.println("카테고리 : " + this.getCategory());
        System.out.println("가격 : " + this.getPrice());
        System.out.println("재고 : " + this.getStock());

    }
}
