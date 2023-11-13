package behavioral.strategy;

// 전략 알고리즘 A
public class ConcreteStorageA implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("A전략입니다.");
    }
}
