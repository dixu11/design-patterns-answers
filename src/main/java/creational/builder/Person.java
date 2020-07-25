package creational.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String fullName;
    private String mail;
    private String address;
    private LocalDate birthDate;
    private int phone;


    private Person() {

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fullName.equals(person.fullName) &&
                mail.equals(person.mail) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, mail, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", tel=" + phone +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static PersonBuilder createCustomPerson(String fullName, String mail, String address){
        return new PersonBuilder(fullName, mail, address);
    }

    public static Person createDefaultPerson(){
        return createCustomPerson("Jan", "Kowalski", "Mickiewicza 2")
                .bornIn(LocalDate.of(2000, 10, 5))
                .build();
    }




   static class PersonBuilder{

        private Person person = new Person();

        public PersonBuilder(String fullName, String mail, String address){
            person.fullName = fullName;
            person.mail = mail;
            person.address = address;
        }

       public PersonBuilder withPhone(int number) {
           person.phone = number;
           return this;
       }

       public PersonBuilder bornIn(LocalDate date){
           person.birthDate = date;
           return this;
       }

       public Person build() {
           return person;
       }
   }

}

