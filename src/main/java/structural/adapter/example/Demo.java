package structural.adapter.example;

public class Demo {
    public static void main(String[] args) {
        KameraSamsung samsung = new KameraSamsung();
        KameraKodak kodak = new KameraKodak();
        KameraCyfrowaAdapter kodakAdapter = new KameraCyfrowaAdapter(kodak);
        Studio studio = new Studio(samsung);
        studio.krecFilm();
    }
}
