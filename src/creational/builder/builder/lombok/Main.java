package creational.builder.builder.lombok;

import creational.builder.builder.Student;
import creational.builder.builder.StudentBuilder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("홍길동")
                .age("26")
                .gender("man") // 선택 파라미터
                .job("Warrior")
                .birthday("1800.10.10")
                .address("조선")
                .build();
        System.out.println(person);

    }
}