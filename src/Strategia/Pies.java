package Strategia;

public abstract class Pies {

    BiegnijInterface biegnijInterface;
    SzczekanieInterface szczekanieInterface;

    public Pies() {}

    private void plywaj() {
        System.out.println("Pływam");
    }

    public abstract void wyswietl();
    public void dajGlos() {
        szczekanieInterface.szczekaj();
    }

    public void biegnij() {
        biegnijInterface.biegnij();
    }

    public void ustawBieganieInterface(BiegnijInterface b) {
        biegnijInterface = b;
    }

    public void ustawSzczekanieInterface(SzczekanieInterface sz) {
        szczekanieInterface = sz;
    }

}
