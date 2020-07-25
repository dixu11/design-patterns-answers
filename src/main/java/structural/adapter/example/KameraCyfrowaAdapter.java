package structural.adapter.example;

public class KameraCyfrowaAdapter implements KameraCyfrowa {

    private KameraAnalogowa analogowa;

    public KameraCyfrowaAdapter(KameraAnalogowa analogowa) {
        this.analogowa = analogowa;
    }

    @Override
    public void nagraj() {
        analogowa.krecFilm();
    }
}
