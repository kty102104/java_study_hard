package chapter08_classes.car;

public class CarMain {
    public static void main(String[] args) {
        /*
            1. Car의 인스턴스인 myCar 객체 생성
            2. color에 "빨강" 대입하고, 콘솔창에 출력
            3. speed에 100 대입하고, 콘솔창에 출력
            4. yourcar 객체 생성
            5. color에 "노랑" 대입하고, speed에 140을 대입하고, 둘 다 출력
            6. myCar는 drive() 메서드 호출, yourCar는 stop() 메서드를 호출
        */

        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "빨강";
        myCar.speed = 100;
        yourCar.color = "노랑";
        yourCar.speed = 140;

        System.out.println(myCar.color);
        System.out.println(myCar.speed);
        System.out.println(yourCar.color);
        System.out.println(yourCar.speed);
        myCar.drive();
        yourCar.stop();
    }
}
