package behavioral.state.practice2;

public class LaptopContext {

    PowerState powerState;

    public LaptopContext(PowerState state) {
        this.powerState = state;
    }

    public void changeState(PowerState state) {
        this.powerState = state;
    }

    void setSavingState() {
        System.out.println("노트북 절전 모드");
        changeState(new SavingState());
    }

    void powerButtonPush() {
        powerState.powerButtonPush(this);
    }

    void typeButtonPush() {
        powerState.typeButtonPush();
    }

    void currentStatePrint() {
        System.out.println(powerState.toString());
    }
}
