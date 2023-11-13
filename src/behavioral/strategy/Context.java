package behavioral.strategy;

//컨텍스트 (전략등록/ 실행)
public class Context {
    IStrategy Strategy; //전략 인터페이스를 합성

    //전략 교체 메소드
    public void setStrategy(IStrategy strategy) {
        this.Strategy = strategy;
    }

    //전략 실행 메소드
    public void doSomething(){
        this.Strategy.doSomething();
    }
}
