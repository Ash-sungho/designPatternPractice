package behavioral.state.practice3;

public class OnState implements PowerState {

    private OnState(){}

    private static class SingleInstanceHolder {
        private static final OnState INSTANCE = new OnState();
    }

    public static OnState getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    @Override
    public void powerButtonPush(LaptopContext context) {
        System.out.println("노트북 전원 OFF");
        context.changeState(OffState.getInstance());
    }

    @Override
    public void typeButtonPush() {
        System.out.println("키 입력");
    }
    @Override
    public String toString() {
        return "노트북이 전원 ON 인 상태 입니다.";
    }
}
