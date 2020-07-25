package structural.adapter.example;

public class KameraKodak implements KameraAnalogowa {
    @Override
    public void krecFilm() {
        System.out.println("Kodak nagrywa obraz analogowy");
    }
}
