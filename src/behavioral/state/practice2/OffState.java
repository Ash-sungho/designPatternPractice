package behavioral.state.practice2;

public class OffState implements PowerState{

    @Override
    public void powerButtonPush(LaptopContext cxt) {
        System.out.println("노트북 전원 ON");
        cxt.changeState(new OnState());
    }

    @Override
    public void typeButtonPush() {
        throw new IllegalStateException("노트북이 OFF 인 상태");
    }

    @Override
    public String toString() {
        return "노트북이 전원 OFF 인 상태 입니다.";
    }
}
