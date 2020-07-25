package creational.singleton;

public class CommandStation {

    private static CommandStation station = null;

    //konstruktor prywatny
    private CommandStation(){
        System.out.println("Tworzę obiekt");
    }

    //statyczna metoda zwracająca obiekt
    public static CommandStation getInstance(){
        if (station == null) {
            station = new CommandStation();
        }
        return station;
    }


    public static void sayHello() {
        System.out.println("Hello!");
    }



}
