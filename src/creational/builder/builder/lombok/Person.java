package creational.builder.builder.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
class Person {
    private final String name;
    private final String age;
    private final String gender;
    private final String job;
    private final String birthday;
    private final String address;
}