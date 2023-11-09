package creational.builder.problem.javabeenPattern;

public class Hamburger {

    private int bun;
    private int patty;

    // 선택 매개변수
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }
}

/**
 *
 * public static void main(String[] args) {
 *     // 모든 재료가 있는 햄버거
 *     Hamburger hamburger1 = new Hamburger();
 *     hamburger1.setBun(2);
 *     hamburger1.setPatty(1);
 *     hamburger1.setCheese(2);
 *     hamburger1.setLettuce(4);
 *     hamburger1.setTomato(6);
 *     hamburger1.setBacon(8);
 *
 *     // 빵과 패티 치즈만 있는 햄버거
 *     Hamburger hamburger2 = new Hamburger();
 *     hamburger2.setBun(2);
 *     hamburger2.setPatty(1);
 *     hamburger2.setCheese(2);
 *
 *     // 빵과 패티 베이컨만 있는 햄버거
 *     Hamburger hamburger3 = new Hamburger();
 *     hamburger3.setBun(2);
 *     hamburger2.setPatty(1);
 *     hamburger3.setBacon(8);
 * }
 *
 * 기존 생성자 오버로딩에서 나타났던 가독성 문제점이 사라지고 선택적인 파라미터에 대해 해당되는 Setter 메서드를 호출함으로써 유연적으로 객체 생성이 가능해졌다.
 * 하지만 이러한 방식은 객체 생성 시점에 모든 값들을 주입 하지 않아 일관성(consistency) 문제와 불변성(immutable) 문제가 나타나게 된다.
 *
 * 1.일관성 문제
 *
 * 필수 매개변수란 객체가 초기화될때 반드시 설정되어야 하는 값이다.
 * 하지만 개발자가 깜빡하고 setBun() 이나 setPatty() 메서드를 호출하지 않았다면 이 객체는 일관성이 무너진 상태가 된다.
 * 즉, 객체가 유효하지 않은 것이다. 만일 다른곳에서 햄버거 인스턴스를 사용하게 된다면 런타임 예외가 발생할 수도 있다.
 * 이는 객체를 생성하는 부분과 값을 설정하는 부분이 물리적으로 떨어져 있어서 발생하는 문제점이다.
 * 물론 이는 어느정도 생성자(Constructor)와 결합하여 극복은 할 수 있다.
 * 하지만 다음에 소개할 불변성의 문제 때문에 자바 빈즈 패턴은 지양해야 한다.
 *
 * 2. 불변성 문제
 *
 * 자바 빈즈 패턴의 Setter 메서드는 객체를 처음 생성할때 필드값을 설정하기 위해 존재하는 메서드이다.
 * 하지만 객체를 생성했음에도 여전히 외부적으로 Setter 메소드를 노출하고 있으므로,
 * 협업 과정에서 언제 어디서 누군가 Setter 메서드를 호출해 함부로 객체를 조작할수 있게 된다. 이것을 불변함을 보장할 수 없다고 얘기한다.
 * 마치 완성된 햄버거에 중간에 치즈를 교체한다고 햄버거를 막 분리하는 것과 같은 이치이다 (입맛 떨어지게)
 *
 * 빌더(Builder) 패턴
 * 빌더 패턴은 이러한 문제들을 해결하기 위해 별도의 Builder 클래스를 만들어 메소드를 통해 step-by-step 으로 값을 입력받은 후에 최종적으로 build() 메소드로 하나의 인스턴스를 생성하여 리턴하는 패턴이다.
 * 빌더 패턴 사용법을 잠시 살펴보면,
 * StudentBuilder 빌더 클래스의 메서드를 체이닝(Chaining) 형태로 호출함으로써 자연스럽게 인스턴스를 구성하고 마지막에 build() 메서드를 통해 최종적으로 객체를 생성하도록 되어있음을 볼 수 있다.
 *
 * public static void main(String[] args) {
 *
 *     // 생성자 방식
 *     Hamburger hamburger = new Hamburger(2, 3, 0, 3, 0, 0);
 *
 *     // 빌더 방식
 *     Hamburger hamburger = new Hamburger.Builder(10)
 *         .bun(2)
 *         .patty(3)
 *         .lettuce(3)
 *         .build();
 * }
 *
 * 빌더 패턴을 이용하면 더이상 생성자 오버로딩 열거를 하지 않아도 되며,
 * 데이터의 순서에 상관없이 객체를 만들어내 생성자 인자 순서를 파악할 필요도 없고 잘못된 값을 넣는 실수도 하지 않게 된다.
 * 점층적 생성자 패턴과 자바빈즈 패턴 두 가지의 장점만을 취하였다고 볼 수 있다.
 */
