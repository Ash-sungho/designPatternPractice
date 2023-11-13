package behavioral.strategy.practice;

public class Main {

    public static void main(String[] args) {

        //전략생성
        IStrategy storageA = new ConcreateStorageA();
        //Context 생성
        Context context = new Context(storageA);
        context.doSomething();

        //전략생성2
        IStrategy storageB = new ConcreateStorageB();
        //전략변경
        context.setIStrategy(storageB);
        context.doSomething();



    }
}
