package Dekorator.kawiarnia;

public class Mleczko extends SkladnikDekorator {
    Napoj napoj;

    public Mleczko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {

        return napoj.pobierzOpis() + "+ Mleczko ";
    }
    @Override
    public double koszt() {

        return napoj.koszt() + 5.00;
    }
}
