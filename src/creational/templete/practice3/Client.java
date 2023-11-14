package creational.templete.practice3;

public class Client {
    public static void main(String[] args) {
        //업 캐스팅 (고수준 모듈 타입으로 인스턴스화)
        Higher obj = new LowerA();

        //상위 클래스로 메서드가 통일되어 있기에 메서드 실행에 문제가 없음
        obj.print(1000);

        //하지만 메서드 내부 로직이 다른 경우 상위 클래스로 묶어 줄수가 없어, 하위 클래스에 따로 정의해야하고 다운캐스팅을 통해 실행해야 한다.
        ((LowerA)obj).calculate(10,20);

        // 만일 다른 자식 클래스로 교체할 필요가 있다면,
        obj = new LowerB();

        // 역시 다운 캐스팅을 통해 실행해야 한다.
        ((LowerB) obj).operation(100, 200);
    }
}
