package creational.builder.builder;

public class Main {
    public static void main(String[] args) {
       Student student = new StudentBuilder()
               .id(2016120091)
               .name("홍길동")
               .grade("Senior")
               .phoneNumber("010-1234-1234")
               .build();

        System.out.println(student);

    }
}