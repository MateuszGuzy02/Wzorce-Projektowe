package Kompozyt.Kompozyt2;

import java.util.ArrayList;
import java.util.List;

public class KategoriaKursow extends Kurs {

    private String nazwa;
    private List<Kurs> dzieci = new ArrayList<>();

    public KategoriaKursow(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void print() {
        System.out.println("Kategoria: " + nazwa);
        for (Kurs dziecko : dzieci) {
            dziecko.print();
        }
    }

    @Override
    public double getCena() {
        double sumaCen = 0;
        for (Kurs dziecko : dzieci) {
            sumaCen += dziecko.getCena();
        }
        return sumaCen;
    }

    @Override
    public void add(Kurs kurs) {
        dzieci.add(kurs);
    }

    @Override
    public void remove(Kurs kurs) {
        dzieci.remove(kurs);
    }
}
