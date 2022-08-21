package LambdaDenemelerim;

import java.util.Arrays;
import java.util.List;

public class Deneme004 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Sedat", Gender.MALE),
                new Person("Sadik", Gender.MALE),
                new Person("Nur", Gender.FEMALE),
                new Person("Recep", Gender.MALE),
                new Person("Merve", Gender.FEMALE)
        );



    }
}

class Person {
    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}

enum Gender {
    MALE, FEMALE;
}
