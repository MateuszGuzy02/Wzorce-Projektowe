package Kompozyt.Kompozyt1;

import java.util.ArrayList;
import java.util.List;

public class Wezel extends Kompozyt {
    private String nazwa;
    private List<Kompozyt> dzieci = new ArrayList<>();

    public Wezel(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public double getCena() {
        double sumaCen = 0;
        for(Kompozyt dziecko : dzieci) {
            sumaCen += dziecko.getCena();
        }
        return sumaCen;
    }

    @Override
    public void add(Kompozyt kompozyt) {
        dzieci.add(kompozyt);
    }

    @Override
    public void remove(Kompozyt kompozyt) {
        dzieci.remove(kompozyt);
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void print() {
        System.out.println("Wezel: " + nazwa + " Suma cen: " + getCena() + "\n");
        for(Kompozyt dziecko : dzieci) {
            dziecko.print();
        }
        System.out.println("\n");
    }
}
