package behavioral.state;

class Context {

    AbstractState state; // composition

    void setState(AbstractState state) {
        this.state = state;
    }

    // 상태에 의존한 처리 메소드로서 state 객체에 처리를 위임함
    void request() {
        state.requestHandle(this);
    }
}
