package edu.praktikum.sprint8;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        fakerExamples();
        lombokExamples();
    }

    public static void fakerExamples() {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));

        System.out.println(faker.name().username());
        System.out.println(faker.name().fullName());
        System.out.println();

        System.out.println(faker.number().digit());
        System.out.println(faker.number().numberBetween(2, 100));
        System.out.println(faker.number().randomDigitNotZero());
        System.out.println();

        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println();

        System.out.println(faker.address().fullAddress());
        System.out.println(faker.address().secondaryAddress());
        System.out.println(faker.address().cityPrefix());
        System.out.println();

        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.internet().safeEmailAddress());
        System.out.println();

        System.out.println(faker.letterify("????  --  ????"));
        System.out.println(faker.numerify("####"));
        System.out.println(faker.bothify("+7 (###) ###-##-##, tg: ????????"));
        System.out.println();

        System.out.println(faker.lebowski().quote());
        System.out.println(faker.chuckNorris().fact());
    }

    public static void lombokExamples() {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));

        Courier courier = Courier.builder()
                .login(faker.name().username())
                .password(faker.internet().password(3, 10))
                .firstName(faker.name().firstName())
                .build();

        System.out.println(courier.getLogin());
        System.out.println(courier.getPassword());
        System.out.println(courier.getFirstName());
    }
}
