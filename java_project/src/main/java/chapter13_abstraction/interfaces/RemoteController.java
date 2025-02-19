package chapter13_abstraction.interfaces;
/*
    이 부분에서 고려해야할 점은
    자바는 단일 상속만 가능하기 때문에
    VU / VD / PB 셋 중에 하나만 상속할 수 있을 것 같은데
    어떻게 VU / VD / PB 여기에 있는 애들의 메서드들을 전부 다 사용하게 작성할 수 있을까
    입니다.
 */
public class RemoteController {
    // 상속 안 받습니다
    // 필드 선언 -> 이전까지는 Java의 기본 자료형만을 사용했지만
    // 이번에 처음으로 우리가 직접 정의한 클래스가 자료형이 되는 필드를 적용했습니다.
    private PowerButton powerButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    public RemoteController(PowerButton powerButton,
                            VolumeDownButton volumeDownButton,
                            VolumeUpButton volumeUpButton,
                            ChannelDownButton channelDownButton,
                            ChannelUpButton channelUpButton) {
        this.powerButton = powerButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
    }

    // 메서드 구현
    // PowerButton의 메서드를 구현
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    // VolumeDownButton의 메서드를 구현
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        channelUpButton.onUp();
    }
    /*
        ChannelDownButton을 정의하는데
        -> Button을 상속받아서
        -> method들을 정의합니다 -> VolumeDownButton을 참조해서
        "채널을 한 칸 내립니다."
        "채널을 계속 내립니다."
        -> ChannelUpButton까지 동일하게 작성 후
        -> RemoteController에 ChannelDownButton / ChannelUpButton을 field에 추가 -> 생성자도 수정
        -> onPressedChannelDown / onPressedChannelUp / onDownChannelDown / onUpChannelUp 메서드 정의
        -> Main -> RemoteController 객체 생성 시에 생성자 부분도 이루어져야합니다.
        remoteController에 위 4개 메서드 적용

        과제 2

        TemperatureDownButton, TemperatureUpButton, AirConditionerController.java
        클래스를 만들고 정의해서

        Main에 AirConditionerController 객체 생성한 후

        전원을 켭니다.

        온도를 한 칸 내립니다.
        온도를 계속 내립니다.

        온도를 한 칸 올립니다.
        온도를 계속 올립니다.

        전원을 끕니다.
     */


}
