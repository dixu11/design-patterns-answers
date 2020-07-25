package structural.adapter.example;

public class KameraSamsung implements KameraCyfrowa {
    @Override
    public void nagraj() {
        System.out.println("Samsung nagrywa obraz cyfrowy");
    }
}
