package chapter14_casting.centralcontrol;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("TV의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("TV의 전원을 끕니다.");
    }

    public void changeChannel() {
        System.out.println("채널을 변경합니다.");
    }

}
