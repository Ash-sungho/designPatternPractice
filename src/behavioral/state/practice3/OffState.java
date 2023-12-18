package behavioral.state.practice3;

public class OffState implements PowerState {

    private OffState(){}

    private static class SingleInstanceHolder {
        private static final OffState INSTANCE = new OffState();
    }

    public static OffState getInstance(){
        return SingleInstanceHolder.INSTANCE;
    }

    @Override
    public void powerButtonPush(LaptopContext cxt) {
        System.out.println("노트북 전원 ON");
        cxt.changeState(OnState.getInstance());
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
