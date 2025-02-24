package chapter17_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        // 객체를 생성
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        // 2, 3, 4는 이미 만들어진 instance를 참조

        productView1.showMainView();
        productView2.showMainView();
        productView3.showMainView();
        productView4.showMainView();
    }
}
