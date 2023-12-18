package behavioral.state;

public class ConcreteStateB implements AbstractState {

    @Override
    public void requestHandle(Context cxt) {
        // 상태에서 동작을 실행한 후 바로 다른 상태로 바꾸기도 함
        // 예를 들어 전원 on 상태에서 끄기 동작을 실행한후 객체 상태를 전원 off로 변경 하듯이
        cxt.setState(ConcreteStateC.getInstance());
    }
}
