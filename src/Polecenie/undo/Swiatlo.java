package Polecenie.undo;

public class Swiatlo {
    private boolean wlaczone;   // Stan światła

    public void wlacz() {
        wlaczone = true;
        System.out.println("Światło jest włączone");
    }

    public void wylacz() {
        wlaczone = false;
        System.out.println("Światło jest wyłączone");
    }

    public boolean czyWlaczone() {
        return wlaczone;
    }
}
