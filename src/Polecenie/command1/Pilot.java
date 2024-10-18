package Polecenie.command1;

public class Pilot {
    private Polecenie polecenie;

    public void ustawPolecenie(Polecenie polecenie) {
        this.polecenie = polecenie;
    }

    public void wcisnietoPrzycisk() {
        polecenie.wykonaj();
    }
}
