package structural.adapter.example;

public class Studio {

    private KameraCyfrowa kameraCyfrowa;

    public Studio(KameraCyfrowa kameraCyfrowa) {
        this.kameraCyfrowa = kameraCyfrowa;
    }

    public void krecFilm() {
        kameraCyfrowa.nagraj();
    }


}
