package creational.singleton;

import java.time.LocalDate;

public class EnumSingletonDemo {
    public static void main(String[] args) {
        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingleton s2 = EnumSingleton.INSTANCE;


        //wykonaj implementacje wzorca Singleton tak, aby
        //poniższy warunek został spełniony

        if (s1 == s2) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Niepoprawnie zaimplementowany wzorzec Singleton");
        }
    }
}
