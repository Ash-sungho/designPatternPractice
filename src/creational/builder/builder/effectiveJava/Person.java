package creational.builder.builder.effectiveJava;

public class Person {
    // final 키워드로 필드들을 불변 객체로 만든다.
    private final String name;
    private final int age;
    private final String gender;
    private final String job;
    private final String birthday;
    private final String address;

    // 정적 내부 빌더 클래스
    public static class Builder {
        // 필수 파라미터
        private final String name;
        private final int age;

        // 선택 파라미터
        private String gender;
        private String job;
        private String birthday;
        private String address;

        // 필수 파라미터는 빌더 생성자로 받게 한다
        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 선택 파라미터는 각 메서드를 통해 정의한다
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder birthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        // 대상 객체의 private 생성자를 호출하여 최종 인스턴스화 한다
        public Person build() {
            return new Person(this); // 빌더 객체 자신을 넘긴다.
        }
    }

    // private 생성자 - 생성자는 외부에서 호출되는것이 아닌 빌더 클래스에서만 호출되기 때문에
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.job = builder.job;
        this.birthday = builder.birthday;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
