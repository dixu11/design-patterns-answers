package creational.singleton;
import java.time.LocalDate;

public class Demo {

    public static void main(String[] args) {
        //kod po prawej stronie od '=' należy podmienić

        CommandStation.sayHello();
        System.out.println("Pobieram instancje");
        CommandStation station = CommandStation.getInstance();
        CommandStation station2 = CommandStation.getInstance();
        LocalDate dzisiaj = LocalDate.now();

        //wykonaj implementacje wzorca Singleton tak, aby
        //poniższy warunek został spełniony

        if (station == station2) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Niepoprawnie zaimplementowany wzorzec Singleton");
        }


    }
}
