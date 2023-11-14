package creational.templete.practice4;

public class Client {
    public static void main(String[] args) {
        //업 캐스팅 (고수준 모듈 타입으로 인스턴스화)
        Higher obj = new LowerA();

        //상위 클래스로 메서드가 통일되어 있기에 메서드 실행에 문제가 없음
        obj.print(1000);
        obj.calculate(10, 20);

        // 만일 다른 자식 클래스로 교체할 필요가 있다면,
        obj = new LowerB();
        obj.calculate(100, 200);


        /*
           상속을 통해 중복되는 코드를 상위 클래스로 통일시켜 코드 중복을 제거하고,
           메서드 시그니처가 같지만 내부 로직이 자식 클래스마다 다른 부분은 추상 메소드를 통해 상위 클래스에서 다형성으로 메서드를 실행할 수 있도록,
           고수준의 타입으로 유지하라는 것이다.
         */
    }
}
