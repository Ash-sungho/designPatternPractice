package behavioral.state;

public class ConcreteStateC implements AbstractState {

    private static final ConcreteStateC instance = new ConcreteStateC();

    private ConcreteStateC(){}

    public static AbstractState getInstance() {
        return instance;
    }

    @Override
    public void requestHandle(Context cxt) {

    }
}
