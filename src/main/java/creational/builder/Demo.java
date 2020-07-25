package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Test");

        /*Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/

        Person person = new Person.PersonBuilder("Anna Markowska", "a.markowska22",
                "Wojska Polskiego 2")
                .bornIn(LocalDate.now().minusYears(18))
                .withPhone(1234567)
                .build();


        Person person2 =Person.createCustomPerson("aa","bb","cc")
                .build();

        Person person3 = Person.createDefaultPerson();

        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);

        String tekst = "bla";


    }

}

