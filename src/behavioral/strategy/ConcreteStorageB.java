package behavioral.strategy;
// 전략 알고리즘 B
public class ConcreteStorageB implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("B전략입니다.");
    }
}
