package chapter08_classes.car;

public class Car {
    // 필드(속성)
    String color;
    int speed;

    // 메서드(행동)
    void drive() {
        System.out.println(color + " 자동차가 " + speed + "km/h 주행 중입니다.") ;
    }

    void stop() {
        System.out.println(color + " 자동차가 멈췄습니다.");

    }
}
