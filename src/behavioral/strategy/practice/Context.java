package behavioral.strategy.practice;

public class Context {

    private  IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void doSomething(){
        iStrategy.doSomething();
    }

    public void setIStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
}
