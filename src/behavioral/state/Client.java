package behavioral.state;

class Client {

    public static void main(String[] args) {
        Context context = new Context();

        // 1. StateA 상태 설정
        context.setState(new ConcreteStateA());

        // 2. 현재 StateA 상태에 맞는 메소드 실행
        context.request();

        // 3. StateB 상태 설정
        context.setState(new ConcreteStateB());

        // 4. StateB 상태에서 또다른 StateC 상태로 변경
        context.request();

        // 5. StateC 상태에 맞는 메소드 실행
        context.request();
    }
}
