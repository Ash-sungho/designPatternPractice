package creational.templete;

public class Main {

    public static void main(String[] args) {
        // 템플릿 메서드가 실행할 구현화한 하위 알고리즘 클래스 생성
        AbstractTemplate templateA = new ImplementationA();

        // 템플릿 실행
        templateA.templateMethod();
    }
}
