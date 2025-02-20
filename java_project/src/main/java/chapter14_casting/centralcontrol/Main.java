package chapter14_casting.centralcontrol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int MAXDEVICE = 7;

        Computer computer1 = new Computer();
        LED led1 = new LED();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        Tv tv1 = new Tv();

        CentralControl centralControl = new CentralControl(new Power[MAXDEVICE]);   // 빈 Power배열을 생성
        // -> centralControl의 field로 삼았네요.

//        centralControl.deviceArray[0] = computer1;    -> deviceArray가 private이므로 불가능
        // -> 메서드를 통해서 Power의 자식 객체들을 추가해야 함.

        centralControl.addDevice(computer1);
        centralControl.addDevice(led1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(tv1);
        System.out.println();

        centralControl.powerOn();
        System.out.println();

        centralControl.performSpecificMethod();
        System.out.println();

        centralControl.powerOff();
        System.out.println();

         centralControl.displayInfo();
    }
}
/*
    다음 지시 사항에 따라 코드를 작성하시오.

    Mouse.java / Tv.java 클래스를 생성하고
    centralControl 객체의 배열 크기를 5개로 늘린 후
    Mouse 클래스의 객체인 mouse1, Tv 클래스의 객체인 tv1을 centralControl의 deviceArray 필드에 담아
    전체 다 powerOn() 시키고, 그 후 powerOff() 시키시오.

    연결됐다
    켜졌다
    꺼졌다
 */