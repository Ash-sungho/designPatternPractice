전략패턴 사용시기

1. 전략 알고리즘의 여러 버전 또는 변형이 필요할 때 클래스화를 통해 관리
2. 알고리즘 코드가 노출되어서는 안 되는 데이터에 엑세스 하거나 데이터를 활용할때(캡슐화)
3. 알고리즘의 동작이 런타임에 실시간으로 교체되어야 할때

주의사항
1. 알고리즘이 많아질수록 관리해야할 객체의 수가 늘어난다는 단점이 있다.
2. 만일 어플리케이션 특성이 알고리즘이 많지 않고 자주 변경되지 않는다면, 새로운 클래스와 인터페이스를 만들어 프로그램을 복잡하게 만들 이유가 없다.
3. 개발자는 적절한 전략을 선택하기 위해 전략 간의 차이점을 고려하고 있어야 한다.(복잡도가 높아진다)