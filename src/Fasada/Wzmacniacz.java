package Fasada;

public class Wzmacniacz {
    private OdtwarzaczCD odtwarzaczCD;
    private OdtwarzaczDVD odtwarzaczDVD;


    public void ustawOdtwarzaczCD(OdtwarzaczCD cd) {
        this.odtwarzaczCD = cd;
        System.out.println("Odtwarzacz CD ustawiony w wzmacniaczu");
    }

    public void ustawOdtwarzaczDVD(OdtwarzaczDVD dvd) {
        this.odtwarzaczDVD = dvd;
        System.out.println("Odtwarzacz DVD ustawiony w wzmacniaczu");
    }

    public void wlacz() {
        System.out.println("Wzmacniacz włączony");
    }

    public void wylacz() {
        System.out.println("Wzmacniacz wyłączony");
    }

    public void ustawStereo() {
        System.out.println("Wzmacniacz ustawiony na stereo");
    }

    public void ustawGlosnosc(int poziom) {
        System.out.println("Ustawianie głośności na " + poziom);
    }
}
