package creational.builder.builder.effectiveJava;

public class Main {
    public static void main(String[] args) {
       Person person = new Person.Builder("홍길동",26)
               .gender("man")
               .job("Warrior")
               .birthday("1800.10.10")
               .address("조선")
               .build();

        System.out.println(person);
    }
}