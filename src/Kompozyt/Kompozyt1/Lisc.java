package Kompozyt.Kompozyt1;

public class Lisc extends Kompozyt {

    private String nazwa;
    private double cena;

    public Lisc(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public double getCena() {
        return cena;
    }

    @Override
    public void print() {
        System.out.println("Nazwa: " + nazwa + " Cena: " + cena);
    }
}
