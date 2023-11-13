package behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        //컨텍스트생성
        Context context = new Context();
        //전략생성
        IStrategy strategyA = new ConcreteStorageA();
        //전략 교체
        context.setStrategy(strategyA);
        //전략 실행
        context.doSomething();

        //전략생성
        IStrategy strategyB = new ConcreteStorageB();
        //전략 교체
        context.setStrategy(strategyB);
        //전략 실행
        context.doSomething();


    }
}
