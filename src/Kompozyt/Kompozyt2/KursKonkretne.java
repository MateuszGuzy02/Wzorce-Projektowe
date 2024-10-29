package Kompozyt.Kompozyt2;

public class KursKonkretne extends Kurs {

    private String nazwa;
    private double cena;

    public KursKonkretne(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void print() {
        System.out.println("Kurs: " + nazwa + " Cena: " + cena);
    }

    @Override
    public double getCena() {
        return cena;
    }
}
