package behavioral.state.practice3;

public class SavingState implements PowerState {


    @Override
    public void powerButtonPush(LaptopContext context) {
        System.out.println("노트북 전원 on");
        context.changeState(new OnState());
    }

    @Override
    public void typeButtonPush() {
        throw new IllegalStateException("노트북이 절전 모드인 상태");
    }
    @Override
    public String toString() {
        return "노트북이 절전 모드 인 상태 입니다.";
    }
}
