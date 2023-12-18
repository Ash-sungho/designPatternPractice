package behavioral.state.practice;

public class Laptop {

    //상태를 나타내는 함수
    public static final int OFF = 0;
    public static final int SAVING = 1;
    public static final int ON = 2;

    //상태를 저장하는 함수
    private int powerState;

    public Laptop() {
        this.powerState = Laptop.OFF; //초기는 노트북이 꺼진 상태
    }

    void changeState(int state) {
        this.powerState = state;
    }

    // 전원 버튼 클릭
    void powerButtonPush() {
        if (powerState == Laptop.OFF) {
            System.out.println("전원 on");
            changeState(Laptop.ON);
        } else if (powerState == Laptop.ON) {
            System.out.println("전원 off");
            changeState(Laptop.OFF);
        } else if (powerState == Laptop.SAVING) {
            System.out.println("전원 on");
            changeState(Laptop.ON);
        }
    }

    void setSavingState() {
        System.out.println("절전 모드");
        changeState(Laptop.SAVING);
    }

    void typebuttonPush() {
        if (powerState == Laptop.OFF) {
            throw new IllegalStateException("노트북이 OFF 인 상태");
        } else if (powerState == Laptop.ON) {
            System.out.println("키 입력");
        } else if (powerState == Laptop.SAVING) {
            throw new IllegalStateException("노트북이 절전 모드인 상태");
        }
    }

    void currentStatePrint() {
        if (powerState == Laptop.OFF) {
            System.out.println("노트북이 전원 ON 인 상태 입니다.");
        } else if (powerState == Laptop.ON) {
            System.out.println("노트북이 전원 ON 인 상태 입니다.");
        } else if (powerState == Laptop.SAVING) {
            System.out.println("노트북이 절전 모드 인 상태 입니다.");
        }
    }

}
